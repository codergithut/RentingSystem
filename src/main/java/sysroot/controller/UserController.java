package sysroot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sysroot.entity.Contract;
import sysroot.entity.User;
import sysroot.mybatis.SimpleMapper;

import java.util.ArrayList;
import java.util.List;
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
    SimpleMapper simpleMapper;

    @RequestMapping(value="", method= RequestMethod.GET)
    public Object getContract() {
        List object=new ArrayList();
        object.add(simpleMapper.findContractById("1"));
        object.add(simpleMapper.findHouseById("1"));
        object.add(simpleMapper.findStateById("1"));
        object.add(simpleMapper.findSysRoleById("1"));
        object.add(simpleMapper.findUserById("1"));
        return object;
    }

}