/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.IOException;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author Matthew
 */
@ServerEndpoint("/server")
public class ServerBackEnd {
    
        @OnOpen
        public void open(Session session) {
            System.out.println("test");
    }

    @OnClose
        public void close(Session session) {
            
    }

    @OnError
        public void onError(Throwable error) {
    }

    @OnMessage
        public void handleMessage(String message, Session session) throws IOException {
            
        }
    
  
}
