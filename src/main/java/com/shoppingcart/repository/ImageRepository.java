package com.shoppingcart.repository;

import com.shoppingcart.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{
//    Image getImageById(Long imageId);
}
