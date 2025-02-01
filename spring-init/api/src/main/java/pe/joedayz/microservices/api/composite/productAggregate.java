package pe.joedayz.microservices.api.composite;

import pe.joedayz.microservices.api.core.recommendation.Recommendation;
import pe.joedayz.microservices.api.core.review.Review;

import java.util.List;

public class productAggregate {
    private final int productId;
    private final String name;
    private final int weight;
    private final List<RecommendationSummary> recommendations;
    private final List<ReviewSummary> reviews;
    private final ServiceAddresses serviceAddresses;

    public productAggregate(ServiceAddresses serviceAddresses, List<ReviewSummary> reviews, List<RecommendationSummary> recommendations, int weight, String name, int productId) {
        this.serviceAddresses = serviceAddresses;
        this.reviews = reviews;
        this.recommendations = recommendations;
        this.weight = weight;
        this.name = name;
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public List<RecommendationSummary> getRecommendations() {
        return recommendations;
    }

    public List<ReviewSummary> getReviews() {
        return reviews;
    }

    public ServiceAddresses getServiceAddresses() {
        return serviceAddresses;
    }
}
