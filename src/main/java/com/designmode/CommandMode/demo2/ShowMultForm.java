package com.designmode.CommandMode.demo2;

public class ShowMultForm {


    public void show(){

        for(int i = 1 ; i <= 9 ; i ++){

            for(int j = 0 ; j <= i ; j++ ){
                System.out.print( j + "X" + i +" = " + j*i+" ");
            }
            System.out.println(" ");
        }

    }

}
