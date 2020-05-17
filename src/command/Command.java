package command;

import productManager.Manager;

public class Command {
    protected Manager manager;
    public Command(Manager manager){
        this.manager=manager;
    }
}
