package io.dargenn.zad1_4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource {
    private final ProductService productService;

    public ProductResource(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ProductWrapper findAll() {
        return new ProductWrapper(productService.getProducts());
    }
}
