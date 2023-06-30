package com.selflearning.selflearning.restapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.selflearning.selflearning.restapi.user.SomeBean;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	public SomeBean filtering() {
		
		return new SomeBean("value1","value2","value3");
		
	}

	//static filtering
	@GetMapping("/filtering-List")
	public List<SomeBean> filteringList() {
		
		return Arrays.asList( new SomeBean("value1","value2","value3"),new SomeBean("value1","value2","value3"));
		
	}

	
	
	@GetMapping("/filtering2")
	public MappingJacksonValue filtering2() {
		
		SomeBean someBean= new SomeBean("value1","value2","value3");
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		mappingJacksonValue.setFilters(filters);
		return mappingJacksonValue;
	}
}
