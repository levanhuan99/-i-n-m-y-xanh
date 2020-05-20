package UI;

import command.*;
import file.File;
import invoker.CommandInvoker;
import productManager.Manager;
import user.User;
import userManager.UserManager;

import java.io.IOException;
import java.util.Scanner;

public class Service {
    private File file = new File();
    private UserManager userManager=new UserManager();


    public void run() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("who are you?");
        System.out.printf("1.admin");
        System.out.printf("2.customer");
        int userChoice=scanner.nextInt();
        String accountName="";
        String accountPassword="";
        User user=new User();
        switch (userChoice){
            case 1:
                System.out.printf("your accountName");
                 accountName=scanner.next();
                System.out.printf("your accountName");
                 accountPassword=scanner.next();
                userManager.checkAdmin(accountName,accountPassword);

                break;
            case 2:
                System.out.printf("your accountName");
                 accountName=scanner.next();
                System.out.printf("your accountName");
                 accountPassword=scanner.next();
                break;
        }




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

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                ICommand command = new AddProductCommand(manager); //tại sao khi khởi tạo đối tượng lại dùng Interface.vì tính đa hình
                commandInvoker = new CommandInvoker(command);
                commandInvoker.executeCommand();
                run();
                break;
            case 2:
                ICommand command1 = new RemoveProductCommand(manager);
                commandInvoker = new CommandInvoker(command1);
                commandInvoker.executeCommand();
                run();
                break;
            case 3:
                ICommand command2 = new EditProductCommand(manager);
                commandInvoker = new CommandInvoker(command2);
                commandInvoker.executeCommand();
                run();
                break;
            case 4:
                ICommand command3 = new DisplayProductCommand(manager);
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
    private boolean checkUserOrAdmin(String userName,String password){
        return false;
    }
}
