package user;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class User {
    private String userName;
    private String password;
    private int privilege;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPrivilege() {
        return privilege;
    }

    public void setPrivilege(int privilege) {
        this.privilege = privilege;
    }
//    public int checkPrivilege() {
//
//        return 0;
//    }

//    private boolean checkUserAccount(String userName, String password) {
//        HashMap<String, String> account = accountList();
//        Set<String> keySet = account.keySet();
//        for (Map.Entry<String, String> s : account.entrySet()) {
//            if (s.getKey().equals(userName) && s.getValue().equals(password)) {
//
//                return true;
//            }
//        }
//        return false;
//    }

//    private HashMap<String, String> accountList() {
//        HashMap<String, String> account = new HashMap<>();
//        account.put("lehuan1", "123");
//        account.put("lehuan2", "1234");
//        account.put("lehuan3", "12345");
//        return account;
//    }
}
