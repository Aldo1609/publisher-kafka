package com.aldob.publisher.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private Long id;
    private String product;
    private String status;
    private int stock;
    private int code;

}
