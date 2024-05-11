package com.aldob.publisher.mapper;

import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.aldob.publisher.dto.ProductDTO;
import com.aldob.publisher.entity.ProductEntity;

@Component
public class ProductMapper {

    public ProductDTO toDTO(ProductEntity productEntity){
        ProductDTO dto = new ProductDTO();
        dto.setId(productEntity.getId());
        dto.setProduct(productEntity.getProduct());
        dto.setStatus(productEntity.getStatus());
        dto.setStock(productEntity.getStock());
        dto.setCode(productEntity.getCode());
        return dto;
    }

    public String toJson(ProductDTO product) {
        ObjectMapper mapper = new ObjectMapper();
        String jsonProduct = "";
        try {
            jsonProduct = mapper.writeValueAsString(product);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonProduct;
    }

}
