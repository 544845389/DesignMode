package com.designmode.CommandMode.demo1;

public class Test {


    public static void main(String[] args) {
        CompanyArmy companyArmy = new CompanyArmy();
        Command concreteCommand = new ConcreteCommand(companyArmy);

        ArmySuperior armySuperior = new ArmySuperior();
        armySuperior.setCommand(concreteCommand);
        armySuperior.startExecuteCommand();

    }



}
