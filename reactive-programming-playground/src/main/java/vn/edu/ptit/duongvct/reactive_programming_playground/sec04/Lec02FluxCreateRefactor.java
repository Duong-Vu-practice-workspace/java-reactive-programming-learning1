package vn.edu.ptit.duongvct.reactive_programming_playground.sec04;

import reactor.core.publisher.Flux;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;
import vn.edu.ptit.duongvct.reactive_programming_playground.sec04.helper.NameGenerator;

public class Lec02FluxCreateRefactor {
    public static void main(String[] args) {
        var generator = new NameGenerator();
        var flux = Flux.create(generator);
        flux.subscribe(Util.subscriber());
        for (int i = 0; i < 10; i++) {
            generator.generate();
        }
    }
}
