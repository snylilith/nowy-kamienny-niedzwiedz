package pl.sda.kamiennyniedzwiedz.service;

import org.springframework.stereotype.Service;
import pl.sda.kamiennyniedzwiedz.model.dto.ProductDto;
import pl.sda.kamiennyniedzwiedz.model.entity.ProductEntity;
import pl.sda.kamiennyniedzwiedz.model.mappers.ProductMapper;
import pl.sda.kamiennyniedzwiedz.repository.ProductRepository;

import java.util.List;


@Service
public class ProductService {
    private ProductRepository productRepository;

    public List<ProductDto> getAllProducts() {
        List< ProductEntity > productList = productRepository.findAll();
        return ProductMapper.INSTANCE.productListToDto(productList);
    }

    public void addProduct(ProductDto productDto) {
        ProductEntity productEntity = ProductMapper.INSTANCE.dtoToProduct(productDto);
        productRepository.save(productEntity);
    }
}
