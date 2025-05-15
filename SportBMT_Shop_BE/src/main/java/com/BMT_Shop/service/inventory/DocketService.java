package com.BMT_Shop.service.inventory;

import com.BMT_Shop.dto.inventory.DocketRequest;
import com.BMT_Shop.dto.inventory.DocketResponse;
import com.BMT_Shop.service.CrudService;

public interface DocketService extends CrudService<Long, DocketRequest, DocketResponse> {}
