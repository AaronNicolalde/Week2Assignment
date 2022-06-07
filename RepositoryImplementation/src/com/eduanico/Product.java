package com.eduanico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product extends Element{
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                '}';
    }
}
