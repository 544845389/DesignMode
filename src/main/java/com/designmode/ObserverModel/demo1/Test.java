package com.designmode.ObserverModel.demo1;

public class Test {


    public static void main(String[] args) {
        SeekJobCenter center = new SeekJobCenter();
        UniversityStudent zhangLin = new UniversityStudent(center , "A.txt");

        HaiGui wangHao = new HaiGui(center, "B.txt");

        center.giveNewMess("腾辉公司需要10个java 程序员");
        center.notifyObserver();

        center.giveNewMess("海景公司需要8个动画设计师");
        center.notifyObserver();

    }


}
