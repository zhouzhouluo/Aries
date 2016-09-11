package com.zhouzhou.aries.service.Impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import com.zhouzhou.aries.dao.UserDao;
import com.zhouzhou.aries.entity.User;
import com.zhouzhou.aries.service.UserService;

/**
 * 
 * @author zhouzhou
 *
 */
@Service("userService")  
@Transactional 
public class UserServiceImpl extends BaseServiceImpl<User,UserDao> implements UserService{
	
	private final static Log LOG = LogFactory.getLog(UserServiceImpl.class); 
	
	/** 
     * 注入DAO 
     */  
    @Resource(name = "userDao")  
    public void setDao(UserDao dao) {  
        super.setDao(dao);  
    }
    
	@Override
    public void a(){
		LOG.debug("aaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbb");
    	dao.delete(1);
    	dao.ab();
    }
    
}
