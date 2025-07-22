package vn.edu.ptit.duongvct.reactive_programming_playground.sec02.assignment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileServiceImpl implements FileService{
    public static final Logger log = LoggerFactory.getLogger(FileServiceImpl.class);
    public static final Path PATH = Path.of("reactive-programming-playground/src/main/resources/sec02");
    @Override
    public Mono<String> read(String fileName) {
        System.out.println("Absolute path: " + PATH.resolve(fileName).toAbsolutePath());
        return Mono.fromCallable(() -> Files.readString(PATH.resolve(fileName)));

    }

    @Override
    public Mono<Void> write(String fileName, String content) {
        System.out.println("Absolute path: " + PATH.resolve(fileName).toAbsolutePath());
        return Mono.fromRunnable(() -> writeFile(fileName, content));
    }

    @Override
    public Mono<Void> delete(String fileName) {
        System.out.println("Absolute path: " + PATH.resolve(fileName).toAbsolutePath());
        return Mono.fromRunnable(() -> deleteFile(fileName));
    }
    private void writeFile(String fileName, String content) {
        try {
            Files.writeString(PATH.resolve(fileName), content);
            log.info("Created {}", fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void deleteFile(String fileName) {
        try {
            Files.delete(PATH.resolve(fileName));
            log.info("Deleted {}", fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
