package io.sample.h2.main;

import java.net.InetAddress;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.sample.h2.bean.model.UserModel;
import io.sample.h2.service.SampleService;

public class H2Main {

	public static void main(String[] args) throws Exception {

		System.out.println(" test >> " + InetAddress.getByName("localhost").getHostAddress());

		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		SampleService sampleService = (SampleService) context.getBean("sampleServiceImpl");
		UserModel user = sampleService.sltUser("kim");

		System.out.println(" name >> " + user.getHost());
	}

}