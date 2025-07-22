package vn.edu.ptit.duongvct.reactive_programming_playground.sec03;

import reactor.core.publisher.Flux;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

public class Lec02MultipleSubscribers {
    public static void main(String[] args) {
        var flux = Flux.just(1,2,3,4,5,6);
        flux.subscribe(Util.subscriber("sub1"));
        flux.subscribe(Util.subscriber("sub2"));
        flux
                .filter(i -> i % 2 == 0)
                .map(i -> i + "a")
                .subscribe(Util.subscriber("sub3"));
    }
}
