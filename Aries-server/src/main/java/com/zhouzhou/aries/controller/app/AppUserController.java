package com.zhouzhou.aries.controller.app;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhouzhou.aries.controller.model.MessageCode;
import com.zhouzhou.aries.controller.model.Results;
import com.zhouzhou.aries.entity.User;
import com.zhouzhou.aries.service.UserService;

/**
 * 
 * @author zhouzhou
 *
 */
@RequestMapping("app/user")
@Controller
public class AppUserController {
	
	private final static Log LOG = LogFactory.getLog(AppUserController.class);
	
	@Resource(name = "userService")  
	private UserService userService;
	
	
	@RequestMapping("/register")
	@ResponseBody
	public Results<String> register(User user){
		Results<String> results = new Results<String>();
		user.setCreatetime(new Date());
		userService.save(user);
		results.setCode(MessageCode.CODE_200);
		results.setMessage(MessageCode.MESSAGE_200);
		return results;
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public Results<String> login(User user){
		
		return null;
	}
	
}
