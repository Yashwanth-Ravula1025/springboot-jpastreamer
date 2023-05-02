package com.UST.studentjpastream.service;

import com.UST.studentjpastream.entity.Student;
import com.UST.studentjpastream.repository.StudentRepo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private JPAStreamer jpaStreamer;

    @Autowired
    private StudentRepo studentRepo;
    public List<Student> saveStudents(List<Student> student) {

        return studentRepo.saveAll(student);
    }

    public List<Student> getAllStudents() {

        return studentRepo.findAll();
    }

    public Long getStudentCountForCourses(List<String> course) {

        return jpaStreamer.stream(Student.class)
                .flatMap(student -> student.getCourses().stream())
                .filter(courses -> course.contains(course))
                .distinct()
                .count();
    }
}
