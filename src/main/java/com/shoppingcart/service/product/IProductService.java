package com.shoppingcart.service.product;

import com.shoppingcart.model.Product;
import com.shoppingcart.request.AddProductRequest;

import java.util.List;

public interface IProductService {

    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    void updateProduct(Product product,Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategoryName(String category);
    List<Product> getProductsByCBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category,String brand);
    List<Product> getProductByName(String name);
    List<Product> getProductsByCategoryNameAndName(String category, String name);

    List<Product> getProductsByBrandAndName(String category, String brand);
    Long countProductsByBrandAndName(String brand, String Name);





}
