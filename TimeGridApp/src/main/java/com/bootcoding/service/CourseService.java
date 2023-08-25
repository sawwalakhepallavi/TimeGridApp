package com.bootcoding.service;

import com.bootcoding.model.Course;
import com.bootcoding.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    public void insertCourse(List<Course> courses){
        courseRepo.saveAll(courses);
    }
}
