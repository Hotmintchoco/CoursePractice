package com.trip.mapper;

import java.util.List;

import com.trip.domain.CourseVO;
import com.trip.domain.DesAndCourseVO;

public interface CourseMapper {
	public List<CourseVO> getList();
	public List<DesAndCourseVO> getDesList(int courseNum);
	public CourseVO readCourse(int courseNum);
}