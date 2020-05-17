package productManager;

import bussines.Desk;
import bussines.Product;
import bussines.TV;
import command.ICommand;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public ArrayList<Product> list = new ArrayList<>();
    private ICommand iCommand;

    public void edit() {
        this.iCommand.execute();

    }

    public void remove() {
      this.iCommand.execute();
    }

    public void add() {
        this.iCommand.execute();
    }

    public void display() {
        this.iCommand.execute();
    }
}
