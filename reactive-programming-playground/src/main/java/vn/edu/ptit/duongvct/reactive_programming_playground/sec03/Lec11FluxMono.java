package vn.edu.ptit.duongvct.reactive_programming_playground.sec03;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

public class Lec11FluxMono {
    public static void main(String[] args) {
        var flux = Flux.range(1, 10);
        Mono.from(flux).subscribe(Util.subscriber());
//        flux.next()
//                .subscribe(Util.subscriber());
    }
    private static Mono<String> getUsername(int userId) {
        return switch (userId) {
            case 1 -> Mono.just("sam");
            case 2 -> Mono.empty(); //null
            default -> Mono.error(new RuntimeException("Invalid input"));
        };
    }
    private static void save(Flux<String> flux) {
        flux.subscribe(Util.subscriber());
    }
    private static void monoToFlux(){
        var mono = getUsername(1);
        save(Flux.from(mono));
    }
}
