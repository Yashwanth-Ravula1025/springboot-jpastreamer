package com.UST.studentjpastream.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedEntityGraph;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private String studentid;
    private String studentName;
    private String studentEmail;
    private String studentPhoneNo;
    private String qualification;
    private String experience;
    @ElementCollection
    private List<String> courses;
    private String address;
    private String comment;
}
