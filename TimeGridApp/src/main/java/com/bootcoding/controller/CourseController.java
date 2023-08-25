package com.bootcoding.controller;

import com.bootcoding.model.Course;
import com.bootcoding.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/insertCourse")
    public String insertCourse(@RequestBody List<Course> course){
        courseService.insertCourse(course);
        return "Successfully";
    }


}
