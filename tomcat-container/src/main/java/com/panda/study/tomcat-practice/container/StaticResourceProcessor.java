package com.panda.study.container;

import java.io.IOException;

/**
 * title: <br/>
 * description: <br/>
 * Copyright: Copyright (c) 2016<br/>
 * Company: 易宝支付(YeePay)<br/>
 *
 * @author menghao.chen
 * @version 1.0.0
 * @since 16/12/22 11:35
 */
public class StaticResourceProcessor {

    public  void process(Request request, Response response){
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
