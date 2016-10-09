package com.zhouzhou.aries.service.Impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.zhouzhou.aries.dao.LogDao;
import com.zhouzhou.aries.dao.UserDao;
import com.zhouzhou.aries.entity.Log;
import com.zhouzhou.aries.entity.User;
import com.zhouzhou.aries.service.LogService;
import com.zhouzhou.aries.service.UserService;

/**
 * 
 * @author zhouzhou
 *
 */
@Service("logService")  
@Transactional 
public class LogServiceImpl extends BaseServiceImpl<Log,LogDao> implements LogService{
	
	private final static org.apache.commons.logging.Log LOG = LogFactory.getLog(LogServiceImpl.class); 
	
	/** 
     * 注入DAO 
     */  
    @Resource(name = "logDao")  
    public void setDao(LogDao dao) {  
        super.setDao(dao);  
    }

}
