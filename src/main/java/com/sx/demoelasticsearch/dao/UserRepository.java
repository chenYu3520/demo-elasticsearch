package com.sx.demoelasticsearch.dao;/**
 * @Auther: username
 * @Date: 5/10/24 21:47
 * @Description:
 */

import com.sx.demoelasticsearch.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * <p>Title: UserRepository</p>
 * <p>Description: </p>
 * @author yu.chen
 * @date 5/10/24 21:47
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 5/10/24   yu.chen    初始创建
 * -----------------------------------------------
 */

@Repository
public interface UserRepository extends ElasticsearchRepository<User, String> {
}
