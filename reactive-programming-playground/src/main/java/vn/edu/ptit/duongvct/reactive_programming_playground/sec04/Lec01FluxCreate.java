package vn.edu.ptit.duongvct.reactive_programming_playground.sec04;

import reactor.core.publisher.Flux;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

public class Lec01FluxCreate {
    public static void main(String[] args) {
//        Flux.create(fluxSink -> {
//            fluxSink.next(1);
//            fluxSink.next(2);
//            fluxSink.complete();
//        })
//                .subscribe(Util.subscriber());
        Flux.create(fluxSink -> {
                    String country;
                    do {
                        country = Util.faker().country().name();
                        fluxSink.next(country);
                    } while (!country.equalsIgnoreCase("canada"));
                    fluxSink.complete();
                })
                .subscribe(Util.subscriber());
    }
}
