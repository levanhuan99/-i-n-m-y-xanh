package userManager;

public interface IUserManager {
    boolean checkAdmin(String account,String password);
    boolean checkCustomer(String account,String password);
}
