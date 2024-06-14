package com.sixth.sixthspring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sixth.sixthspring.Bean1.Bean1;
import com.sixth.sixthspring.service.Beanservice;

@RestController
@RequestMapping("/api")
public class BeanController {
	@Autowired
	Beanservice sc;
	@RequestMapping("/display/{cd}")
	public List<Bean1> display(@PathVariable int cd)
	{
		System.out.println("dfghjkl---");
		return sc.display(cd);
	}
	@RequestMapping("/sample")
	public List<Bean1>sample (@RequestParam int a)
	{
		return sc.sample(a);
	}
@PostMapping("/sample1")
public List<Bean1>sample1 (@RequestBody Bean1 bi)
{
	return sc.sample1(bi);
}
}


