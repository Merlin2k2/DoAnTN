package com.BMT_Shop.mapper.cashbook;

import com.BMT_Shop.dto.cashbook.ClientPaymentMethodResponse;
import com.BMT_Shop.dto.cashbook.PaymentMethodRequest;
import com.BMT_Shop.dto.cashbook.PaymentMethodResponse;
import com.BMT_Shop.entity.cashbook.PaymentMethod;
import com.BMT_Shop.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PaymentMethodMapper extends GenericMapper<PaymentMethod, PaymentMethodRequest, PaymentMethodResponse> {

    @Mapping(source = "id", target = "paymentMethodId")
    @Mapping(source = "name", target = "paymentMethodName")
    @Mapping(source = "code", target = "paymentMethodCode")
    ClientPaymentMethodResponse entityToClientResponse(PaymentMethod entity);

    List<ClientPaymentMethodResponse> entityToClientResponse(List<PaymentMethod> entities);

}
