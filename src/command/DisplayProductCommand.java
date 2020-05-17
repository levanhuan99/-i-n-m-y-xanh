package command;

import productManager.Manager;

public class DisplayProductCommand extends Command implements ICommand {
    public DisplayProductCommand(Manager manager) {
        super(manager);
    }

    @Override
    public void execute() {
        if (list.size() == 0) {
            System.out.println("list is empty!");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
