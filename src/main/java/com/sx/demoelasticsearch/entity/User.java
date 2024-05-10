package com.sx.demoelasticsearch.entity;/**
 * @Auther: username
 * @Date: 5/10/24 18:23
 * @Description:
 */
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
/**
 *
 * <p>Title: User</p>
 * <p>Description: </p>
 * @author yu.chen
 * @date 5/10/24 18:23
 * ------------------- History -------------------
 * <date>       <author>        <desc>
 * 5/10/24      yu.chen         初始创建
 * -----------------------------------------------
 */
@Data
@Document(indexName = "user")
public class User implements Serializable {
    @Id
    private String id; // id
    private String username; // 用户名
    private String password; // 密码
}
