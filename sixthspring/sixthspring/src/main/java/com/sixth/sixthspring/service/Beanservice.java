package com.sixth.sixthspring.service;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sixth.sixthspring.Bean1.Bean1;

@Service

public class Beanservice {
	public List<Bean1> display(int cd)
	{
		return Arrays.asList(new Bean1(1,"sankari"),
				           new Bean1(2,"moni"),
				           new Bean1(3,"pri"),
		                   new Bean1(4,"mohan"));
	}
	public List<Bean1>sample(int a)
	{
		return Arrays.asList(new Bean1(a,"sowmi"));
	}
	public List<Bean1>sample1(Bean1 bi)
	{
		return Arrays.asList(new Bean1(4,"kumar"));
		
	}
}
							   