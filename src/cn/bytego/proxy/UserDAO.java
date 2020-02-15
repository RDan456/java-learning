package cn.bytego.proxy;

/**
 * 定义用户操作的接口
 */
public interface UserDAO {

    public boolean login(String account, String password);
}
