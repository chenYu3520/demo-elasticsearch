package com.sx.demoelasticsearch.service;/**
 * @Auther: username
 * @Date: 5/10/24 21:50
 * @Description:
 */

import com.sx.demoelasticsearch.entity.User;

/**
 *
 * <p>Title: UserService</p>
 * <p>Description: </p>
 * @author yu.chen
 * @date 5/10/24 21:50
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 5/10/24   yu.chen    初始创建
 * -----------------------------------------------
 */

public interface UserService {
    User save(User user);
    void delete(User user);
    Iterable<User> getAll();
}
