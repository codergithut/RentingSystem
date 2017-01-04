package sysroot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sysroot.entity.User;
import sysroot.mybatis.UserMapper;

import java.util.Map;


/**
 * Created by Administrator on 2016/11/29.
 *
 * 应用freemarker需要pom文件引入对应的boot-start-freemarker包
 * 配置文件中添加属性样式如下
 * spring.freemarker.template-loader-path[0]=classpath:/templates/error/
 * spring.freemarker.template-loader-path[1]=classpath:/templates/service/
 * ect
 * 视图路径就是自动扫描路径加配置路径加返回的字符串的值后缀会自动识别
 *测试方法入口  http://localhost:8080/rest/1
 */

@RestController
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    UserMapper userMapper;


    @RequestMapping(value="", method= RequestMethod.GET)
    public User getUser() {
        User user=userMapper.findUserByNameByAnnotation("11");
        return user;
    }

}