package com.UST.studentjpastreamer.service;


import com.UST.studentjpastreamer.entity.Student;
import com.UST.studentjpastreamer.repository.StudentRepo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private JPAStreamer jpaStreamer;

    public List<Student> saveStudents(List<Student> student) {

        return studentRepo.saveAll(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Long getStudentCountForCourses(List<String> course) {
        return jpaStreamer.stream(Student.class)
                .flatMap(student -> student.getCourse().stream())
                .filter(courses -> course.contains(courses))
                .distinct()
                .count();
    }
}
