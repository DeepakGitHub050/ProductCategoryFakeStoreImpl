package com.dksapp.productcategoriesfakestoreimpl.models;

import com.dksapp.productcategoriesfakestoreimpl.dtos.RatingDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseModel {
    private String title;
    private String description;
    private double price;
    private String imageUrl;
    private String category;
    private RatingDto rating;
}
