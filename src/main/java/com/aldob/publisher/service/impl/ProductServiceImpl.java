package com.aldob.publisher.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.aldob.publisher.dto.ProductDTO;
import com.aldob.publisher.mapper.ProductMapper;
import com.aldob.publisher.repository.ProductRepository;
import com.aldob.publisher.service.ProductService;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Autowired
    private final ProductRepository productRepository;

    @Autowired
    private final ProductMapper productMapper;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public List<ProductDTO> findAll() {
        List<ProductDTO> products = productRepository.findAll().stream()
                .map(productMapper::toDTO)
                .collect(Collectors.toList());

        products.forEach(product -> {
            String jsonProduct = productMapper.toJson(product);
            kafkaTemplate.send("product-topic", jsonProduct);
        });

        return products;
    }
}
