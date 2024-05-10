package com.sx.demoelasticsearch.service.impl;/**
 * @Auther: username
 * @Date: 5/10/24 21:50
 * @Description:
 */

import com.sx.demoelasticsearch.dao.UserRepository;
import com.sx.demoelasticsearch.entity.User;
import com.sx.demoelasticsearch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * <p>Title: UserServiceImpl</p>
 * <p>Description: </p>
 * @author yu.chen
 * @date 5/10/24 21:50
 * ------------------- History -------------------
 * <date>       <author>        <desc>
 * 5/10/24      yu.chen         初始创建
 * -----------------------------------------------
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }
}
