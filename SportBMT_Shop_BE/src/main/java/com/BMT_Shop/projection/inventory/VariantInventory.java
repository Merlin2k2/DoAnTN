package com.BMT_Shop.projection.inventory;

import com.BMT_Shop.entity.inventory.DocketVariant;
import com.BMT_Shop.entity.product.Variant;
import lombok.Data;

import java.util.List;

@Data
public class VariantInventory {
    private Variant variant;
    private List<DocketVariant> transactions;
    private Integer inventory;
    private Integer waitingForDelivery;
    private Integer canBeSold;
    private Integer areComing;
}
