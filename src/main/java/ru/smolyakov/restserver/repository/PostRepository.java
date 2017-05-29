package ru.smolyakov.restserver.repository;

import org.springframework.data.repository.CrudRepository;
import ru.smolyakov.restserver.model.Post;

public interface PostRepository extends CrudRepository<Post, Integer> {

}
