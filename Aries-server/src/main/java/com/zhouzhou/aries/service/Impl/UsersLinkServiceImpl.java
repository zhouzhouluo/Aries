package com.zhouzhou.aries.service.Impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import com.zhouzhou.aries.dao.UserDao;
import com.zhouzhou.aries.dao.UsersLinkDao;
import com.zhouzhou.aries.entity.UsersLink;
import com.zhouzhou.aries.service.UserService;
import com.zhouzhou.aries.service.UsersLinkService;

/**
 * 
 * @author zhouzhou
 *
 */
@Service("usersLinkService")  
@Transactional 
public class UsersLinkServiceImpl extends BaseServiceImpl<UsersLink,UsersLinkDao> implements UsersLinkService{
	
	private final static Log LOG = LogFactory.getLog(UsersLinkServiceImpl.class); 
	
	/** 
     * 注入DAO 
     */  
    @Resource(name = "usersLinkDao")  
    public void setDao(UsersLinkDao dao) {  
        super.setDao(dao);  
    }

}
