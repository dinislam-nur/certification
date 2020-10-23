package ru.innopolis.student.dinislam.certification.repositories.jdbc;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class StudentsRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> findAll() {
        return jdbcTemplate.queryForList("SELECT * FROM students", new HashMap<>());
    }

    public Map<String, Object> findById(Long id) {
        val parameter = new HashMap<String, Object>() {{
            put("id", id);
        }};
        return jdbcTemplate
                .queryForMap("SELECT * FROM students as s WHERE s.student_id = :id", parameter);
    }
}
