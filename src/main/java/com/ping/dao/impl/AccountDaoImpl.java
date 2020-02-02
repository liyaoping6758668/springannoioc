package com.ping.dao.impl;

import com.ping.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * @author:lyp
 * @date 2020/1/31-11:59
 */
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
