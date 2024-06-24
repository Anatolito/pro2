package business.hub.repositories;

import business.hub.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {
    @Query(name = "SELECT", nativeQuery = true )
    List<String> findAllBy();
}
