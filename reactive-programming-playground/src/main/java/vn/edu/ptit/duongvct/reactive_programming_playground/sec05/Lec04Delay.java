package vn.edu.ptit.duongvct.reactive_programming_playground.sec05;

import reactor.core.publisher.Flux;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

import java.time.Duration;

public class Lec04Delay {
    public static void main(String[] args) {
        Flux.range(1, 10)
                .log()
                .delayElements(Duration.ofSeconds(1))
                .subscribe(Util.subscriber());
        Util.sleepSeconds(12);
    }
}
