package io.dargenn.zad1_4;

import java.util.ArrayList;
import java.util.List;

public class ProductWrapper {
    private List<Product> products = new ArrayList<>();

    public ProductWrapper() {
    }

    public ProductWrapper(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
