package com.easy.ecomm.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ProductDto {

    @NotBlank(message = "description must be filled")
    private String description;
    @NotBlank(message = "category must be filled")
    private String category;
    private String color = "";
    private Double priceCost = 0.0;
    @NotNull(message = "sellPrice must be informed")
    private Double priceSell;
    private int stockAmount = 0;

}
