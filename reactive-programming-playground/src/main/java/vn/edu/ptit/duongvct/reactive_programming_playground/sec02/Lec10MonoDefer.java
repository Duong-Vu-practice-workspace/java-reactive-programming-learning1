package vn.edu.ptit.duongvct.reactive_programming_playground.sec02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

import java.util.List;

public class Lec10MonoDefer {
    public static final Logger log = LoggerFactory.getLogger(Lec10MonoDefer.class);
    public static void main(String[] args) {
//        createPublisher()
//                .subscribe(Util.subscriber());

        Mono.defer(Lec10MonoDefer::createPublisher)
                .subscribe(Util.subscriber());
    }
    private static Mono<Integer> createPublisher(){
        log.info("Creating publisher");
        var list = List.of(1,2,3);
        Util.sleepSeconds(1);
        return Mono.fromSupplier(() -> sum(list));
    }
    //time-consuming business logic
    private static int sum(List<Integer> list) {
        log.info("Finding the sum of {}", list);
        Util.sleepSeconds(3);
        return list.stream().mapToInt(i -> i).sum();
    }
}
