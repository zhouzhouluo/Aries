package com.zhouzhou.aries.controller;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhouzhou.aries.entity.User;
import com.zhouzhou.aries.push.mina.handle.PushServerHandler;
import com.zhouzhou.aries.service.UserService;

/**
 * 
 * @author zhouzhou
 *
 */
@RequestMapping("user")
@Controller
public class UserController {
	
	private final static Log LOG = LogFactory.getLog(UserController.class);
	
	@Resource(name = "userService")  
    private UserService userService;
	
	@RequestMapping("/save")
	public String sayhello(){
		User user = new User();
		user.setNickname("洲洲罗");
		System.out.println("aaaaaaaaaaaaaaaa");
		LOG.debug("DDDDDDDDDDDDDDDDDDDD");
//		userService.save(user);
		userService.a();
		return null;
	}
}
