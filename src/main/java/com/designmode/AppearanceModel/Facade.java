package com.designmode.AppearanceModel;

/**
 * @author 侯存路
 * @date 2018/8/17
 * @company codingApi
 * @description
 */
public class Facade {


     public static void start(){
         CPU.start();
         Disk.start();
         Memory.start();
     }


}
