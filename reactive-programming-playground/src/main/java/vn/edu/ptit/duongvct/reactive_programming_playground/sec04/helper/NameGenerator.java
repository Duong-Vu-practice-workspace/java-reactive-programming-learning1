package vn.edu.ptit.duongvct.reactive_programming_playground.sec04.helper;

import reactor.core.publisher.FluxSink;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

import java.util.function.Consumer;

public class NameGenerator implements Consumer<FluxSink<String>> {
    private FluxSink<String> sink;
    @Override
    public void accept(FluxSink<String> stringFluxSink) {
        this.sink = stringFluxSink;
    }
    public void generate() {
        this.sink.next(Util.faker().name().firstName());
    }
}
