package cn.com.study.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: yangyl
 * @Date: 2019/11/3 11:00
 */
@Data
public class Account {
    private String username;
    private Integer age;
    private Date birthday;
    
    private User user;
    
    private List<User> users;
    private Map<String, User> userMap;
}
