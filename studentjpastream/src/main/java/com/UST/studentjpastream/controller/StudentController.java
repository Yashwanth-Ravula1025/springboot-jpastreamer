package com.UST.studentjpastream.controller;

import com.UST.studentjpastream.entity.Student;
import com.UST.studentjpastream.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
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
    // @GetMapping("/get/{courses}")
// public List<Student> getStudentsByCourse(@PathVariable List<Student> course) {
//
// return studentService.getStudentByCourse(course);
// }
    @GetMapping("/students/{course}")
    public Long getStudentCountForCourses(@RequestParam List<String> course) {

        return studentService.getStudentCountForCourses(course);

    }


}

