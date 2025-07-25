package vn.edu.ptit.duongvct.reactive_programming_playground.sec02.assignment;
import reactor.core.publisher.Mono;

public interface FileService {

    Mono<String> read(String fileName);

    Mono<Void> write(String fileName, String content);

    Mono<Void> delete(String fileName);

}
