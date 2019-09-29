package com.south.service.impl;

import com.south.common.enums.DataSourceType;
import com.south.dao.SysTwoDao;
import com.south.dao.SysUserOneDao;
import com.south.model.entity.dbone.SysUserOne;
import com.south.model.entity.dbtwo.SysTwo;
import com.south.service.DbService;
import com.south.system.annotation.DB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Mr.裴
 * @create 2019/9/29
 * @Description:
 **/
@Service
public class DbServiceImpl implements DbService {

    @Autowired
    private SysUserOneDao sysUserOneDao;

    @Autowired
    private SysTwoDao sysTwoDao;

    @DB
    @Override
    public SysUserOne selectUser(long id) {
        return sysUserOneDao.selectById(id);
    }

    @DB(DataSourceType.DB2)
    @Override
    public SysTwo selectTwo(long id) {
        return sysTwoDao.selectById(id);
    }

    @Override
    public int insertUser(SysUserOne sysUserOne) {
        return sysUserOneDao.insert(sysUserOne);
    }

    @DB(DataSourceType.DB2)
    @Override
    public int insertTwo(SysTwo sysTwo) {
        return sysTwoDao.insert(sysTwo);
    }
}
