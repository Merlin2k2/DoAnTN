package com.BMT_Shop.controller.order;

import com.BMT_Shop.constant.AppConstants;
import com.BMT_Shop.dto.order.OrderVariantKeyRequest;
import com.BMT_Shop.entity.order.OrderVariantKey;
import com.BMT_Shop.service.inventory.OrderVariantService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/order-variants")
@AllArgsConstructor
@CrossOrigin(AppConstants.FRONTEND_HOST)
public class OrderVariantController {

    private OrderVariantService orderVariantService;

    @DeleteMapping("/{orderId}/{variantId}")
    public ResponseEntity<Void> deleteOrderVariant(@PathVariable("orderId") Long orderId,
                                                   @PathVariable("variantId") Long variantId) {
        OrderVariantKey id = new OrderVariantKey(orderId, variantId);
        orderVariantService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteOrderVariants(@RequestBody List<OrderVariantKeyRequest> idRequests) {
        List<OrderVariantKey> ids = idRequests.stream()
                .map(idRequest -> new OrderVariantKey(idRequest.getOrderId(), idRequest.getVariantId()))
                .collect(Collectors.toList());
        orderVariantService.delete(ids);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
