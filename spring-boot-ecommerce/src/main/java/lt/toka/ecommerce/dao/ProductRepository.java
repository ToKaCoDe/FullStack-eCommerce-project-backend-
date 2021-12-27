package lt.toka.ecommerce.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import lt.toka.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

@CrossOrigin({ "http://localhost:4200" })
public interface ProductRepository extends JpaRepository<Product, Long>
{
    Page<Product> findByCategoryId(@RequestParam("id") final Long id, final Pageable pageable);
    
    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
    
}