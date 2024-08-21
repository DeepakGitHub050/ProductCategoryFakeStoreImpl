package com.dksapp.productcategoriesfakestoreimpl.controllers;

import com.dksapp.productcategoriesfakestoreimpl.models.Product;
import com.dksapp.productcategoriesfakestoreimpl.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<String>> getAllCategories() {
        List<String> categories = categoryService.getAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/{category}")
    public ResponseEntity<List<Product>> getProductsInCategory(@PathVariable("category") String category) {
        List<Product> res = categoryService.getProductByCategory(category);
        if (res.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
