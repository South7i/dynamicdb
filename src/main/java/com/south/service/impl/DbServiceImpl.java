package com.south.service.impl;

import com.south.common.enums.DataSourceType;
import com.south.dao.SysTwoDao;
import com.south.dao.SysUserOneDao;
import com.south.model.entity.dbone.SysUserOne;
import com.south.model.entity.dbtwo.SysTwo;
import com.south.service.DbService;
import com.south.system.datasource.DynamicDataSourceContextHolder;
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


    @Override
    public SysUserOne getUser(long id) {
        return sysUserOneDao.selectById(id);
    }

    @Override
    public SysTwo getTwo(long id) {
        //手动切换数据源
        DynamicDataSourceContextHolder.setDataSourceType(DataSourceType.DB2.name());
        return sysTwoDao.selectById(id);
    }
}
