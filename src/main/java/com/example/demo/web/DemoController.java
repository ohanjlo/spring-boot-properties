package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Value("${blog.address}")
	String address;

	@Value("${blog.author}")
	String author;

	@Value("${blog.desc}")
	String desc;

	@Value("${blog.number}")
	String number;

	@Autowired
	private Config config;

	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public String demo() {
		return desc;
	}

	@RequestMapping(value = "/my", method = RequestMethod.GET)
	public String number() {
		return number;
	}

	@RequestMapping(value = "/config", method = RequestMethod.GET)
	public List<String> config() {
		return config.getHobby();
	}

	@RequestMapping(value = "/code", method = RequestMethod.GET)
	public String code() {
		return config.getCode();
	}

}
