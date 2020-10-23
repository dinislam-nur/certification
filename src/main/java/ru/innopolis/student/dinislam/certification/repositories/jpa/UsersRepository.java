package ru.innopolis.student.dinislam.certification.repositories.jpa;

import org.springframework.data.repository.CrudRepository;
import ru.innopolis.student.dinislam.certification.entities.User;

import java.util.Optional;

public interface UsersRepository extends CrudRepository<User, Long> {

    Optional<User> findByLogin(String login);

}
