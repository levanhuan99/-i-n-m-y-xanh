package command;

import bussines.Desk;
import bussines.Product;
import bussines.TV;
import file.File;
import productManager.Manager;
import user.User;
import userManager.UserManager;

import java.util.ArrayList;

public class Command {
    private User userManager=new User();
    public static final String headPath = "D:\\codegym\\modul2\\week5\\behaviral design pattern\\comand\\blueMachine\\productFile";
    public static final String tailPath=toString();
    public  final String path=headPath+tailPath;


    protected Manager manager;
    protected File file= new File();                      //nếu khởi tạo đối tượng ở đây thì sẽ gây lỗi stack over flow
    public ArrayList<Product> list = new ArrayList<>();

    public Command(Manager manager) {
        this.manager = manager;
        list = file.readFile(path);//fix check file người dùng ở đây

}
