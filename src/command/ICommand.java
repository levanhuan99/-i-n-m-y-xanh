package command;

import bussines.Product;

import java.util.ArrayList;

public interface ICommand {
    public ArrayList<Product> list = new ArrayList<>();
    void execute();
}
