package com.dksapp.productcategoriesfakestoreimpl.services;

import com.dksapp.productcategoriesfakestoreimpl.dtos.ProductDto;
import com.dksapp.productcategoriesfakestoreimpl.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getSingleProduct(Long productId);
    Product addNewProduct(ProductDto productDto);

    Product updateProduct(Long productId, ProductDto productDto);

    Product deleteProduct(Long productId);
}
