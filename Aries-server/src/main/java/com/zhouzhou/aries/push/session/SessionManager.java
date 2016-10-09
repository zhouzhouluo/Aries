package com.zhouzhou.aries.push.session;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.mina.core.session.IoSession;

public class SessionManager {

	private static SessionManager instance;
	private Map<String, ClientSession> clientSessions = new ConcurrentHashMap<String, ClientSession>();
	
	
	public static SessionManager getInstance() {
		if (instance == null) {
			synchronized (SessionManager.class) {
				instance = new SessionManager();
			}
		}
		return instance;
	}

	public ClientSession createSession(IoSession ioSession){
		ClientSession clientSession = new ClientSession(ioSession);
		return clientSession;
	}
	
	public void addClientSession(String name,ClientSession clientSession){
		clientSessions.put(name, clientSession);
	}
	
	public void removeClientSession(String name){
		clientSessions.remove(name);
	}
	
}
