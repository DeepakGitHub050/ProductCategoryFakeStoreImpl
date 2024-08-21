package com.dksapp.productcategoriesfakestoreimpl.services;

import com.dksapp.productcategoriesfakestoreimpl.models.Product;
import java.util.List;

public interface CategoryService {
    List<String> getAllCategories();
    List<Product> getProductByCategory(String category);
}