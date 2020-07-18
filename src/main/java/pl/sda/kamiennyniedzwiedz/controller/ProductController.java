package pl.sda.kamiennyniedzwiedz.controller;

import org.springframework.web.bind.annotation.*;
import pl.sda.kamiennyniedzwiedz.model.dto.ProductDto;
import pl.sda.kamiennyniedzwiedz.model.entity.ProductEntity;
import pl.sda.kamiennyniedzwiedz.repository.ProductRepository;
import pl.sda.kamiennyniedzwiedz.service.ProductService;

import java.util.List;

@RestController
@CrossOrigin (origins = "http://localhost:4200")

public class ProductController {


    private ProductService productService;

    public ProductController(ProductRepository productRepository) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<ProductDto> getProducts() {
        return (List<ProductDto>) productService.getAllProducts();
    }

    @PostMapping("/products")
    void addProduct(ProductDto productDto) {
        productService.addProduct(productDto);
    }

}

