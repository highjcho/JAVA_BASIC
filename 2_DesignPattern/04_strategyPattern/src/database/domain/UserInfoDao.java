package database.domain;

public interface UserInfoDao {
    public void insertUser(String id, String pwd, String name);
    public void updateUser(String id, String n_pwd);
    public void deleteUser(String id);
    public void getUserList();
}
