package com.zhouzhou.aries.service.Impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.zhouzhou.aries.dao.UserDao;
import com.zhouzhou.aries.dao.UserVerificationDao;
import com.zhouzhou.aries.dao.UsersLinkDao;
import com.zhouzhou.aries.entity.UserVerification;
import com.zhouzhou.aries.entity.UsersLink;
import com.zhouzhou.aries.service.UserService;
import com.zhouzhou.aries.service.UserVerificationService;
import com.zhouzhou.aries.service.UsersLinkService;

/**
 * 
 * @author zhouzhou
 *
 */
@Service("userVerificationService")
@Transactional
public class UserVerificationServiceImpl extends
		BaseServiceImpl<UserVerification, UserVerificationDao> implements
		UserVerificationService {

	private final static Log LOG = LogFactory
			.getLog(UserVerificationServiceImpl.class);

	/**
	 * 注入DAO
	 */
	@Resource(name = "userVerificationDao")
	public void setDao(UserVerificationDao dao) {
		super.setDao(dao);
	}

}
