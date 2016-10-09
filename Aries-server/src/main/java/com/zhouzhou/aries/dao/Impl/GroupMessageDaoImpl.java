package com.zhouzhou.aries.dao.Impl;

import org.springframework.stereotype.Repository;
import com.zhouzhou.aries.dao.GroupMessageDao;
import com.zhouzhou.aries.entity.GroupMessage;

@Repository(value = "groupMessageDao")  
public class GroupMessageDaoImpl extends BaseDaoImpl<GroupMessage> implements GroupMessageDao{


}
