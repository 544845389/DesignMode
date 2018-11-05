package com.designmode.CommandMode.demo2;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Invoke {


    JButton jButton;

    Command command;

    Invoke(){
        jButton = new JButton();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand();
            }
        });

    }


    public  void setCommand (Command command){
        this.command = command;
    }


    public JButton getjButton() {
        return jButton;
    }

    private  void executeCommand(){
        command.execute();
    }


}
