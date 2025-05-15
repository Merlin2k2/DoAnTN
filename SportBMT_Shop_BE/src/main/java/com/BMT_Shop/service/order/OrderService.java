package com.BMT_Shop.service.order;

import com.BMT_Shop.dto.client.ClientConfirmedOrderResponse;
import com.BMT_Shop.dto.client.ClientSimpleOrderRequest;

public interface OrderService {

    void cancelOrder(String code);

    ClientConfirmedOrderResponse createClientOrder(ClientSimpleOrderRequest request);

    void captureTransactionPaypal(String paypalOrderId, String payerId);

}
