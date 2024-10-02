package com.shoppingcart.model;

import com.shoppingcart.model.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileType;

    @Lob                        // indicate that a persistent property should be stored as a large object (LOB) in the databas, tells the JPA provider to treat this field as a large object.
    private Blob image;         // Blob(Binary Large Objects): data type used to store binary large objects
    private String downloadUrl;

    @ManyToOne
    @JoinColumn(name = "product_id")        // foreign key in the Image table
    private Product product;

}
