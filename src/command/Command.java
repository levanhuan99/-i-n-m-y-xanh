package command;

import bussines.Desk;
import bussines.Product;
import bussines.TV;
import file.File;
import productManager.Manager;

import java.util.ArrayList;

public class Command {
    public static final String path = "D:\\codegym\\modul2\\week5\\behaviral design pattern\\comand\\blueMachine\\product.io";
    protected Manager manager;
    protected File file;                      //nếu khởi tạo đối tượng ở đây thì sẽ gây lỗi stack over flow
    public ArrayList<Product> list = new ArrayList<>();

    public Command(Manager manager) {
        this.manager = manager;
        file = new File();
        list = file.readFile(path);
    }

}
