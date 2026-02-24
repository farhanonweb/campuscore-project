package com.farhan.campuscore.controller;

import com.farhan.campuscore.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

    private List<Student> students = new ArrayList<>();

    // Add Student
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Student added successfully!";
    }

    // Get All Students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return students;
    }

    // Get Student By ID
    @GetMapping("/students/{id}")
    public Object getStudentById(@PathVariable int id) {

        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }

        return "Student not found with ID: " + id;
    }

    // Delete Student
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {

        boolean removed = false;

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                removed = true;
                break;
            }
        }

        if (removed) {
            return "Student deleted successfully!";
        } else {
            return "Student not found with ID: " + id;
        }
    }

    // Topper API
    @GetMapping("/topper")
    public Object getTopper() {

        if (students.isEmpty()) {
            return "No students available";
        }

        Student topper = students.get(0);

        for (Student s : students) {
            if (s.getMarks() > topper.getMarks()) {
                topper = s;
            }
        }

        return topper;
    }

    // Count API
    @GetMapping("/count")
    public int getCount() {
        return students.size();
    }
}