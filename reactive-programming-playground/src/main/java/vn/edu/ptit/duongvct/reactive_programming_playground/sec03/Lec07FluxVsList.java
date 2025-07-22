package vn.edu.ptit.duongvct.reactive_programming_playground.sec03;

import vn.edu.ptit.duongvct.reactive_programming_playground.common.Util;
import vn.edu.ptit.duongvct.reactive_programming_playground.sec01.subscriber.SubscriberImpl;
import vn.edu.ptit.duongvct.reactive_programming_playground.sec03.helper.NameGenerator;

public class Lec07FluxVsList {
    public static void main(String[] args) {
        var list = NameGenerator.getNamesList(10);
        System.out.println(list);

        NameGenerator.getNamesFlux(10)
                .subscribe(Util.subscriber());
//        var subscriber = new SubscriberImpl();
//        NameGenerator.getNamesFlux(10)
//        .subscribe(Util.subscriber());
//        subscriber.getSubscription().request(3);
//        subscriber.getSubscription().cancel();

    }
}
