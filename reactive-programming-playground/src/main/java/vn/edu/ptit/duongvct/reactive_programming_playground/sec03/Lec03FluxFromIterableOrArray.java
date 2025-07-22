package vn.edu.ptit.duongvct.reactive_programming_playground.sec03;

import reactor.core.publisher.Flux;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

import java.util.List;

public class Lec03FluxFromIterableOrArray {
    public static void main(String[] args) {
        var list = List.of("a", "b", "c");
        Flux.fromIterable(list)
                .subscribe(Util.subscriber());
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        Flux.fromArray(arr)
                .subscribe(Util.subscriber());
    }
}
