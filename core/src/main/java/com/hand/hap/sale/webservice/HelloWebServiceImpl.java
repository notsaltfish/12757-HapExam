package com.hand.hap.sale.webservice;

import com.hand.hap.message.IMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by chenyong on 2017-06-15.
 */

@WebService(
        endpointInterface="com.hand.hap.sale.webservice.HelloWebService",
        serviceName ="helloS"
)

public class HelloWebServiceImpl implements HelloWebService {

    @Autowired
    private IMessagePublisher publisher;

    @Override
    public String helloString(@WebParam(name="message") String message,@WebParam String name ) {
        /*跟Monitor@TopicMonitor(channel ="hello")
        * 还有spring配置文件address保持一致*/
        publisher.publish("hello","helloWebService1 "+message);
        return "Hello";
    }
}
