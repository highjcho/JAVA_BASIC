import java.util.ArrayList;

public abstract class UserInfoDao {
    public abstract void insertUserInfo(UserInfo userInfo);
    public abstract void updateUserInfo(UserInfo userInfo);
    public abstract void deleteUserInfo(UserInfo userInfo);
    public abstract void getUserList();
}

class UserInfoMySqlDao extends UserInfoDao {
    public String db = "MYSQL";
    public ArrayList<UserInfo> userList = new ArrayList<UserInfo>();

    @Override
    public void insertUserInfo(UserInfo user) {
        userList.add(user);
        System.out.println("insert info " + db + " DB userId = " + user.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo user) {
        for (UserInfo u : userList)
        {
            if (u.getUserId().equalsIgnoreCase(user.getUserId()))
            {
                System.out.println("update info " + db + " DB userId = " + u.getUserId());
                return;
            }
        }
        System.out.println("Error: The user is not in " + db + " List");
    }

    @Override
    public void deleteUserInfo(UserInfo user) {
        for (UserInfo u : userList)
        {
            if (u.getUserId().equalsIgnoreCase(user.getUserId()))
            {
                System.out.println("delete info " + db + " DB userId = " + u.getUserId());
                userList.remove(u);
                return;
            }
        }
        System.out.println("Error: The user is not in " + db + " List");
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

class UserInfoOracleDao extends UserInfoDao{
    public String db = "ORACLE";
    public ArrayList<UserInfo> userList = new ArrayList<UserInfo>();

    @Override
    public void insertUserInfo(UserInfo user) {
        userList.add(user);
        System.out.println("insert info " + db + " DB userId = " + user.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo user) {
        for (UserInfo u : userList)
        {
            if (u.getUserId().equalsIgnoreCase(user.getUserId()))
            {
                System.out.println("update info " + db + " DB userId = " + u.getUserId());
                return;
            }
        }
        System.out.println("Error: The user is not in " + db + " List");
    }

    @Override
    public void deleteUserInfo(UserInfo user) {
        for (UserInfo u : userList)
        {
            if (u.getUserId().equalsIgnoreCase(user.getUserId()))
            {
                System.out.println("delete info " + db + " DB userId = " + u.getUserId());
                userList.remove(u);
                return;
            }
        }
        System.out.println("Error: The user is not in " + db + " List");
    }

    @Override
    public void getUserList() {
        System.out.println(" =============== " + db + " ================ ");
        System.out.println();
        System.out.println("  NO |    ID    |  NAME  |    PWD    " );
        int i = 1;
        for (UserInfo u : userList)
        {
            System.out.println("  " + i + "  |  " + u.getUserId() + "  |  " + u.getUserName() + "  |  " + u.getPasswd());
            i++;
        }
        System.out.println("\n ======================================" );
    }
}