package productManager;

import bussines.Desk;
import bussines.Product;
import bussines.TV;
import command.ICommand;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    private ICommand iCommand;

    public void edit() throws IOException {
        this.iCommand.execute();
    }

    public void remove() throws IOException {
        this.iCommand.execute();
    }

    public void add() throws IOException {
        this.iCommand.execute();
    }

    public void display() throws IOException {
        this.iCommand.execute();
    }
}
