package com.designmode.ObserverModel.demo1;

import java.util.ArrayList;

public class SeekJobCenter implements  Subject {

    String mess;

    boolean  changed;

    ArrayList<Observer> personList;


    SeekJobCenter(){
        personList = new ArrayList<>();
        mess = "";
        changed = false;
    }



    @Override
    public void addObserver(Observer observer) {
        if(!personList.contains(observer)){
            personList.add(observer);
        }
    }

    @Override
    public void delectObserver(Observer observer) {
        if(personList.contains(observer)){
            personList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        if(changed){
            for (int i = 0; i < personList.size(); i++) {
                Observer observer =  personList.get(i);
                observer.hearTelephone(mess);
            }
            changed = false;
        }
    }


    public  void giveNewMess(String str){
        if(str.equals(mess)){
            changed = false;
        }else{
            mess = str;
            changed = true;
        }
    }

}
