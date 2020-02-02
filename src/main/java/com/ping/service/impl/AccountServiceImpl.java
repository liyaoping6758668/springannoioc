package com.ping.service.impl;

import com.ping.dao.IAccountDao;
import com.ping.dao.impl.AccountDaoImpl;
import com.ping.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author:lyp
 * @date 2020/1/31-11:57
 */
@Component
public class AccountServiceImpl implements IAccountService {

//    @Autowired
    @Resource(name = "accountDao")
    private IAccountDao iAccountDao;

    public AccountServiceImpl() {
        System.out.println("创建对象");
    }

    @Override
    public void saveAccount() {
        iAccountDao.saveAccount();
        System.out.println("方法被调用了");
    }
}
