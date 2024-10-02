package com.shoppingcart.request;

import com.shoppingcart.model.Category;
import com.shoppingcart.model.Image;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductUpdateRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;           // its more precision in mathematics operations
    private int inventory;          // number of products remaining in the stock after user has ordered
    private String description;
    private Category category;
    private List<Image> images;         // Image

}
