package com.zhouzhou.aries.dao.Impl;

import org.springframework.stereotype.Repository;

import com.zhouzhou.aries.dao.LogDao;
import com.zhouzhou.aries.dao.UserGroupLinkDao;
import com.zhouzhou.aries.entity.Log;
import com.zhouzhou.aries.entity.UserGroupLink;

@Repository(value = "userGroupLinkDao")  
public class UserGroupLinkDaoImpl extends BaseDaoImpl<UserGroupLink> implements UserGroupLinkDao{


}
