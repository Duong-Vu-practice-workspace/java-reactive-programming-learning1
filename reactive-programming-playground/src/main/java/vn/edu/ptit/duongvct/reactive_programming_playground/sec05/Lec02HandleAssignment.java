package vn.edu.ptit.duongvct.reactive_programming_playground.sec05;

import reactor.core.publisher.Flux;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

public class Lec02HandleAssignment {
    public static void main(String[] args) {
        Flux.<String>generate(sink -> sink.next(Util.faker().country().name()))
                .handle((item, sink) -> {
                    sink.next(item);
                    if (item.equalsIgnoreCase("canada")) {
                        sink.complete();
                    }
                })
                .subscribe(Util.subscriber());
    }
}
