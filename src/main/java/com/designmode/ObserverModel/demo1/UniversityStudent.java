package com.designmode.ObserverModel.demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class UniversityStudent implements  Observer {


    Subject subject;
    File myFile;

    UniversityStudent( Subject subject , String fileName){
        this.subject = subject;
        subject.addObserver(this);
        myFile = new File(fileName);
    }



    @Override
    public void hearTelephone(String heardMess) {
        try {
            RandomAccessFile out = new RandomAccessFile(myFile , "rw");
            out.seek(out.length());
            byte [] b = heardMess.getBytes();
            out.write(b);
            System.out.print("我是一个大学生");
            System.out.println("我想文件"+ myFile.getName() +"写入如下内容:");
            System.out.println(heardMess);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
