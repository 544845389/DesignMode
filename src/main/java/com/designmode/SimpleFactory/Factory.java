package com.designmode.SimpleFactory;

/**
 * @author 侯存路
 * @date 2018/8/13
 * @company codingApi
 * @description
 */
public class Factory {



    public static Api generate(int i){
        Api a = null;
        if(i == 0){
            a = new ImplA();
        }else if(i == 1){
            a = new ImplB();
        }
        return  a;
    }



}
