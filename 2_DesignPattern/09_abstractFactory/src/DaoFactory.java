public abstract class DaoFactory {

    public abstract UserInfoDao createUserInfoDao();
    public abstract ProductDao createProductDao();
}

class MySqlDaoFactory extends DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMySqlDao();
    }
    @Override
    public ProductDao createProductDao() {
        return new ProductMySqlDao();
    }
}

class OracleDaoFactory extends DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();
    }
    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}