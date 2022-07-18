package com.generation.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {
    CourseService courseService;

    @BeforeEach
    void setUp() {
        courseService = new CourseService();
    }



    @Test
    void getCourse() {
        // check that this course exists by seeing if we can find the credits
        assertEquals(9, courseService.getCourse("INTRO-WEB-1").getCredits());
    }

    @Test
    void getCourseNotFound() {
        assertNull(courseService.getCourse("INTRO-WEB-10"));
    }


}