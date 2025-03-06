package pe.joedayz.microservices.core.product.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pe.joedayz.microservices.api.core.product.Product;
import pe.joedayz.microservices.api.core.product.ProductService;
import pe.joedayz.microservices.api.exceptions.InvalidInputException;
import pe.joedayz.microservices.api.exceptions.NotFoundException;
import pe.joedayz.microservices.util.http.ServiceUtil;


@RestController
public class ProductServiceimp implements ProductService {

    private static final Logger LOG = LoggerFactory.getLogger(ProductServiceimp.class);

    private final ServiceUtil  serviceUtil;


    public ProductServiceimp(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }

    @Override
    public Product getProduct(int productId) {
        LOG.debug("Return the found product with id {}", productId);

        if (productId<1){
            throw new InvalidInputException("Invalid ProductId: " + productId);
        }

        if (productId == 13){
            throw new NotFoundException("No product found for productId: " + productId);
        }
        return new Product(productId, "name-"+productId, 123, serviceUtil.getServiceAddress());
    }
}
