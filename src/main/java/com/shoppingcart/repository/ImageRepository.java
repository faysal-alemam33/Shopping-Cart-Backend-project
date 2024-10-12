package com.shoppingcart.repository;

import com.shoppingcart.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{
    List<Image> findByProductId(Long id);
//    Image getImageById(Long imageId);
}
