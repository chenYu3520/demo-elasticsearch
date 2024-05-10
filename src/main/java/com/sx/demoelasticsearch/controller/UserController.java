package com.sx.demoelasticsearch.controller;/**
 * @Auther: username
 * @Date: 5/10/24 21:52
 * @Description:
 */

import com.sx.demoelasticsearch.entity.User;
import com.sx.demoelasticsearch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * <p>Title: UserController</p>
 * <p>Description: </p>
 * @author yu.chen
 * @date 5/10/24 21:52
 * ------------------- History -------------------
 * <date>       <author>        <desc>
 * 5/10/24      yu.chen         初始创建
 * -----------------------------------------------
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/insert")
    public String insert() {
        User user = new User();
        user.setId("1");
        user.setUsername("张三");
        user.setPassword("zhangsan");
        userService.save(user);
        return getAll();
    }

    @RequestMapping("/delete")
    public String delete() {
        User user = new User();
        user.setId("1");
        userService.delete(user);
        return getAll();
    }

    @RequestMapping("/getAll")
    public String getAll() {
        List<User> list = new ArrayList<>();
        Iterable<User> iterable = userService.getAll();
        iterable.forEach(e->list.add((User) e));
        return list.toString();
    }
}
