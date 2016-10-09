package com.zhouzhou.aries.service.Impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.zhouzhou.aries.dao.UserDao;
import com.zhouzhou.aries.dao.UserGroupLinkDao;
import com.zhouzhou.aries.entity.User;
import com.zhouzhou.aries.entity.UserGroupLink;
import com.zhouzhou.aries.service.UserGroupLinkService;
import com.zhouzhou.aries.service.UserService;

/**
 * 
 * @author zhouzhou
 *
 */
@Service("userGroupLinkService")
@Transactional
public class UserGroupLinkServiceImpl extends
		BaseServiceImpl<UserGroupLink, UserGroupLinkDao> implements
		UserGroupLinkService {

	private final static Log LOG = LogFactory
			.getLog(UserGroupLinkServiceImpl.class);

	/**
	 * 注入DAO
	 */
	@Resource(name = "userGroupLinkDao")
	public void setDao(UserGroupLinkDao dao) {
		super.setDao(dao);
	}

}
