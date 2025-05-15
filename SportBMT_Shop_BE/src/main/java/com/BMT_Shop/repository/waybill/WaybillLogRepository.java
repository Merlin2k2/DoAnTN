package com.BMT_Shop.repository.waybill;

import com.BMT_Shop.entity.waybill.WaybillLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WaybillLogRepository extends JpaRepository<WaybillLog, Long>, JpaSpecificationExecutor<WaybillLog> {}
