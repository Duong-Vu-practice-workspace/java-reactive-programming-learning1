package vn.edu.ptit.duongvct.reactive_programming_playground.sec03.assignment;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StockPriceObserver implements Subscriber<Integer>{
    public static final Logger log = LoggerFactory.getLogger(StockPriceObserver.class);
    private int quantity = 0;
    private int balance = 1000;
    private Subscription subscription;
    @Override
    public void onSubscribe(Subscription s) {
        this.subscription = s;
        subscription.request(Long.MAX_VALUE);

    }

    @Override
    public void onNext(Integer price) {
        if (price < 90 && balance >= price) {
            balance -= price;
            quantity++;
            log.info("Bought a stock at {}, total quantity: {}, remaining balance: {}", price, quantity, balance);
        } else if (price > 110 && quantity > 0) {
            log.info("Selling {} quantities at {}", quantity, price);
            balance += (quantity * price);
            quantity = 0;
            subscription.cancel();
            log.info("Profit: {}", (balance - 1000));
        }

    }

    @Override
    public void onError(Throwable t) {
        log.error("error", t);
    }

    @Override
    public void onComplete() {
        log.info("Completed");
    }
}
