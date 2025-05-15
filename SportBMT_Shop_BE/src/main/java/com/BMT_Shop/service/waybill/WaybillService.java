package com.BMT_Shop.service.waybill;

import com.BMT_Shop.dto.waybill.GhnCallbackOrderRequest;
import com.BMT_Shop.dto.waybill.WaybillRequest;
import com.BMT_Shop.dto.waybill.WaybillResponse;
import com.BMT_Shop.service.CrudService;

public interface WaybillService extends CrudService<Long, WaybillRequest, WaybillResponse> {

    void callbackStatusWaybillFromGHN(GhnCallbackOrderRequest ghnCallbackOrderRequest);

}
