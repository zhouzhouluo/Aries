package com.zhouzhou.aries.service.Impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.zhouzhou.aries.dao.GroupDao;
import com.zhouzhou.aries.dao.GroupMessageDao;
import com.zhouzhou.aries.entity.Group;
import com.zhouzhou.aries.entity.GroupMessage;
import com.zhouzhou.aries.service.GroupMessageService;
import com.zhouzhou.aries.service.GroupService;

/**
 * 
 * @author zhouzhou
 *
 */
@Service("groupMessageService")  
@Transactional 
public class GroupMessageServiceImpl extends BaseServiceImpl<GroupMessage,GroupMessageDao> implements GroupMessageService{
	
	private final static Log LOG = LogFactory.getLog(GroupMessageServiceImpl.class); 
	
	/** 
     * 注入DAO 
     */  
    @Resource(name = "groupMessageDao")  
    public void setDao(GroupMessageDao dao) {  
        super.setDao(dao); 
    }

}
