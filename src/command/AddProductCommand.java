package command;

import bussines.Desk;
import bussines.Product;
import bussines.TV;
import productManager.Manager;

import java.util.Scanner;

public class AddProductCommand extends Command implements ICommand {
    public AddProductCommand(Manager manager) {
        super(manager);
    }

    @Override
    public void execute() {
        System.out.println("which kind of product you wwant to add ?");
        System.out.println("1.TV");
        System.out.println("2.Desk");
        Scanner scanner = new Scanner(System.in);
        int choice=scanner.nextInt();

        System.out.println("enter new name");
        String newName = scanner.next();
        System.out.println("enter new code");
        int newCode = scanner.nextInt();
        System.out.println("enter new price");
        int newPrice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("enter new inch");
                int newInch = scanner.nextInt();
                Product newTV=new TV(newName,newCode,newPrice,newInch);
                list.add(newTV);
                break;
            case 2:
                System.out.println("enter new color");
                String newColor=scanner.next();
                Product newDesk=new Desk(newName,newCode,newPrice,newColor);
                list.add(newDesk);
        }

    }
}
