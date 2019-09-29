package com.south.service;

import com.south.model.entity.dbone.SysUserOne;
import com.south.model.entity.dbtwo.SysTwo;

public interface DbService {

     SysUserOne getUser(long id);

    SysTwo getTwo(long id);

}
