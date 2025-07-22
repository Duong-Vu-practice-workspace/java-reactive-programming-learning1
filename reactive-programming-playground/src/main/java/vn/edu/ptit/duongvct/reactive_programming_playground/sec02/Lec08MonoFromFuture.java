package vn.edu.ptit.duongvct.reactive_programming_playground.sec02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

import java.util.concurrent.CompletableFuture;

public class Lec08MonoFromFuture {
    public static final Logger log = LoggerFactory.getLogger(Lec08MonoFromFuture.class);

    public static void main(String[] args) throws InterruptedException{
        Mono.fromFuture(Lec08MonoFromFuture::getName)
                .subscribe(Util.subscriber());
        Util.sleepSeconds(1);
    }
    private static CompletableFuture<String> getName(){
        return CompletableFuture.supplyAsync(() -> {
            log.info("Generating name");
            return Util.faker().name().firstName();
        });
    }
}
