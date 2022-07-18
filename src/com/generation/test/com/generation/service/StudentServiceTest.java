package com.generation.service;

import com.generation.model.Student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    StudentService studentService;

    @BeforeEach
    void setUp() {
        studentService = new StudentService();
        studentService.subscribeStudent(new Student("1234", "John One", "test1@mail.com", new Date(1990, 1, 1)));
        studentService.subscribeStudent(new Student("1235", "John Two", "test2@mail.com", new Date(1990, 2, 2)));
    }


    @Test
    void findStudent() {
        // check that this student exists, should work since they're in BeforeEach
        assertEquals("1234", studentService.findStudent("1234").getId());
    }

    @Test
    void findStudentNotFound() {
        // check that this student doesn't exist
        assertNull(studentService.findStudent("1236"));
    }

}