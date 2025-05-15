package com.BMT_Shop.mapper.client;

import com.BMT_Shop.dto.client.ClientPreorderRequest;
import com.BMT_Shop.dto.client.ClientPreorderResponse;
import com.BMT_Shop.entity.client.Preorder;
import com.BMT_Shop.repository.authentication.UserRepository;
import com.BMT_Shop.repository.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Collections;

@Component
@AllArgsConstructor
public class ClientPreorderMapper {

    private UserRepository userRepository;
    private ProductRepository productRepository;
    private ClientProductMapper clientProductMapper;

    public Preorder requestToEntity(ClientPreorderRequest request) {
        Preorder entity = new Preorder();
        entity.setUser(userRepository.getById(request.getUserId()));
        entity.setProduct(productRepository.getById(request.getProductId()));
        entity.setStatus(request.getStatus());
        return entity;
    }

    public ClientPreorderResponse entityToResponse(Preorder entity) {
        ClientPreorderResponse response = new ClientPreorderResponse();
        response.setPreorderId(entity.getId());
        response.setPreorderCreatedAt(entity.getCreatedAt());
        response.setPreorderUpdatedAt(entity.getUpdatedAt());
        // TODO: Triển khai `saleable` cho productResponse ở đây
        response.setPreorderProduct(clientProductMapper.entityToListedResponse(entity.getProduct(), Collections.emptyList()));
        response.setPreorderStatus(entity.getStatus());
        return response;
    }

    public Preorder partialUpdate(Preorder entity, ClientPreorderRequest request) {
        entity.setUpdatedAt(Instant.now());
        entity.setStatus(request.getStatus());
        return entity;
    }

}
