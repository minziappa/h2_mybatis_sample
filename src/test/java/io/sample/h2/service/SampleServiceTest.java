package io.sample.h2.service;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.sample.h2.bean.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springConfig-test.xml"})
public class SampleServiceTest {

	@Autowired
	private SampleService sampleService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before");
	}

	@Test
	public void testSpringJdbc() {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After");
	}

}