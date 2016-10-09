package com.zhouzhou.aries.dao.Impl;

import org.springframework.stereotype.Repository;
import com.zhouzhou.aries.dao.LogDao;
import com.zhouzhou.aries.entity.Log;

@Repository(value = "logDao")  
public class LogDaoImpl extends BaseDaoImpl<Log> implements LogDao{


}
