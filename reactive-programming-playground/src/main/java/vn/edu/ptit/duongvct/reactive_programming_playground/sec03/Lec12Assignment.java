package vn.edu.ptit.duongvct.reactive_programming_playground.sec03;

import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;
import vn.edu.ptit.duongvct.reactive_programming_playground.sec03.assignment.StockPriceObserver;
import vn.edu.ptit.duongvct.reactive_programming_playground.sec03.assignment.client.ExternalServiceClient;

public class Lec12Assignment {
    public static void main(String[] args) {
        var client = new ExternalServiceClient();
        var subscriber = new StockPriceObserver();
        client.getPriceChanges()
                .subscribe(subscriber);
        Util.sleepSeconds(20);
    }
}
