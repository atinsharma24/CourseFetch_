package com.example.demo.services;

import com.example.demo.entities.Course;
import com.example.demo.services.CourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl(){

        list = new ArrayList<>();
        list.add(new Course(145, "Java", "CoreJava"));
        list.add(new Course(4343, "SpringJava", "Api using spring and Java"));
    }

    @Override
    public List<Course> getCourses() {
        return list ;
    }

    @Override
    public Course getCourse(long courseId) {

        Course c=null;

        for(Course course:list)
        {
            if(course.getId()==courseId)
            {
                c=course;
                break;
            }
        }

        return c;
    }
}
