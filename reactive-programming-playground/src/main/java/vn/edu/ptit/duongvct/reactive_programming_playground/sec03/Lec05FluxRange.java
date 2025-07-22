package vn.edu.ptit.duongvct.reactive_programming_playground.sec03;

import reactor.core.publisher.Flux;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

public class Lec05FluxRange {
    public static void main(String[] args) {
        Flux.range(1, 10)
                .subscribe(Util.subscriber());
    }
}
