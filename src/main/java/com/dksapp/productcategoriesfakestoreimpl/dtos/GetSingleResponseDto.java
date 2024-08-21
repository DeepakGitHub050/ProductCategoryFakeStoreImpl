package com.dksapp.productcategoriesfakestoreimpl.dtos;

import com.dksapp.productcategoriesfakestoreimpl.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetSingleResponseDto {
    private Product product;
}
