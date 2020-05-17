package command;

import productManager.Manager;

import java.io.IOException;
import java.util.Scanner;

public class RemoveProductCommand extends Command implements ICommand {
    public RemoveProductCommand(Manager manager) {
        super(manager);
    }

    @Override
    public void execute() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter product`code which you want to remove");
        int code = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode() == code) {
                list.remove(i);
                System.out.println("removed product with code " + list.get(i).getCode());
                file.writeIntoFile(list, path);
                return;
            }
        }
    }
}
