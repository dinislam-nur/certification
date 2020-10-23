package ru.innopolis.student.dinislam.certification.repositories.jdbc;

import lombok.val;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentsRepositoryTest {

//    private final Flyway flyway;
//    private final StudentsRepository studentsRepository;
//
//    private List<Map<String, Object>> answer;
//
//    StudentsRepositoryTest(Flyway flyway, StudentsRepository studentsRepository) {
//        this.flyway = flyway;
//        this.studentsRepository = studentsRepository;
//    }
//
//    @BeforeEach
//    void setUp() {
//        flyway.clean();
//        flyway.migrate();
//
//        answer = Arrays.asList(
//                new HashMap<String, Object>() {{
//                    put("id", 1);
//                    put("full_name", "Pavel Petrov");
//                    put("course", 2);
//                    put("discipline", "Math");
//                }}
//        );
//    }
//
//    @Test
//    void findAll() {
//        val result = studentsRepository.findAll();
//    }
//
//    @Test
//    void findById() {
//        val result = studentsRepository.findById(1L);
//        val values = new ArrayList<>(result.values());
//        val answerValues = new ArrayList<>(answer.get(0).values());
//
//        for (int i = 0; i < values.size(); i++) {
//            assertEquals(values.get(i), answerValues.get(i));
//        }
//    }
}