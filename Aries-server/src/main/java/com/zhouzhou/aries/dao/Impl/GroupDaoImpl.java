package com.zhouzhou.aries.dao.Impl;

import org.springframework.stereotype.Repository;
import com.zhouzhou.aries.dao.GroupDao;
import com.zhouzhou.aries.entity.Group;

@Repository(value = "groupDao")  
public class GroupDaoImpl extends BaseDaoImpl<Group> implements GroupDao{


}
