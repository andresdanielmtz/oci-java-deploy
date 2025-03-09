/**
 * Controller class for managing student-related operations.
 * Provides endpoints for retrieving and creating students.
 * 
 * Endpoints:
 * - GET /students/ : Retrieves a list of all students.
 * - GET /students/{studentId} : Retrieves a student by their ID.
 * - GET /students/hello : Simple endpoint to check if the route is working.
 * - POST /students/ : Creates a new student.
 * 
 * Uses {@link StudentService} to perform the operations.
 * 
 * @see StudentService
 */

package com.example.oci_microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.oci_microservice.model.Student;
import com.example.oci_microservice.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String getStudents() {
        return studentService.getAllStudents().toString();
    }

    @GetMapping("/{studentId}")
    public String getStudentById(Long studentId) {
        return studentService.getStudentById(studentId).toString();
    }

    @GetMapping("/hello")
    public String hello() {
        return "This (student) route is working! :3";
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

}
