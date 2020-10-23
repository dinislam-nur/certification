package ru.innopolis.student.dinislam.certification.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {

    @Bean
    public NamedParameterJdbcTemplate jdbcNamedParameter(DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }
}
