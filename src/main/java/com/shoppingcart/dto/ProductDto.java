package com.shoppingcart.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.shoppingcart.model.Category;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto {
    @JsonProperty
    private Long id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String brand;
    @JsonProperty
    private BigDecimal price;
    @JsonProperty
    private int inventory;
    @JsonProperty
    private String description;
    @JsonProperty
    private Category category;
    @JsonProperty
    private List<ImageDto> images;
}
