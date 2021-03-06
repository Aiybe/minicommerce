package me.abje.minicommerce.db;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
    Optional<Product> findById(int id);

    List<Product> findByNameContaining(String partialName);
}
