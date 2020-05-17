package UI;

import command.AddProductCommand;
import command.DisplayProductCommand;
import command.EditProductCommand;
import command.RemoveProductCommand;
import invoker.CommandInvoker;
import productManager.Manager;

import java.util.Scanner;

public class Service {
    public void run(){
        System.out.println("===================");
        System.out.println("1.add product");
        System.out.println("2.remove product");
        System.out.println("3.edit product");
        System.out.println("4.display product");
        System.out.println("===================");
        System.out.println("enter your choice!");
        CommandInvoker commandInvoker=new CommandInvoker();
        Manager manager=new Manager();
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                AddProductCommand command=new AddProductCommand(manager);
                commandInvoker=new CommandInvoker(command);
                break;
            case 2:
                RemoveProductCommand command1=new RemoveProductCommand(manager);
                commandInvoker=new CommandInvoker(command1);
                break;
            case 3:
                EditProductCommand command2=new EditProductCommand(manager);
                commandInvoker=new CommandInvoker(command2);
                break;
            case 4:
                DisplayProductCommand command3=new DisplayProductCommand(manager);
                commandInvoker =new CommandInvoker(command3);
                break;
            default:
                System.out.println("wrong choice!");

        }
        commandInvoker.executeCommand();
    }
}
