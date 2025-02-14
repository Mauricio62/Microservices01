package pe.joedayz.microservices.util.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;


@Component
public class ServiceUtil {
    private static final Logger LOG = LoggerFactory.getLogger(ServiceUtil.class);

    private final String port;
    private String serviceAddress = null;

    public ServiceUtil(@Value("${server.port}") String port) {
        this.port = port;
    }

    public String getServiceAddress(){
        if (serviceAddress == null){
            serviceAddress = findHostname() + "/" + finMyIpAddress() + ":" + port;
        }
        return serviceAddress;
    }

    private String finMyIpAddress() {
        try {
            return InetAddress.getLocalHost().getHostName();
        }catch (UnknownHostException e){
            return "unknown host name";
        }
    }

    private String findHostname() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        }catch (UnknownHostException e){
            return "unknown host name";
        }
    }


}
