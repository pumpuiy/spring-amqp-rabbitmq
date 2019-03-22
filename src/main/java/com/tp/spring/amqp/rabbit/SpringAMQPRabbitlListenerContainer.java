package com.tp.spring.amqp.rabbit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAMQPRabbitlListenerContainer {
	public static void main(String[] args) {
        // Initialize Spring IOC Container
        new ClassPathXmlApplicationContext("springamqp-rabbt-listener-context.xml");
	}
}
