package com.BMT_Shop.utils;

import com.BMT_Shop.entity.BaseEntity;
import com.BMT_Shop.entity.address.District;
import com.BMT_Shop.entity.address.Province;
import com.BMT_Shop.entity.address.Ward;
import com.BMT_Shop.entity.authentication.User;
import com.BMT_Shop.entity.customer.Customer;
import com.BMT_Shop.entity.customer.CustomerGroup;
import com.BMT_Shop.entity.customer.CustomerResource;
import com.BMT_Shop.entity.customer.CustomerStatus;
import com.BMT_Shop.entity.inventory.Count;
import com.BMT_Shop.entity.inventory.CountVariantKey;
import com.BMT_Shop.entity.inventory.Destination;
import com.BMT_Shop.entity.inventory.Docket;
import com.BMT_Shop.entity.inventory.DocketReason;
import com.BMT_Shop.entity.inventory.DocketVariantKey;
import com.BMT_Shop.entity.inventory.PurchaseOrder;
import com.BMT_Shop.entity.inventory.PurchaseOrderVariantKey;
import com.BMT_Shop.entity.inventory.Warehouse;
import com.BMT_Shop.entity.order.Order;
import com.BMT_Shop.entity.order.OrderCancellationReason;
import com.BMT_Shop.entity.order.OrderResource;
import com.BMT_Shop.entity.order.OrderVariantKey;
import com.BMT_Shop.entity.product.Brand;
import com.BMT_Shop.entity.product.Category;
import com.BMT_Shop.entity.product.Guarantee;
import com.BMT_Shop.entity.product.Product;
import com.BMT_Shop.entity.product.Supplier;
import com.BMT_Shop.entity.product.Unit;
import com.BMT_Shop.entity.product.Variant;
import com.BMT_Shop.repository.address.DistrictRepository;
import com.BMT_Shop.repository.address.ProvinceRepository;
import com.BMT_Shop.repository.address.WardRepository;
import com.BMT_Shop.repository.authentication.RoleRepository;
import com.BMT_Shop.repository.authentication.UserRepository;
import com.BMT_Shop.repository.product.ProductRepository;
import com.BMT_Shop.repository.product.TagRepository;
import com.BMT_Shop.repository.product.VariantRepository;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class MapperUtils {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private TagRepository tagRepository;
    @Autowired
    private VariantRepository variantRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProvinceRepository provinceRepository;
    @Autowired
    private DistrictRepository districtRepository;
    @Autowired
    private WardRepository wardRepository;
    @Autowired
    private UserRepository userRepository;

    public Province mapToProvince(@Nullable Long id) {
        return id == null ? null : provinceRepository.getById(id);
    }

    public District mapToDistrict(@Nullable Long id) {
        return id == null ? null : districtRepository.getById(id);
    }

    public Ward mapToWard(@Nullable Long id) {
        return id == null ? null : wardRepository.getById(id);
    }

    public abstract CustomerGroup mapToCustomerGroup(Long id);

    public abstract CustomerResource mapToCustomerResource(Long id);

    public abstract CustomerStatus mapToCustomerStatus(Long id);

    public abstract Category mapToCategory(Long id);

    public abstract Brand mapToBrand(Long id);

    public abstract Supplier mapToSupplier(Long id);

    public abstract Unit mapToUnit(Long id);

    public abstract Guarantee mapToGuarantee(Long id);

    public abstract Warehouse mapToWarehouse(Long id);

    public abstract DocketReason mapToDocketReason(Long id);

    public abstract Destination mapToDestination(Long id);

    public abstract PurchaseOrder mapToPurchaseOrder(Long id);

    public abstract OrderResource mapToOrderResource(Long id);

    public abstract OrderCancellationReason mapToOrderCancellationReason(Long id);

    public abstract Customer mapToCustomer(Long id);

    public abstract Order mapToOrder(Long id);


    public Variant mapToVariant(Long id) {
        return variantRepository.getById(id);
    }

    public Product mapToProduct(Long id) {
        return productRepository.getById(id);
    }

    public User mapToUser(Long id) {
        return userRepository.getById(id);
    }

    @Named("hashPassword")
    public String hashPassword(String password) {
        return passwordEncoder.encode(password);
    }

    @AfterMapping
    @Named("attachUser")
    public User attachUser(@MappingTarget User user) {
        return user.setRoles(attachSet(user.getRoles(), roleRepository));
    }

    @AfterMapping
    @Named("attachProduct")
    public Product attachProduct(@MappingTarget Product product) {
        product.getImages().forEach(image -> image.setProduct(product));
        product.setTags(attachSet(product.getTags(), tagRepository));
        product.getVariants().forEach(variant -> variant.setProduct(product));
        return product;
    }

    @AfterMapping
    @Named("attachCount")
    public Count attachCount(@MappingTarget Count count) {
        count.getCountVariants().forEach(countVariant -> {
            countVariant.setCountVariantKey(new CountVariantKey(count.getId(), countVariant.getVariant().getId()));
            countVariant.setCount(count);
        });
        return count;
    }

    @AfterMapping
    @Named("attachOrder")
    public Order attachOrder(@MappingTarget Order order) {
        order.getOrderVariants().forEach(orderVariant -> {
            orderVariant.setOrderVariantKey(new OrderVariantKey(order.getId(), orderVariant.getVariant().getId()));
            orderVariant.setOrder(order);
        });
        return order;
    }

    @AfterMapping
    @Named("attachDocket")
    public Docket attachDocket(@MappingTarget Docket docket) {
        docket.getDocketVariants().forEach(docketVariant -> {
            docketVariant.setDocketVariantKey(new DocketVariantKey(docket.getId(), docketVariant.getVariant().getId()));
            docketVariant.setDocket(docket);
        });
        return docket;
    }

    @AfterMapping
    @Named("attachPurchaseOrder")
    public PurchaseOrder attachPurchaseOrder(@MappingTarget PurchaseOrder purchaseOrder) {
        purchaseOrder.getPurchaseOrderVariants().forEach(purchaseOrderVariant -> {
            purchaseOrderVariant.setPurchaseOrderVariantKey(
                    new PurchaseOrderVariantKey(purchaseOrder.getId(), purchaseOrderVariant.getVariant().getId()));
            purchaseOrderVariant.setPurchaseOrder(purchaseOrder);
        });
        return purchaseOrder;
    }

    private <E extends BaseEntity> Set<E> attachSet(Set<E> entities, JpaRepository<E, Long> repository) {
        Set<E> detachedSet = Optional.ofNullable(entities).orElseGet(HashSet::new);
        Set<E> attachedSet = new HashSet<>();

        for (E entity : detachedSet) {
            if (entity.getId() != null) {
                repository.findById(entity.getId()).ifPresent(attachedSet::add);
            } else {
                attachedSet.add(entity);
            }
        }

        return attachedSet;
    }

}
