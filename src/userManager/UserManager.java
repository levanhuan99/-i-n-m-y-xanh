package userManager;

import user.User;

import java.util.HashMap;
import java.util.Map;

public class UserManager implements IUserManager {

    private User user;

    public UserManager() {
    }

    @Override
    public boolean checkAdmin(String account, String password) {
        if (account.equals("admin") && password.equals("admin")) {
            user = new Admin();
            user.setPrivilege(0);
            return true;

        }
        return false;
    }

    @Override
    public boolean checkCustomer(String accountName, String password) {
        HashMap<String, String> account = accountCustomerList();
//        Set<String> keySet = account.keySet();
        for (Map.Entry<String, String> s : account.entrySet()) {
            if (s.getKey().equals(account) && s.getValue().equals(password)) {
                user.setPrivilege(1);
                return true;
            }
        }

        return false;
    }

    private HashMap<String, String> accountCustomerList() {
        HashMap<String, String> account = new HashMap<>();
        account.put("user1", "12");
        account.put("user2", "12");
        account.put("user3", "12");
        return account;
    }

}
