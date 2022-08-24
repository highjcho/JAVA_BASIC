package database.domain;

import database.UserInfo;

public class DaoFactory {
    public static UserInfoDao mysql;
    public static UserInfoDao oracle;

    public UserInfoDao getDB(String dbType)
    {
        if (dbType.equalsIgnoreCase("MYSQL"))
        {
            if (mysql == null)
                mysql = new MysqlDao();
            return mysql;
        }
        else if (dbType.equalsIgnoreCase("ORACLE")) {
            if (oracle == null)
                oracle = new OracleDao();
            return oracle;
        }
        return null;
    }
}
