package com.zhouzhou.aries.dao.Impl;

import org.springframework.stereotype.Repository;
import com.zhouzhou.aries.dao.UserVerificationDao;
import com.zhouzhou.aries.entity.UserVerification;

@Repository(value = "userVerficationDao")  
public class UserVerficationDaoImpl extends BaseDaoImpl<UserVerification> implements UserVerificationDao{


}
