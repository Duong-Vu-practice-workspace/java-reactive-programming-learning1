package vn.edu.ptit.duongvct.reactive_programming_playground.sec03.client;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.AbstractHttpClient;

public class ExternalServiceClient extends AbstractHttpClient {
    public Flux<String> getNames() {
        return this.httpClient.get()
                .uri("/demo02/name/stream")
                .responseContent()
                .asString()
                ;
    }
}
