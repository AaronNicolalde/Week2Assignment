package com.eduanico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Country extends Element {
    private String name;
    private int isoCode;

    public Country(String name, int stocks) {
        this.name = name;
        this.isoCode = stocks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", isoCodes=" + isoCode +
                '}';
    }

    @Override
    boolean save(Element element) {
        return super.save(element);
    }
}
