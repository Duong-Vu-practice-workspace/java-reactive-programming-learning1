package vn.edu.ptit.duongvct.reactive_programming_playground.sec02.client;

import reactor.core.publisher.Mono;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.AbstractHttpClient;

public class ExternalServiceClient extends AbstractHttpClient {
    public Mono<String> getProductName(int productId) {
        return this.httpClient.get()
                .uri("/demo01/product/" + productId)
                .responseContent()
                .asString()
                .next();
    }
}
