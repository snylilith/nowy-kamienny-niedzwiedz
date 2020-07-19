package pl.sda.kamiennyniedzwiedz.controller;

import org.springframework.http.ResponseEntity;
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

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity <List<ProductDto>> getProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @PostMapping("/products")
    public ResponseEntity addProduct(ProductDto productDto) {
        productService.addProduct(productDto);
        return ResponseEntity.ok().build();
    }

}

