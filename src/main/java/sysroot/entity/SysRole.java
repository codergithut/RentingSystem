package sysroot.entity;

import javax.persistence.*;

/**
 * Created by zhangyu2 on 2016/11/25.
 * 个人建议添加个默认构造方法和带全参数的构造方法可以方便jdbc封装
 */
@Entity
@Table(name="info_sys_role")
public class SysRole {
    private Long id ;
    private String name;
    private String role;
    private String powder;
    private String password;
    private String sign;


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getPowder() {
        return powder;
    }

    public String getPassword() {
        return password;
    }

    public String getSign() {
        return sign;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPowder(String powder) {
        this.powder = powder;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
