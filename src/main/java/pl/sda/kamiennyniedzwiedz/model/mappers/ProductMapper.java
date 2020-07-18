package pl.sda.kamiennyniedzwiedz.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.sda.kamiennyniedzwiedz.model.dto.ProductDto;
import pl.sda.kamiennyniedzwiedz.model.entity.ProductEntity;

import java.util.List;
@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    ProductDto productToDto(ProductEntity productEntity);
    ProductEntity dtoToProduct(ProductDto productDto);
    List<ProductDto> productListToDto(List<ProductEntity> productEntities);
}
