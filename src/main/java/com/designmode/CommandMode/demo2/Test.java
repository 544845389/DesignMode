package com.designmode.CommandMode.demo2;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame{



    JButton button;

    Command command;

    Invoke person;


    Test(){
        person = new Invoke();
        command = new MultiCommand(new ShowMultForm());
        person.setCommand(command);

        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        button = person.getjButton();
        frame.add(button);
        frame.setSize( 200 , 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public static void main(String[] args) {
        Test test = new Test();
    }


}
