package com.example.demo.controller;

import com.example.demo.entities.Course;
import com.example.demo.services.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class MyController {

    @GetMapping("/home")
    public String home(){

        return "this is home page";
    }

    @Autowired
    private CourseServiceImpl courseService;


    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return this.courseService.getCourses();

    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

}
