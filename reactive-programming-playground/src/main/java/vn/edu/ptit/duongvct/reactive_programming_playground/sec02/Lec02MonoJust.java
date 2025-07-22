package vn.edu.ptit.duongvct.reactive_programming_playground.sec02;

import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;
import vn.edu.ptit.duongvct.reactive_programming_playground.sec01.subscriber.SubscriberImpl;

public class Lec02MonoJust {
    public static void main(String[] args) {
        var mono = Mono.just("vins");
        var subscriber = new SubscriberImpl();
        mono.subscribe(subscriber);

        subscriber.getSubscription().request(10);
        subscriber.getSubscription().request(10);
        subscriber.getSubscription().cancel();
    }

}
