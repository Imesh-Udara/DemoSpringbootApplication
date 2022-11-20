package com.amigodemo.demo.config;

import com.amigodemo.demo.entity.Student;
import com.amigodemo.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student imesh =  new Student(
                    "Imesh",
                    "udara@gmail.com",
                    LocalDate.of(2000, JANUARY,12)

            );



            Student udara =  new Student(
                    "Udara",
                    "imesh@gmail.com",
                    LocalDate.of(2004, JANUARY,12)

            );

            repository.saveAll(
                    List.of(imesh,udara)
            );
        };
    }
}
