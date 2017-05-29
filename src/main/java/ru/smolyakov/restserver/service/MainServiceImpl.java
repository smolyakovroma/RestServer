package ru.smolyakov.restserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.smolyakov.restserver.model.Post;
import ru.smolyakov.restserver.repository.PostRepository;
import ru.smolyakov.restserver.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainServiceImpl implements MainService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;
    @Override
    public String post(String content) {
        Post post = new Post("title", content);
        post = postRepository.save(post);
        return post.getContent();
    }

    @Override
    public List<Post> getAll() {
        Iterable<Post> posts = postRepository.findAll();
        ArrayList<Post> list = new ArrayList<>();
        for (Post post : posts) {
            list.add(post);
        }
        return list;
    }
}
