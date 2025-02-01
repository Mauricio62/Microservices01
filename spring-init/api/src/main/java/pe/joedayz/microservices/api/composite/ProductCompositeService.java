package pe.joedayz.microservices.api.composite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductCompositeService {
    @GetMapping(
            value = "/product-composite/{productId}",
            produces = "application/json"
    )
    productAggregate getProduct(@PathVariable int productId);
}
