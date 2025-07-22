package vn.edu.ptit.duongvct.reactive_programming_playground.sec02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

public class Lec07MonoFromRunnable {
    public static final Logger log = LoggerFactory.getLogger(Lec07MonoFromRunnable.class);
    public static void main(String[] args) {
        getProductName(2)
                .subscribe(Util.subscriber());
    }
    private static Mono<String> getProductName(int productId) {
        if (productId == 1) {
            return Mono.fromSupplier(() -> Util.faker().commerce().productName());
        }
        return Mono.fromRunnable(() -> notifyBusiness(productId));
    }
    private static void notifyBusiness(int productId) {
        log.info("Notifying business on unavailable product {}", productId);
    }
}
