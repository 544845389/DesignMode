package com.designmode.SimpleFactory;

/**
 * @author 侯存路
 * @date 2018/8/13
 * @company codingApi
 * @description
 */
public class Test {



    public static void main(String[] args) {
        Api api =   Factory.generate(0);
        api.show();
    }


}
