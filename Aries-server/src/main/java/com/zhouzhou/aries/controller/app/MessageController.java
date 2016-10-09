package com.zhouzhou.aries.controller.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("app/message")
@Controller
public class MessageController {

	@RequestMapping("/sendTextMessage")
	@ResponseBody
	public void sendTextMessage(){
		
	}
	
	@RequestMapping("/sendFileMessage")
	@ResponseBody
	public void sendFileMessage(){
		
	}
	
}
