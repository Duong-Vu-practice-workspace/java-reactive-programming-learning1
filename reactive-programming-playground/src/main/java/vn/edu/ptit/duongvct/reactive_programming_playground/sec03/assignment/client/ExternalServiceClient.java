package vn.edu.ptit.duongvct.reactive_programming_playground.sec03.assignment.client;

import reactor.core.publisher.Flux;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.AbstractHttpClient;

public class ExternalServiceClient extends AbstractHttpClient{
    public Flux<Integer> getPriceChanges(){
        return this.httpClient.get()
                .uri("/demo02/stock/stream")
                .responseContent()
                .asString()
                .map(Integer::parseInt);
    }
}
