package com.hand.hap.sale.webservice.components;

import com.hand.hap.message.IMessageConsumer;
import com.hand.hap.message.TopicMonitor;
import org.springframework.stereotype.Component;

/**
 * Created by chenyong on 2017-06-15.
 */


@Component
@TopicMonitor(channel ="hello")
public class WebServiceMonitor implements IMessageConsumer<String> {
    @Override
    public void onMessage(String s, String s2) {
        System.out.println("----------------------------");
        System.out.println(s);
        System.out.println("----------------------------");

    }
}
