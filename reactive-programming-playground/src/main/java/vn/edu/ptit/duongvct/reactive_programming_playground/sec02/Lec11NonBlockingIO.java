package vn.edu.ptit.duongvct.reactive_programming_playground.sec02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;
import vn.edu.ptit.duongvct.reactive_programming_playground.sec02.client.ExternalServiceClient;

public class Lec11NonBlockingIO {
    public static final Logger log = LoggerFactory.getLogger(Lec11NonBlockingIO.class);

    public static void main(String[] args) {
        var client = new ExternalServiceClient();
        log.info("Starting");
        for (int i = 0; i <= 5; i++) {
            client.getProductName(i)
                .subscribe(Util.subscriber());
        }

        Util.sleepSeconds(2);
    }
}
