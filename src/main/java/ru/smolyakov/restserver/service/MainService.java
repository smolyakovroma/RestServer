package ru.smolyakov.restserver.service;

import org.springframework.web.bind.annotation.PathVariable;
import ru.smolyakov.restserver.model.Post;

import java.util.List;

public interface MainService {
    String post(@PathVariable String content);
    List<Post> getAll();
}
