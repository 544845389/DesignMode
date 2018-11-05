package com.designmode.ObserverModel.demo1;

public interface Subject {


    void  addObserver(Observer  observer);


    void delectObserver(Observer  observer);


    void  notifyObserver();



}
