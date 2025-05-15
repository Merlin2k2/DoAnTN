package com.BMT_Shop.projection.inventory;

import com.BMT_Shop.entity.inventory.DocketVariant;
import com.BMT_Shop.entity.product.Product;
import lombok.Data;

import java.util.List;

@Data
public class ProductInventory {
    private Product product;
    private List<DocketVariant> transactions;
    private Integer inventory;
    private Integer waitingForDelivery;
    private Integer canBeSold;
    private Integer areComing;
}
