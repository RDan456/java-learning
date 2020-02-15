package cn.bytego.proxy.impl;

import cn.bytego.proxy.UserDAO;

/**
 * 接口实现类
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public boolean login(String account, String password) {

        if(account.equals("rd") && password.equals("rd")) {

            System.out.println("登录成功........");
            return true;
        }
        return false;
    }
}
