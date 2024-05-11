package com.aldob.publisher.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class ProductEntity {

    @Id
    private Long id;
    private String product;
    private String status;
    private int stock;
    private int code;

}
