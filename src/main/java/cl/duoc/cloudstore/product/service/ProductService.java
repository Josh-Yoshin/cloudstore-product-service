package cl.duoc.cloudstore.product.service;

import cl.duoc.cloudstore.product.model.Product;
import cl.duoc.cloudstore.product.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> listAll() { return repository.findAll(); }
    public Product save(Product product) { return repository.save(product); }
}