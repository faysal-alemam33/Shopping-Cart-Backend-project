package com.shoppingcart.service.product;

import com.shoppingcart.dto.ProductDto;
import com.shoppingcart.model.Product;
import com.shoppingcart.request.AddProductRequest;
import com.shoppingcart.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {

    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category,String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByCategoryNameAndName(String category, String name);

    List<Product> getProductsByBrandAndName(String category, String brand);
    Long countProductsByBrandAndName(String brand, String Name);


    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
}
