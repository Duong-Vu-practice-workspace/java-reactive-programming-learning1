package vn.edu.ptit.duongvct.reactive_programming_playground.sec01.subscriber;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubscriberImpl implements Subscriber<String> {
    public static final Logger log = LoggerFactory.getLogger(SubscriberImpl.class);
    private Subscription subscription;

    public Subscription getSubscription() {
        return subscription;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public void onNext(String email) {
        log.info("Received {}", email);
    }

    @Override
    public void onError(Throwable throwable) {
        log.error("Error", throwable);
    }

    @Override
    public void onComplete() {
        log.info("Completed!");
    }
}
