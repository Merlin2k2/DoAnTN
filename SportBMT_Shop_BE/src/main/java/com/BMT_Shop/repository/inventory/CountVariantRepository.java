package com.BMT_Shop.repository.inventory;

import com.BMT_Shop.entity.inventory.CountVariant;
import com.BMT_Shop.entity.inventory.CountVariantKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CountVariantRepository extends JpaRepository<CountVariant, CountVariantKey>,
        JpaSpecificationExecutor<CountVariant> {}
