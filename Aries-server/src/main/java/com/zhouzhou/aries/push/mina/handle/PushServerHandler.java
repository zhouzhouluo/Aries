package com.zhouzhou.aries.push.mina.handle;

import java.util.Date;  
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.mina.core.service.IoHandler;  
import org.apache.mina.core.session.IdleStatus;  
import org.apache.mina.core.session.IoSession;  
  
public class PushServerHandler implements IoHandler {  
  
	private static Log log = LogFactory.getLog(PushServerHandler.class);
	public static Map<String,IoSession> map = new HashMap<String, IoSession>();
	
    @Override  
    public void exceptionCaught(IoSession arg0, Throwable arg1)  
            throws Exception {  
        arg1.printStackTrace();  
  
    }  
  
    @Override  
    public void messageReceived(IoSession session, Object message) throws Exception {  
          
        String str = message.toString();  
        log.info("接受到的消息:"+str);
//        System.out.println("接受到的消息:"+str);  
          
        if( str.trim().equalsIgnoreCase("quit") ) {  
            session.closeNow();
            return;  
        }  
        Date date = new Date();  
        session.write( date.toString() );  
        log.info("Message written...");
//        System.out.println("Message written...");  
    }  
  
    @Override  
    public void messageSent(IoSession arg0, Object arg1) throws Exception {  
        // TODO Auto-generated method stub  
        System.out.println("发送信息:"+arg1.toString());  
    }  
  
    @Override  
    public void sessionClosed(IoSession session) throws Exception {  
        // TODO Auto-generated method stub  
    	map.remove(session.getRemoteAddress().toString());
        System.out.println("IP:"+session.getRemoteAddress().toString()+"断开连接");  
    }  
  
    @Override  
    public void sessionCreated(IoSession session) throws Exception {  
        // TODO Auto-generated method stub  
    	map.put(session.getRemoteAddress().toString(), session);
        System.out.println("IP:"+session.getRemoteAddress().toString());  
    }  
  
    @Override  
    public void sessionIdle(IoSession session, IdleStatus status) throws Exception {  
        // TODO Auto-generated method stub  
        System.out.println( "IDLE " + session.getIdleCount( status ));  
  
    }  
  
    @Override  
    public void sessionOpened(IoSession arg0) throws Exception {  
        // TODO Auto-generated method stub 
    	System.out.println("sessionOpened--------");
    	Map<Long,IoSession>map2 = arg0.getService().getManagedSessions();
    	for (Entry<Long, IoSession> entry : map2.entrySet()) {
			   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}
    }

	@Override
	public void inputClosed(IoSession arg0) throws Exception {
		// TODO Auto-generated method stub
		 System.out.println( "inputClosed ");  
		 map.remove(arg0.getRemoteAddress().toString());
		arg0.closeNow();
	}  
  
}  
