package pl.sda.kamiennyniedzwiedz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.kamiennyniedzwiedz.model.entity.ProductEntity;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {}
