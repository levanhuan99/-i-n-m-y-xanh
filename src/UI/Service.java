package UI;

import command.AddProductCommand;
import command.DisplayProductCommand;
import command.EditProductCommand;
import command.RemoveProductCommand;
import file.File;
import invoker.CommandInvoker;
import productManager.Manager;

import java.io.IOException;
import java.util.Scanner;

public class Service {
    private File file = new File();

    public void run() throws IOException {
        System.out.println("===================");
        System.out.println("1.add product");
        System.out.println("2.remove product");
        System.out.println("3.edit product");
        System.out.println("4.display product");
        System.out.println("5.exit");
        System.out.println("===================");
        System.out.println("enter your choice!");
        CommandInvoker commandInvoker = null;
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                AddProductCommand command = new AddProductCommand(manager);
                commandInvoker = new CommandInvoker(command);
                commandInvoker.executeCommand();
                run();
                break;
            case 2:
                RemoveProductCommand command1 = new RemoveProductCommand(manager);
                commandInvoker = new CommandInvoker(command1);
                commandInvoker.executeCommand();
                run();
                break;
            case 3:
                EditProductCommand command2 = new EditProductCommand(manager);
                commandInvoker = new CommandInvoker(command2);
                commandInvoker.executeCommand();
                run();
                break;
            case 4:
                DisplayProductCommand command3 = new DisplayProductCommand(manager);
                commandInvoker = new CommandInvoker(command3);
                commandInvoker.executeCommand();
                run();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("wrong choice!");
        }
    }
}
