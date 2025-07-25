package vn.edu.ptit.duongvct.reactive_programming_playground.sec05;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

import java.util.Optional;

public class Lec07DefaultIfEmpty {
    public static void main(String[] args) {
//        Mono.empty()
//                .defaultIfEmpty("fallback")
//                .subscribe(Util.subscriber());
        Flux.range(1, 10)
                .filter(i -> i > 11)
                .defaultIfEmpty(50)
                .subscribe(Util.subscriber());
    }
}
