package com.BMT_Shop.controller;

import com.BMT_Shop.constant.ResourceName;
import com.BMT_Shop.constant.SearchFields;
import com.BMT_Shop.dto.address.AddressRequest;
import com.BMT_Shop.dto.address.AddressResponse;
import com.BMT_Shop.dto.address.DistrictRequest;
import com.BMT_Shop.dto.address.DistrictResponse;
import com.BMT_Shop.dto.address.ProvinceRequest;
import com.BMT_Shop.dto.address.ProvinceResponse;
import com.BMT_Shop.dto.address.WardRequest;
import com.BMT_Shop.dto.address.WardResponse;
import com.BMT_Shop.dto.authentication.RoleRequest;
import com.BMT_Shop.dto.authentication.RoleResponse;
import com.BMT_Shop.dto.authentication.UserRequest;
import com.BMT_Shop.dto.authentication.UserResponse;
import com.BMT_Shop.dto.cashbook.PaymentMethodRequest;
import com.BMT_Shop.dto.cashbook.PaymentMethodResponse;
import com.BMT_Shop.dto.customer.CustomerGroupRequest;
import com.BMT_Shop.dto.customer.CustomerGroupResponse;
import com.BMT_Shop.dto.customer.CustomerRequest;
import com.BMT_Shop.dto.customer.CustomerResourceRequest;
import com.BMT_Shop.dto.customer.CustomerResourceResponse;
import com.BMT_Shop.dto.customer.CustomerResponse;
import com.BMT_Shop.dto.customer.CustomerStatusRequest;
import com.BMT_Shop.dto.customer.CustomerStatusResponse;
import com.BMT_Shop.dto.general.ImageRequest;
import com.BMT_Shop.dto.general.ImageResponse;
import com.BMT_Shop.dto.inventory.CountRequest;
import com.BMT_Shop.dto.inventory.CountResponse;
import com.BMT_Shop.dto.inventory.DestinationRequest;
import com.BMT_Shop.dto.inventory.DestinationResponse;
import com.BMT_Shop.dto.inventory.DocketReasonRequest;
import com.BMT_Shop.dto.inventory.DocketReasonResponse;
import com.BMT_Shop.dto.inventory.DocketRequest;
import com.BMT_Shop.dto.inventory.DocketResponse;
import com.BMT_Shop.dto.inventory.ProductInventoryLimitRequest;
import com.BMT_Shop.dto.inventory.ProductInventoryLimitResponse;
import com.BMT_Shop.dto.inventory.PurchaseOrderRequest;
import com.BMT_Shop.dto.inventory.PurchaseOrderResponse;
import com.BMT_Shop.dto.inventory.StorageLocationRequest;
import com.BMT_Shop.dto.inventory.StorageLocationResponse;
import com.BMT_Shop.dto.inventory.TransferRequest;
import com.BMT_Shop.dto.inventory.TransferResponse;
import com.BMT_Shop.dto.inventory.VariantInventoryLimitRequest;
import com.BMT_Shop.dto.inventory.VariantInventoryLimitResponse;
import com.BMT_Shop.dto.inventory.WarehouseRequest;
import com.BMT_Shop.dto.inventory.WarehouseResponse;
import com.BMT_Shop.dto.order.OrderCancellationReasonRequest;
import com.BMT_Shop.dto.order.OrderCancellationReasonResponse;
import com.BMT_Shop.dto.order.OrderRequest;
import com.BMT_Shop.dto.order.OrderResourceRequest;
import com.BMT_Shop.dto.order.OrderResourceResponse;
import com.BMT_Shop.dto.order.OrderResponse;
import com.BMT_Shop.dto.product.BrandRequest;
import com.BMT_Shop.dto.product.BrandResponse;
import com.BMT_Shop.dto.product.CategoryRequest;
import com.BMT_Shop.dto.product.CategoryResponse;
import com.BMT_Shop.dto.product.GuaranteeRequest;
import com.BMT_Shop.dto.product.GuaranteeResponse;
import com.BMT_Shop.dto.product.ProductRequest;
import com.BMT_Shop.dto.product.ProductResponse;
import com.BMT_Shop.dto.product.PropertyRequest;
import com.BMT_Shop.dto.product.PropertyResponse;
import com.BMT_Shop.dto.product.SpecificationRequest;
import com.BMT_Shop.dto.product.SpecificationResponse;
import com.BMT_Shop.dto.product.SupplierRequest;
import com.BMT_Shop.dto.product.SupplierResponse;
import com.BMT_Shop.dto.product.TagRequest;
import com.BMT_Shop.dto.product.TagResponse;
import com.BMT_Shop.dto.product.UnitRequest;
import com.BMT_Shop.dto.product.UnitResponse;
import com.BMT_Shop.dto.product.VariantRequest;
import com.BMT_Shop.dto.product.VariantResponse;
import com.BMT_Shop.dto.promotion.PromotionRequest;
import com.BMT_Shop.dto.promotion.PromotionResponse;
import com.BMT_Shop.dto.review.ReviewRequest;
import com.BMT_Shop.dto.review.ReviewResponse;
import com.BMT_Shop.dto.waybill.WaybillRequest;
import com.BMT_Shop.dto.waybill.WaybillResponse;
import com.BMT_Shop.entity.address.Address;
import com.BMT_Shop.entity.address.District;
import com.BMT_Shop.entity.address.Ward;
import com.BMT_Shop.entity.authentication.Role;
import com.BMT_Shop.entity.authentication.User;
import com.BMT_Shop.entity.cashbook.PaymentMethod;
import com.BMT_Shop.entity.customer.Customer;
import com.BMT_Shop.entity.customer.CustomerGroup;
import com.BMT_Shop.entity.customer.CustomerResource;
import com.BMT_Shop.entity.customer.CustomerStatus;
import com.BMT_Shop.entity.general.Image;
import com.BMT_Shop.entity.inventory.Count;
import com.BMT_Shop.entity.inventory.Destination;
import com.BMT_Shop.entity.inventory.DocketReason;
import com.BMT_Shop.entity.inventory.ProductInventoryLimit;
import com.BMT_Shop.entity.inventory.PurchaseOrder;
import com.BMT_Shop.entity.inventory.StorageLocation;
import com.BMT_Shop.entity.inventory.Transfer;
import com.BMT_Shop.entity.inventory.VariantInventoryLimit;
import com.BMT_Shop.entity.inventory.Warehouse;
import com.BMT_Shop.entity.order.Order;
import com.BMT_Shop.entity.order.OrderCancellationReason;
import com.BMT_Shop.entity.order.OrderResource;
import com.BMT_Shop.entity.product.Brand;
import com.BMT_Shop.entity.product.Category;
import com.BMT_Shop.entity.product.Guarantee;
import com.BMT_Shop.entity.product.Product;
import com.BMT_Shop.entity.product.Property;
import com.BMT_Shop.entity.product.Specification;
import com.BMT_Shop.entity.product.Supplier;
import com.BMT_Shop.entity.product.Tag;
import com.BMT_Shop.entity.product.Unit;
import com.BMT_Shop.entity.product.Variant;
import com.BMT_Shop.mapper.address.AddressMapper;
import com.BMT_Shop.mapper.address.DistrictMapper;
import com.BMT_Shop.mapper.address.WardMapper;
import com.BMT_Shop.mapper.authentication.RoleMapper;
import com.BMT_Shop.mapper.authentication.UserMapper;
import com.BMT_Shop.mapper.cashbook.PaymentMethodMapper;
import com.BMT_Shop.mapper.customer.CustomerGroupMapper;
import com.BMT_Shop.mapper.customer.CustomerMapper;
import com.BMT_Shop.mapper.customer.CustomerResourceMapper;
import com.BMT_Shop.mapper.customer.CustomerStatusMapper;
import com.BMT_Shop.mapper.general.ImageMapper;
import com.BMT_Shop.mapper.inventory.CountMapper;
import com.BMT_Shop.mapper.inventory.DestinationMapper;
import com.BMT_Shop.mapper.inventory.DocketReasonMapper;
import com.BMT_Shop.mapper.inventory.ProductInventoryLimitMapper;
import com.BMT_Shop.mapper.inventory.PurchaseOrderMapper;
import com.BMT_Shop.mapper.inventory.StorageLocationMapper;
import com.BMT_Shop.mapper.inventory.TransferMapper;
import com.BMT_Shop.mapper.inventory.VariantInventoryLimitMapper;
import com.BMT_Shop.mapper.inventory.WarehouseMapper;
import com.BMT_Shop.mapper.order.OrderCancellationReasonMapper;
import com.BMT_Shop.mapper.order.OrderMapper;
import com.BMT_Shop.mapper.order.OrderResourceMapper;
import com.BMT_Shop.mapper.product.BrandMapper;
import com.BMT_Shop.mapper.product.CategoryMapper;
import com.BMT_Shop.mapper.product.GuaranteeMapper;
import com.BMT_Shop.mapper.product.ProductMapper;
import com.BMT_Shop.mapper.product.PropertyMapper;
import com.BMT_Shop.mapper.product.SpecificationMapper;
import com.BMT_Shop.mapper.product.SupplierMapper;
import com.BMT_Shop.mapper.product.TagMapper;
import com.BMT_Shop.mapper.product.UnitMapper;
import com.BMT_Shop.mapper.product.VariantMapper;
import com.BMT_Shop.repository.address.AddressRepository;
import com.BMT_Shop.repository.address.DistrictRepository;
import com.BMT_Shop.repository.address.WardRepository;
import com.BMT_Shop.repository.authentication.RoleRepository;
import com.BMT_Shop.repository.authentication.UserRepository;
import com.BMT_Shop.repository.cashbook.PaymentMethodRepository;
import com.BMT_Shop.repository.customer.CustomerGroupRepository;
import com.BMT_Shop.repository.customer.CustomerRepository;
import com.BMT_Shop.repository.customer.CustomerResourceRepository;
import com.BMT_Shop.repository.customer.CustomerStatusRepository;
import com.BMT_Shop.repository.general.ImageRepository;
import com.BMT_Shop.repository.inventory.CountRepository;
import com.BMT_Shop.repository.inventory.DestinationRepository;
import com.BMT_Shop.repository.inventory.DocketReasonRepository;
import com.BMT_Shop.repository.inventory.ProductInventoryLimitRepository;
import com.BMT_Shop.repository.inventory.PurchaseOrderRepository;
import com.BMT_Shop.repository.inventory.StorageLocationRepository;
import com.BMT_Shop.repository.inventory.TransferRepository;
import com.BMT_Shop.repository.inventory.VariantInventoryLimitRepository;
import com.BMT_Shop.repository.inventory.WarehouseRepository;
import com.BMT_Shop.repository.order.OrderCancellationReasonRepository;
import com.BMT_Shop.repository.order.OrderRepository;
import com.BMT_Shop.repository.order.OrderResourceRepository;
import com.BMT_Shop.repository.product.BrandRepository;
import com.BMT_Shop.repository.product.CategoryRepository;
import com.BMT_Shop.repository.product.GuaranteeRepository;
import com.BMT_Shop.repository.product.ProductRepository;
import com.BMT_Shop.repository.product.PropertyRepository;
import com.BMT_Shop.repository.product.SpecificationRepository;
import com.BMT_Shop.repository.product.SupplierRepository;
import com.BMT_Shop.repository.product.TagRepository;
import com.BMT_Shop.repository.product.UnitRepository;
import com.BMT_Shop.repository.product.VariantRepository;
import com.BMT_Shop.service.CrudService;
import com.BMT_Shop.service.GenericService;
import com.BMT_Shop.service.address.ProvinceService;
import com.BMT_Shop.service.inventory.DocketService;
import com.BMT_Shop.service.promotion.PromotionService;
import com.BMT_Shop.service.review.ReviewService;
import com.BMT_Shop.service.waybill.WaybillService;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.util.pattern.PathPatternParser;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@AllArgsConstructor
public class GenericMappingRegister {

    private ApplicationContext context;
    private RequestMappingHandlerMapping handlerMapping;

    // Controllers
    private GenericController<ProvinceRequest, ProvinceResponse> provinceController;
    private GenericController<DistrictRequest, DistrictResponse> districtController;
    private GenericController<WardRequest, WardResponse> wardController;
    private GenericController<AddressRequest, AddressResponse> addressController;
    private GenericController<UserRequest, UserResponse> userController;
    private GenericController<RoleRequest, RoleResponse> roleController;
    private GenericController<CustomerGroupRequest, CustomerGroupResponse> customerGroupController;
    private GenericController<CustomerResourceRequest, CustomerResourceResponse> customerResourceController;
    private GenericController<CustomerStatusRequest, CustomerStatusResponse> customerStatusController;
    private GenericController<CustomerRequest, CustomerResponse> customerController;
    private GenericController<PropertyRequest, PropertyResponse> propertyController;
    private GenericController<CategoryRequest, CategoryResponse> categoryController;
    private GenericController<TagRequest, TagResponse> tagController;
    private GenericController<GuaranteeRequest, GuaranteeResponse> guaranteeController;
    private GenericController<UnitRequest, UnitResponse> unitController;
    private GenericController<SupplierRequest, SupplierResponse> supplierController;
    private GenericController<BrandRequest, BrandResponse> brandController;
    private GenericController<SpecificationRequest, SpecificationResponse> specificationController;
    private GenericController<ProductRequest, ProductResponse> productController;
    private GenericController<VariantRequest, VariantResponse> variantController;
    private GenericController<ImageRequest, ImageResponse> imageController;
    private GenericController<ProductInventoryLimitRequest, ProductInventoryLimitResponse> productInventoryLimitController;
    private GenericController<VariantInventoryLimitRequest, VariantInventoryLimitResponse> variantInventoryLimitController;
    private GenericController<WarehouseRequest, WarehouseResponse> warehouseController;
    private GenericController<CountRequest, CountResponse> countController;
    private GenericController<DestinationRequest, DestinationResponse> destinationController;
    private GenericController<DocketReasonRequest, DocketReasonResponse> docketReasonController;
    private GenericController<TransferRequest, TransferResponse> transferController;
    private GenericController<DocketRequest, DocketResponse> docketController;
    private GenericController<StorageLocationRequest, StorageLocationResponse> storageLocationController;
    private GenericController<PurchaseOrderRequest, PurchaseOrderResponse> purchaseOrderController;
    private GenericController<OrderResourceRequest, OrderResourceResponse> orderResourceController;
    private GenericController<OrderCancellationReasonRequest, OrderCancellationReasonResponse> orderCancellationReasonController;
    private GenericController<OrderRequest, OrderResponse> orderController;
    private GenericController<WaybillRequest, WaybillResponse> waybillController;
    private GenericController<ReviewRequest, ReviewResponse> reviewController;
    private GenericController<PaymentMethodRequest, PaymentMethodResponse> paymentMethodController;
    private GenericController<PromotionRequest, PromotionResponse> promotionController;

    // Services
    private GenericService<District, DistrictRequest, DistrictResponse> districtService;
    private GenericService<Ward, WardRequest, WardResponse> wardService;
    private GenericService<Address, AddressRequest, AddressResponse> addressService;
    private GenericService<User, UserRequest, UserResponse> userService;
    private GenericService<Role, RoleRequest, RoleResponse> roleService;
    private GenericService<CustomerGroup, CustomerGroupRequest, CustomerGroupResponse> customerGroupService;
    private GenericService<CustomerResource, CustomerResourceRequest, CustomerResourceResponse> customerResourceService;
    private GenericService<CustomerStatus, CustomerStatusRequest, CustomerStatusResponse> customerStatusService;
    private GenericService<Customer, CustomerRequest, CustomerResponse> customerService;
    private GenericService<Property, PropertyRequest, PropertyResponse> propertyService;
    private GenericService<Category, CategoryRequest, CategoryResponse> categoryService;
    private GenericService<Tag, TagRequest, TagResponse> tagService;
    private GenericService<Guarantee, GuaranteeRequest, GuaranteeResponse> guaranteeService;
    private GenericService<Unit, UnitRequest, UnitResponse> unitService;
    private GenericService<Supplier, SupplierRequest, SupplierResponse> supplierService;
    private GenericService<Brand, BrandRequest, BrandResponse> brandService;
    private GenericService<Specification, SpecificationRequest, SpecificationResponse> specificationService;
    private GenericService<Product, ProductRequest, ProductResponse> productService;
    private GenericService<Variant, VariantRequest, VariantResponse> variantService;
    private GenericService<Image, ImageRequest, ImageResponse> imageService;
    private GenericService<ProductInventoryLimit, ProductInventoryLimitRequest, ProductInventoryLimitResponse> productInventoryLimitService;
    private GenericService<VariantInventoryLimit, VariantInventoryLimitRequest, VariantInventoryLimitResponse> variantInventoryLimitService;
    private GenericService<Warehouse, WarehouseRequest, WarehouseResponse> warehouseService;
    private GenericService<Count, CountRequest, CountResponse> countService;
    private GenericService<Destination, DestinationRequest, DestinationResponse> destinationService;
    private GenericService<DocketReason, DocketReasonRequest, DocketReasonResponse> docketReasonService;
    private GenericService<Transfer, TransferRequest, TransferResponse> transferService;
    private GenericService<StorageLocation, StorageLocationRequest, StorageLocationResponse> storageLocationService;
    private GenericService<PurchaseOrder, PurchaseOrderRequest, PurchaseOrderResponse> purchaseOrderService;
    private GenericService<OrderResource, OrderResourceRequest, OrderResourceResponse> orderResourceService;
    private GenericService<OrderCancellationReason, OrderCancellationReasonRequest, OrderCancellationReasonResponse> orderCancellationReasonService;
    private GenericService<Order, OrderRequest, OrderResponse> orderService;
    private GenericService<PaymentMethod, PaymentMethodRequest, PaymentMethodResponse> paymentMethodService;

    @PostConstruct
    public void registerControllers() throws NoSuchMethodException {

        register("provinces", provinceController, context.getBean(ProvinceService.class), ProvinceRequest.class);

        register("districts", districtController, districtService.init(
                context.getBean(DistrictRepository.class),
                context.getBean(DistrictMapper.class),
                SearchFields.DISTRICT,
                ResourceName.DISTRICT
        ), DistrictRequest.class);

        register("wards", wardController, wardService.init(
                context.getBean(WardRepository.class),
                context.getBean(WardMapper.class),
                SearchFields.WARD,
                ResourceName.WARD
        ), WardRequest.class);

        register("addresses", addressController, addressService.init(
                context.getBean(AddressRepository.class),
                context.getBean(AddressMapper.class),
                SearchFields.ADDRESS,
                ResourceName.ADDRESS
        ), AddressRequest.class);

        register("users", userController, userService.init(
                context.getBean(UserRepository.class),
                context.getBean(UserMapper.class),
                SearchFields.USER,
                ResourceName.USER
        ), UserRequest.class);

        register("roles", roleController, roleService.init(
                context.getBean(RoleRepository.class),
                context.getBean(RoleMapper.class),
                SearchFields.ROLE,
                ResourceName.ROLE
        ), RoleRequest.class);

        register("customer-groups", customerGroupController, customerGroupService.init(
                context.getBean(CustomerGroupRepository.class),
                context.getBean(CustomerGroupMapper.class),
                SearchFields.CUSTOMER_GROUP,
                ResourceName.CUSTOMER_GROUP
        ), CustomerGroupRequest.class);

        register("customer-resources", customerResourceController, customerResourceService.init(
                context.getBean(CustomerResourceRepository.class),
                context.getBean(CustomerResourceMapper.class),
                SearchFields.CUSTOMER_RESOURCE,
                ResourceName.CUSTOMER_RESOURCE
        ), CustomerResourceRequest.class);

        register("customer-status", customerStatusController, customerStatusService.init(
                context.getBean(CustomerStatusRepository.class),
                context.getBean(CustomerStatusMapper.class),
                SearchFields.CUSTOMER_STATUS,
                ResourceName.CUSTOMER_STATUS
        ), CustomerStatusRequest.class);

        register("customers", customerController, customerService.init(
                context.getBean(CustomerRepository.class),
                context.getBean(CustomerMapper.class),
                SearchFields.CUSTOMER,
                ResourceName.CUSTOMER
        ), CustomerRequest.class);

        register("properties", propertyController, propertyService.init(
                context.getBean(PropertyRepository.class),
                context.getBean(PropertyMapper.class),
                SearchFields.PROPERTY,
                ResourceName.PROPERTY
        ), PropertyRequest.class);

        register("categories", categoryController, categoryService.init(
                context.getBean(CategoryRepository.class),
                context.getBean(CategoryMapper.class),
                SearchFields.CATEGORY,
                ResourceName.CATEGORY
        ), CategoryRequest.class);

        register("tags", tagController, tagService.init(
                context.getBean(TagRepository.class),
                context.getBean(TagMapper.class),
                SearchFields.TAG,
                ResourceName.TAG
        ), TagRequest.class);

        register("guarantees", guaranteeController, guaranteeService.init(
                context.getBean(GuaranteeRepository.class),
                context.getBean(GuaranteeMapper.class),
                SearchFields.GUARANTEE,
                ResourceName.GUARANTEE
        ), GuaranteeRequest.class);

        register("units", unitController, unitService.init(
                context.getBean(UnitRepository.class),
                context.getBean(UnitMapper.class),
                SearchFields.UNIT,
                ResourceName.UNIT
        ), UnitRequest.class);

        register("suppliers", supplierController, supplierService.init(
                context.getBean(SupplierRepository.class),
                context.getBean(SupplierMapper.class),
                SearchFields.SUPPLIER,
                ResourceName.SUPPLIER
        ), SupplierRequest.class);

        register("brands", brandController, brandService.init(
                context.getBean(BrandRepository.class),
                context.getBean(BrandMapper.class),
                SearchFields.BRAND,
                ResourceName.BRAND
        ), BrandRequest.class);

        register("specifications", specificationController, specificationService.init(
                context.getBean(SpecificationRepository.class),
                context.getBean(SpecificationMapper.class),
                SearchFields.SPECIFICATION,
                ResourceName.SPECIFICATION
        ), SpecificationRequest.class);

        register("products", productController, productService.init(
                context.getBean(ProductRepository.class),
                context.getBean(ProductMapper.class),
                SearchFields.PRODUCT,
                ResourceName.PRODUCT
        ), ProductRequest.class);

        register("variants", variantController, variantService.init(
                context.getBean(VariantRepository.class),
                context.getBean(VariantMapper.class),
                SearchFields.VARIANT,
                ResourceName.VARIANT
        ), VariantRequest.class);

        register("images", imageController, imageService.init(
                context.getBean(ImageRepository.class),
                context.getBean(ImageMapper.class),
                SearchFields.IMAGE,
                ResourceName.IMAGE
        ), ImageRequest.class);

        register("product-inventory-limits", productInventoryLimitController, productInventoryLimitService.init(
                context.getBean(ProductInventoryLimitRepository.class),
                context.getBean(ProductInventoryLimitMapper.class),
                SearchFields.PRODUCT_INVENTORY_LIMIT,
                ResourceName.PRODUCT_INVENTORY_LIMIT
        ), ProductInventoryLimitRequest.class);

        register("variant-inventory-limits", variantInventoryLimitController, variantInventoryLimitService.init(
                context.getBean(VariantInventoryLimitRepository.class),
                context.getBean(VariantInventoryLimitMapper.class),
                SearchFields.VARIANT_INVENTORY_LIMIT,
                ResourceName.VARIANT_INVENTORY_LIMIT
        ), VariantInventoryLimitRequest.class);

        register("warehouses", warehouseController, warehouseService.init(
                context.getBean(WarehouseRepository.class),
                context.getBean(WarehouseMapper.class),
                SearchFields.WAREHOUSE,
                ResourceName.WAREHOUSE
        ), WarehouseRequest.class);

        register("counts", countController, countService.init(
                context.getBean(CountRepository.class),
                context.getBean(CountMapper.class),
                SearchFields.COUNT,
                ResourceName.COUNT
        ), CountRequest.class);

        register("destinations", destinationController, destinationService.init(
                context.getBean(DestinationRepository.class),
                context.getBean(DestinationMapper.class),
                SearchFields.DESTINATION,
                ResourceName.DESTINATION
        ), DestinationRequest.class);

        register("docket-reasons", docketReasonController, docketReasonService.init(
                context.getBean(DocketReasonRepository.class),
                context.getBean(DocketReasonMapper.class),
                SearchFields.DOCKET_REASON,
                ResourceName.DOCKET_REASON
        ), DocketReasonRequest.class);

        register("transfers", transferController, transferService.init(
                context.getBean(TransferRepository.class),
                context.getBean(TransferMapper.class),
                SearchFields.TRANSFER,
                ResourceName.TRANSFER
        ), TransferRequest.class);

        register("dockets", docketController, context.getBean(DocketService.class), DocketRequest.class);

        register("storage-locations", storageLocationController, storageLocationService.init(
                context.getBean(StorageLocationRepository.class),
                context.getBean(StorageLocationMapper.class),
                SearchFields.STORAGE_LOCATION,
                ResourceName.STORAGE_LOCATION
        ), StorageLocationRequest.class);

        register("purchase-orders", purchaseOrderController, purchaseOrderService.init(
                context.getBean(PurchaseOrderRepository.class),
                context.getBean(PurchaseOrderMapper.class),
                SearchFields.PURCHASE_ORDER,
                ResourceName.PURCHASE_ORDER
        ), PurchaseOrderRequest.class);

        register("order-resources", orderResourceController, orderResourceService.init(
                context.getBean(OrderResourceRepository.class),
                context.getBean(OrderResourceMapper.class),
                SearchFields.ORDER_RESOURCE,
                ResourceName.ORDER_RESOURCE
        ), OrderResourceRequest.class);

        register("order-cancellation-reasons", orderCancellationReasonController, orderCancellationReasonService.init(
                context.getBean(OrderCancellationReasonRepository.class),
                context.getBean(OrderCancellationReasonMapper.class),
                SearchFields.ORDER_CANCELLATION_REASON,
                ResourceName.ORDER_CANCELLATION_REASON
        ), OrderCancellationReasonRequest.class);

        register("orders", orderController, orderService.init(
                context.getBean(OrderRepository.class),
                context.getBean(OrderMapper.class),
                SearchFields.ORDER,
                ResourceName.ORDER
        ), OrderRequest.class);

        register("waybills", waybillController, context.getBean(WaybillService.class), WaybillRequest.class);

        register("reviews", reviewController, context.getBean(ReviewService.class), ReviewRequest.class);

        register("payment-methods", paymentMethodController, paymentMethodService.init(
                context.getBean(PaymentMethodRepository.class),
                context.getBean(PaymentMethodMapper.class),
                SearchFields.PAYMENT_METHOD,
                ResourceName.PAYMENT_METHOD
        ), PaymentMethodRequest.class);

        register("promotions", promotionController, context.getBean(PromotionService.class), PromotionRequest.class);
    }

    private <I, O> void register(String resource,
                                 GenericController<I, O> controller,
                                 CrudService<Long, I, O> service,
                                 Class<I> requestType
    ) throws NoSuchMethodException {
        RequestMappingInfo.BuilderConfiguration options = new RequestMappingInfo.BuilderConfiguration();
        options.setPatternParser(new PathPatternParser());

        controller.setCrudService(service);
        controller.setRequestType(requestType);

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.GET)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("getAllResources", int.class, int.class,
                        String.class, String.class, String.class, boolean.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.GET)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("getResource", Long.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.POST)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("createResource", JsonNode.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.PUT)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("updateResource", Long.class, JsonNode.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.DELETE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("deleteResource", Long.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.DELETE)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("deleteResources", List.class)
        );
    }

}
