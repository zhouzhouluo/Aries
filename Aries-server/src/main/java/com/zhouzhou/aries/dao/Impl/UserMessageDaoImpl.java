package com.zhouzhou.aries.dao.Impl;

import org.springframework.stereotype.Repository;
import com.zhouzhou.aries.dao.UserMessageDao;
import com.zhouzhou.aries.entity.UserMessage;

@Repository(value = "userMessageDao")  
public class UserMessageDaoImpl extends BaseDaoImpl<UserMessage> implements UserMessageDao{


}
