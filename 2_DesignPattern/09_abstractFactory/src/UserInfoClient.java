import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/highcho/Desktop/Coding/Study_Java/2_DesignPattern/09_abstractFactory/src/db.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String dbType = prop.getProperty("DBTYPE");
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPasswd("!@#$%");
        userInfo.setUserName("Tomas");
        Product product = new Product();
        product.setProductId("0011AA");
        product.setProductName("TV");
        DaoFactory daoFactory = null;
        UserInfoDao userInfoDao = null;
        ProductDao productDao = null;
        if (dbType.equals("ORACLE")) {
            daoFactory = new OracleDaoFactory();
        } else if (dbType.endsWith("MYSQL")) {
            daoFactory = new MySqlDaoFactory();
        } else {
            System.out.println("db support error");
            return;
        }
        userInfoDao = daoFactory.createUserInfoDao();
        productDao = daoFactory.createProductDao();
        System.out.println("==USERINFO TRANSACTION==");
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.getUserList();
        userInfo.setPasswd("new!!");
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.getUserList();
        userInfoDao.deleteUserInfo(userInfo);
        userInfoDao.getUserList();
        System.out.println("==PRODUCT TRANSACTION==");
        productDao.insertProduct(product);
        productDao.getProductList();
        product.setProductName("AC");
        productDao.updateProduct(product);
        productDao.getProductList();
        productDao.deleteProduct(product);
    }
}
