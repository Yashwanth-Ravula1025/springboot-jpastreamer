package com.UST.studentjpastreamer.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student_table")
public class Student {

    @Id
    private String studentId;
    private String studentName;
    private String studentEmail;
    private String studentPhoneNo;
    private String qualification;
    private String workExperience;
    @ElementCollection
    private List<String> course;
    private String address;
    private String comment;


}
