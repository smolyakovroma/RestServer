package ru.smolyakov.restserver.repository;

import org.springframework.data.repository.CrudRepository;
import ru.smolyakov.restserver.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {


}
