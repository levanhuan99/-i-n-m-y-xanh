package command;

import bussines.Desk;
import bussines.TV;
import productManager.Manager;

import java.io.IOException;
import java.util.Scanner;

public class EditProductCommand extends Command implements ICommand {
    public EditProductCommand(Manager manager) {
        super(manager);
    }

    @Override
    public void execute() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter product` code which you want to remove");
        int code = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode() == code) {

                System.out.println("enter new name");
                String newName = scanner.next();
                System.out.println("enter new code");
                int newCode = scanner.nextInt();
                System.out.println("enter new price");
                int newPrice = scanner.nextInt();

                if (list.get(i) instanceof TV) {
                    TV tv = (TV) list.get(i);
                    System.out.println("enter new inch");
                    int newInch = scanner.nextInt();
                    tv.setName(newName);
                    tv.setCode(newCode);
                    tv.setPrice(newPrice);
                    tv.setInch(newInch);
                    file.writeIntoFile(list, path);
                } else {
                    Desk desk = (Desk) list.get(i);
                    System.out.println("enter new color");
                    String newColor = scanner.next();
                    desk.setName(newName);
                    desk.setCode(newCode);
                    desk.setPrice(newPrice);
                    desk.setColor(newColor);
                }
                break;
            }
        }
        file.writeIntoFile(list, path);
    }
}
