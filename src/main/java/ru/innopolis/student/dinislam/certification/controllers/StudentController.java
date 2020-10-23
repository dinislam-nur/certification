package ru.innopolis.student.dinislam.certification.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.innopolis.student.dinislam.certification.services.StudentService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping("/students")
    public Object getAll() {
        return service.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Object getById(@PathVariable("id") Long id) {
        return service.getStudentById(id);
    }
}
