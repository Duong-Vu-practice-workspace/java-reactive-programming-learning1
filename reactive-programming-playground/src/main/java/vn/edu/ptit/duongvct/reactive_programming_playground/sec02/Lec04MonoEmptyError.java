package vn.edu.ptit.duongvct.reactive_programming_playground.sec02;

import reactor.core.publisher.Mono;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;

public class Lec04MonoEmptyError {
    public static void main(String[] args) {
//        getUsername(3)
//                .subscribe(Util.subscriber());
        getUsername(3)
                .subscribe(
                        s -> System.out.println(s),
                        err -> {}
                );
    }
    private static Mono<String> getUsername(int userId) {
        return switch (userId) {
            case 1 -> Mono.just("sam");
            case 2 -> Mono.empty(); //null
            default -> Mono.error(new RuntimeException("Invalid input"));
        };
    }
}
