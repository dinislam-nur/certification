package ru.innopolis.student.dinislam.certification.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.innopolis.student.dinislam.certification.repositories.jdbc.StudentsRepository;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentsRepository studentsRepository;

    public List<Map<String, Object>> getAllStudents() {
        return studentsRepository.findAll();
    }
}
