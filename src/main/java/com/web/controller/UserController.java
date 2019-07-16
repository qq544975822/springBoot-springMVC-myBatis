package com.web.controller;

import com.web.dao.UserDao;
import com.web.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user")
    public String userTest(Model model){
        List<User> all = userDao.findAll();
        model.addAttribute("all",all);
        System.out.println(all);
        return "index";
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return new User(id,"zhangsan",18);
    }

    @GetMapping("/users")
    public List<User> UserList(){
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User(i,"qwe",11);
            users.add(user);
        }
        return users;
    }

    @PostMapping("/users")
    public Map<String,Object> uploadUser(User user){
        Map<String,Object> map = new HashMap<>();
        map.put("uploadUser",user);
        map.put("result", true);
        return map;
    }

    @PutMapping("/users")
    public Map<String,Object> updateUser(User user){
        Map<String,Object> map = new HashMap<>();
        map.put("uploadUser",user);
        map.put("result", true);
        return map;
    }

    @DeleteMapping("/users/{id}")
    public Map<String,Object> deleteUserById(@PathVariable("id") Integer id){
        Map<String,Object> map = new HashMap<>();
        map.put("deleteUserById", new User(id,"lisi",11));
        map.put("result",true);
        return map;
    }
}
