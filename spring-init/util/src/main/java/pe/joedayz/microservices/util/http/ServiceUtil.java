package pe.joedayz.microservices.util.ht;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceUtil {
    private static final Logger LOG = LoggerFactory.getLogger(ServiceUtil.class);

    private final String port;
    private final String ServiceAddress = null;

    public ServiceUtil(String port) {
        this.port = port;
    }
}
