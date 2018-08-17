package com.designmode.SimpleFactory;

import org.springframework.stereotype.Service;

/**
 * @author 侯存路
 * @date 2018/8/13
 * @company codingApi
 * @description
 */
@Service("1")
public class ImplB implements   Api{


    @Override
    public void show() {
        System.out.println("这是实现B");
    }


}
