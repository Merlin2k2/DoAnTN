package com.BMT_Shop.repository.product;

import com.BMT_Shop.entity.product.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface SupplierRepository extends JpaRepository<Supplier, Long>, JpaSpecificationExecutor<Supplier> {

    @Query("SELECT COUNT(s.id) FROM Supplier s")
    int countBySupplierId();

}
