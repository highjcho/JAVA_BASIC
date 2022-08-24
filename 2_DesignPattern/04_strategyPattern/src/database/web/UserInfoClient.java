package database.web;

import database.domain.DaoFactory;
import database.UserInfo;
import database.domain.UserInfoDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        String resource = "/Users/highcho/Desktop/Coding/STUDY_JAVA/2_DesignPattern/4_strategyPattern/src/database/web/db.properties";

        try {
            prop.load(new FileInputStream(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String dbType = prop.getProperty("DBTYPE");

        UserInfo user = new UserInfo();
        DaoFactory dbFactory = new DaoFactory();
        UserInfoDao db = dbFactory.getDB(dbType);

        user.insertUser("100001", "42seoul", "Kimm", db);
        user.insertUser("100002", "kkkkkkk", "Leee", db);
        user.insertUser("100003", "jjjjjjj", "Park", db);
        user.insertUser("100004", "uuuuuuu", "Jung", db);
        System.out.println();
        dbFactory.getDB(dbType).getUserList();
        System.out.println();
        user.updateUser("100004", "newneww", db);
        user.deleteUser("100001", db);

        System.out.println("\n");
        System.out.println("* after delete user 100001 and modify user 100004\n");
        dbFactory.getDB(dbType).getUserList();

        System.out.println();
        prop.setProperty("DBTYPE", "MYSQL");
        dbType = prop.getProperty("DBTYPE");
        db = dbFactory.getDB(dbType);
        user.deleteUser("100002", db);
        System.out.println();
        dbFactory.getDB(dbType).getUserList();
        System.out.println();
        user.insertUser("100003", "jjjjjjj", "Park", db);
        user.insertUser("100004", "uuuuuuu", "Jung", db);
        System.out.println();
        dbFactory.getDB(dbType).getUserList();
    }
}
