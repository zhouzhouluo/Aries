package com.zhouzhou.aries.push.handler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.zhouzhou.aries.push.session.SessionManager;

public abstract class IQHandler<T> {

	protected final Log log = LogFactory.getLog(getClass());
	protected SessionManager sessionManager;

	public IQHandler() {
		sessionManager = SessionManager.getInstance();
	}
	
	public abstract void process(T t);

}
