package database.domain;

import database.UserInfo;

import java.util.ArrayList;

public class OracleDao implements UserInfoDao {
    public String db = "ORACLE";
    public ArrayList<UserInfo> userList = new ArrayList<UserInfo>();
    public UserInfo new_user;

    @Override
    public void insertUser(String id, String pwd, String name) {
        new_user = new UserInfo();
        new_user.setUserId(id);
        new_user.setPasswd(pwd);
        new_user.setUserName(name);
        userList.add(new_user);
        System.out.println("insert info " + db + " DB userId = " + new_user.getUserId());
    }

    @Override
    public void updateUser(String id, String n_pwd) {
        for (UserInfo u : userList)
        {
            if (u.getUserId().equalsIgnoreCase(id))
            {
                u.setPasswd(n_pwd);
                System.out.println("update info " + db + " DB userId = " + u.getUserId());
                return;
            }
        }
        System.out.println("Error: The Id is not in " + db + " List");
    }

    @Override
    public void deleteUser(String id) {
        for (UserInfo u : userList)
        {
            if (u.getUserId().equalsIgnoreCase(id))
            {
                System.out.println("delete info " + db + " DB userId = " + u.getUserId());
                userList.remove(u);
                return;
            }
        }
        System.out.println("Error: The Id is not in " + db + " List");
    }

    @Override
    public void getUserList() {
        System.out.println(" =============== " + db + " ================ ");
        System.out.println();
        System.out.println("  NO |    ID    |  NAME  |    PWD    |" );
        int i = 1;
        for (UserInfo u : userList)
        {
            System.out.println("  " + i + "  |  " + u.getUserId() + "  |  " + u.getUserName() + "  |  " + u.getPasswd() + "  |");
            i++;
        }
        System.out.println("\n ======================================" );
    }
}
