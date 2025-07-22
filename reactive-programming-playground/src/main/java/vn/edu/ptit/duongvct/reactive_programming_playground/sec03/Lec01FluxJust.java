package vn.edu.ptit.duongvct.reactive_programming_playground.sec03;

import reactor.core.publisher.Flux;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

public class Lec01FluxJust {
    public static void main(String[] args) {
        Flux.just("hello", "World", 3 , 4, 5)
                .subscribe(Util.subscriber());
    }
}
