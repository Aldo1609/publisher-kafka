package com.aldob.publisher.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import com.aldob.publisher.dto.ProductDTO;
import com.aldob.publisher.service.ProductService;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private final ProductService productService;

    @GetMapping("/products")
    public List<ProductDTO> findAll(){
        return productService.findAll();
    }

}
