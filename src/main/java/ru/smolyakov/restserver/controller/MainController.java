package ru.smolyakov.restserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.smolyakov.restserver.model.Post;
import ru.smolyakov.restserver.service.MainService;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:8080/")
@CrossOrigin
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "/post/{content}", method = RequestMethod.GET)
    public String post(@PathVariable String content) {
        return mainService.post(content);
    }

    @RequestMapping(value = "/post/all", method = RequestMethod.GET)
    //, produces = "application/json"
    public List<Post> getAll(){
        return mainService.getAll();
    }
}
