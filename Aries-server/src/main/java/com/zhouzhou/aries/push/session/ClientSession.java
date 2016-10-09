package com.zhouzhou.aries.push.session;

import org.apache.mina.core.session.IoSession;

public class ClientSession {
	
	private IoSession ioSession;
	
	public ClientSession(IoSession ioSession) {
		this.ioSession = ioSession;
	}
	public void close() {
		ioSession.closeNow();
	}
	
}
