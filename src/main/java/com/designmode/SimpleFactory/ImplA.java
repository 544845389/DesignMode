package com.designmode.SimpleFactory;

import org.springframework.stereotype.Service;

/**
 * @author 侯存路
 * @date 2018/8/13
 * @company codingApi
 * @description
 */
@Service("2")
public class ImplA implements   Api{


    @Override
    public void show() {

        System.out.println("这是实现A");
    }


}
