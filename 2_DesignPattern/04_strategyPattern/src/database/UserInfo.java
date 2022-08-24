package database;

import database.domain.DaoFactory;
import database.domain.UserInfoDao;

public class UserInfo {
    private String userId;
    private String passwd;
    private String userName;
    private UserInfoDao db;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void insertUser(String id, String pwd, String name, UserInfoDao db)
    {
        db.insertUser(id, pwd, name);
    }

    public void updateUser(String id, String new_pwd, UserInfoDao db)
    {
        db.updateUser(id, new_pwd);
    }

    public void deleteUser(String id, UserInfoDao db)
    {
        db.deleteUser(id);
    }
}
