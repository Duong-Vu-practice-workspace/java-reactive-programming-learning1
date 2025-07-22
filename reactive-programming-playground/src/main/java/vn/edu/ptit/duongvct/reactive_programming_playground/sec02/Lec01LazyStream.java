package vn.edu.ptit.duongvct.reactive_programming_playground.sec02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.stream.Stream;

public class Lec01LazyStream {
    public static final Logger log = LoggerFactory.getLogger(Lec01LazyStream.class);

    public static void main(String[] args) {
        Stream.of(1)
                .peek(i -> log.info("Received: {}", i))
                .max(Comparator.naturalOrder())
        ;


    }
}
