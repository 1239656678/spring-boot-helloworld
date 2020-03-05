package com.like.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootHelloTest {
	@Test
	public void HelloTest() {
		System.out.println("HelloWorld");
	}
}
