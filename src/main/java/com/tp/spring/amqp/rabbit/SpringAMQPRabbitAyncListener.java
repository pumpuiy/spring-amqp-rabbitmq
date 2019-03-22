
package com.tp.spring.amqp.rabbit;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
// Spirng MDP(Message Driven POJO)
public class SpringAMQPRabbitAyncListener implements MessageListener {

	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		System.out.println("Listener received message = " + new String(message.getBody()));
	}
	
}
