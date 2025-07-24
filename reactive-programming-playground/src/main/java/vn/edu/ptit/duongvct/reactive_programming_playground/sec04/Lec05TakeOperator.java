package vn.edu.ptit.duongvct.reactive_programming_playground.sec04;

import reactor.core.publisher.Flux;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

public class Lec05TakeOperator {
    public static void main(String[] args) {
        takeUntil();
    }
    private static void take(){
        Flux.range(1, 10)
                .log("take")
                .take(3)
                .log("sub")
                .subscribe(Util.subscriber());
    }
    private static void takeWhile(){
        Flux.range(1, 10)
                .log("take")
                .takeWhile(i -> i < 5)
                .log("sub")
                .subscribe(Util.subscriber());
    }
    private static void takeUntil(){
        Flux.range(1, 10)
                .log("take")
                .takeUntil(i -> i < 5) //stop when met condition and get the item
                .log("sub")
                .subscribe(Util.subscriber());
    }

}
