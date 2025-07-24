package vn.edu.ptit.duongvct.reactive_programming_playground.sec04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

public class Lec06FluxGenerate {
    public static final Logger log = LoggerFactory.getLogger(Lec06FluxGenerate.class);

    public static void main(String[] args) {
        Flux.generate(synchronousSink -> {
            log.info("Invoked");
            synchronousSink.next(1);
//            synchronousSink.next(2);
            synchronousSink.complete();
        })
                .take(4)
                .subscribe(Util.subscriber());
    }
}
