package com.trip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trip.mapper.UserMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/course/*")
public class CourseController {
	private UserMapper mapper;
	
	@RequestMapping("list.do")
	public String list(Model model) {
		log.info("------- courseList -------");
		return "course/courseList";
	}
	
	@RequestMapping("page.do")
	public String page(Model model) {
		log.info("------- coursePage -------");
		return "course/coursePage";
	}
	
}