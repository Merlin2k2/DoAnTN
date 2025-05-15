package com.BMT_Shop.repository.general;

import com.BMT_Shop.entity.general.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ImageRepository extends JpaRepository<Image, Long>, JpaSpecificationExecutor<Image> {}
