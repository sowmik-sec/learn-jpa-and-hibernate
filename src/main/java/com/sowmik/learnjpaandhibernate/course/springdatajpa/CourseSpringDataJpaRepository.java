package com.sowmik.learnjpaandhibernate.course.springdatajpa;

import com.sowmik.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
