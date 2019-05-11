package com.okan.studentserver.controller;

import com.okan.studentserver.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Okan UZUN
 * @date 2019-05-11
 */
@RestController
public class StudentController {
    @GetMapping("/list")
    public List<Student> getAllStudent() {

        List<Student> students = new ArrayList<>();

        students.add(new Student("1741", "Mehmet", "Emin"));
        students.add(new Student("6223", "Murat", "Kaya"));

        return students;
    }
}
