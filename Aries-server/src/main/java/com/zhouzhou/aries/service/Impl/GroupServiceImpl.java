package com.zhouzhou.aries.service.Impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.zhouzhou.aries.dao.GroupDao;
import com.zhouzhou.aries.entity.Group;
import com.zhouzhou.aries.service.GroupService;

/**
 * 
 * @author zhouzhou
 *
 */
@Service("groupService")  
@Transactional 
public class GroupServiceImpl extends BaseServiceImpl<Group,GroupDao> implements GroupService{
	
	private final static Log LOG = LogFactory.getLog(GroupServiceImpl.class); 
	
	/** 
     * 注入DAO 
     */  
    @Resource(name = "groupDao")  
    public void setDao(GroupDao dao) {  
        super.setDao(dao); 
    }

}
