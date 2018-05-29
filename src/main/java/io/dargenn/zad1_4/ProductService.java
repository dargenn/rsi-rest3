package io.dargenn.zad1_4;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {
    private List<Product> products = new ArrayList<>();

    @PostConstruct
    private void populate() {
        products.add(new Product(2000, "Laptop"));
        products.add(new Product(400, "Telefon"));
        products.add(new Product(99999, "Golf IV"));
        products.add(new Product(1, "Jablko"));
        products.add(new Product(10, "Dycha"));
    }

    public List<Product> getProducts() {
        return products;
    }
}
