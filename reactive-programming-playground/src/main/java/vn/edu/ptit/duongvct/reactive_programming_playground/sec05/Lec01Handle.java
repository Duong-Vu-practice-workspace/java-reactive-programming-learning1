package vn.edu.ptit.duongvct.reactive_programming_playground.sec05;

import reactor.core.publisher.Flux;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

public class Lec01Handle {
    public static void main(String[] args) {
//        Flux<Integer> flux = Flux.range(1, 10);
//        Flux<Integer> flux1 = flux.handle((item, sink) -> {
//            sink.error(new RuntimeException("oops"));
//        });
//        flux1.subscribe(Util.subscriber());

        Flux.range(1, 10)
                .filter(i -> i != 7)
                .handle((item, sink) -> {
                    switch (item) {
                        case 1 -> sink.next(-2);
                        case 4 -> {}
                        case 7 -> sink.error(new RuntimeException("Oops"));
                        default -> sink.next(item);
                    }
                })
                .cast(Integer.class)
                .subscribe(Util.subscriber());
    }
}
