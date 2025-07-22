package vn.edu.ptit.duongvct.reactive_programming_playground.sec03;

import reactor.core.publisher.Flux;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

import java.util.List;

public class Lec04FluxFromStream {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4);
//        var stream = list.stream();
        var flux = Flux.fromStream(list::stream);
        flux.subscribe(Util.subscriber("sub1"));
        flux.subscribe(Util.subscriber("sub2"));

    }
}
