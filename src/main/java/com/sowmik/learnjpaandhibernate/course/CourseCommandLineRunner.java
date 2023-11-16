package com.sowmik.learnjpaandhibernate.course;

import com.sowmik.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS Jpa!", "Ranga"));
        repository.insert(new Course(2,"Learn Azure Jpa!", "Ranga"));
        repository.insert(new Course(3, "Learn DevOps Jpa!", "Ranga"));

        repository.deleteById(2);
        System.out.println(repository.findById(3));
    }
}
