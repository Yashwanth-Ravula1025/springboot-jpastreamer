package com.UST.studentjpastreamer.controller;


import com.UST.studentjpastreamer.entity.Student;
import com.UST.studentjpastreamer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public List<Student> saveStudents(@RequestBody List<Student> student){
        return studentService.saveStudents(student);
    }
    @GetMapping("/get")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{course}")
    public Long getStudentCountForCourses(@RequestParam List<String> course) {

        return studentService.getStudentCountForCourses(course);

    }


}
