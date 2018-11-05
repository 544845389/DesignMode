package com.designmode.CommandMode.demo1;

public class ConcreteCommand implements Command {

    CompanyArmy army;

    public ConcreteCommand(CompanyArmy army) {
        this.army = army;
    }

    public  void execute(){
        army.sneakAttack();
    }


}
