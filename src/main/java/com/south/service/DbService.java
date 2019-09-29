package com.south.service;

import com.south.model.entity.dbone.SysUserOne;
import com.south.model.entity.dbtwo.SysTwo;

public interface DbService {

     SysUserOne selectUser(long id);

    SysTwo selectTwo(long id);

    int insertUser(SysUserOne sysUserOne);

    int insertTwo(SysTwo sysTwo);



}
