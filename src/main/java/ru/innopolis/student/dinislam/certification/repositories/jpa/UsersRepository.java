package ru.innopolis.student.dinislam.certification.repositories.jpa;

import org.springframework.data.repository.CrudRepository;
import ru.innopolis.student.dinislam.certification.entities.User;

public interface UsersRepository extends CrudRepository<User, Long> {
}
