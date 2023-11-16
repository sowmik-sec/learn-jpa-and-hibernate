package com.sowmik.learnjpaandhibernate.course;

import com.sowmik.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.sowmik.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS Jpa!", "Ranga"));
        repository.save(new Course(2,"Learn Azure Jpa!", "Ranga"));
        repository.save(new Course(3, "Learn DevOps Jpa!", "Ranga"));

        repository.deleteById(2l);
        System.out.println(repository.findById(3l));
        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("Ranga"));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("Learn DevOps Jpa!"));
    }
}
