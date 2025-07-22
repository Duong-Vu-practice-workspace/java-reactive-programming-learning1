package vn.edu.ptit.duongvct.reactive_programming_playground.sec02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

import java.util.List;

public class Lec06MonoFromCallable {
    public static final Logger log = LoggerFactory.getLogger(Lec06MonoFromCallable.class);

    public static void main(String[] args) {
        var list = List.of(1,2,3);
//        Mono.just(sum(list))
//                .subscribe(Util.subscriber());

        Mono.fromCallable(() -> sum(list))
                .subscribe(Util.subscriber())
                ;
    }
    private static int sum(List<Integer> list) {
        log.info("Finding the sum of {}", list);
        return list.stream().mapToInt(i -> i).sum();
    }
}
