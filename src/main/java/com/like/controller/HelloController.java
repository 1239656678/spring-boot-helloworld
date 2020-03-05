package com.like.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author WIN8.1
 * 这个类的所有返回的数据直接写给浏览器，如果是对象转为json数据
 */
@RestController//相当于ResponseBody和Controller
public class HelloController {
  @RequestMapping("/hello")
  public String hello() {
	  return "hello";
  }
  @RequestMapping("demo")
  public Object demo() {
	  Map<String, Object> map=new HashMap<String, Object>();
	  map.put("one", 123);
	  map.put("two", 8888);
	  map.put("three", "hello");
	  return map;
  }
  @RequestMapping("hello")
  public Object hello() {
	  Map<String, Object> map=new HashMap<String, Object>();
	  map.put("one", 123);
	  map.put("two", 8888);
	  map.put("three", "hello");
	  return map;
  }
}
