package com.hand.hap.sale.webservice;

import javax.jws.WebService;

/**
 * Created by chenyong on 2017-06-15.
 */

@WebService
public interface HelloWebService {
    String helloString(String string,String name);
}
