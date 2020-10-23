package ru.innopolis.student.dinislam.certification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("ru.innopolis.student.dinislam.certification.repositories.jpa")
public class CertificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CertificationApplication.class, args);
    }

}
