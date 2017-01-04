package sysroot.entity;

import javax.persistence.*;

/**
 * Created by zhangyu2 on 2016/11/25.
 * 个人建议添加个默认构造方法和带全参数的构造方法可以方便jdbc封装
 */
@Entity
@Table(name="info_user")
public class User {
    private Long id ;
    private String name;
    private String sex ;
    private String num_credential;
    private String role;
    private String type_credential;
    private Long contract_id;
    private Long house_id;

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

    public String getSex() {
        return sex;
    }

    public String getNum_credential() {
        return num_credential;
    }

    public String getRole() {
        return role;
    }

    public String getType_credential() {
        return type_credential;
    }

    public Long getContract_id() {
        return contract_id;
    }

    public Long getHouse_id() {
        return house_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNum_credential(String num_credential) {
        this.num_credential = num_credential;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setType_credential(String type_credential) {
        this.type_credential = type_credential;
    }

    public void setContract_id(Long contract_id) {
        this.contract_id = contract_id;
    }

    public void setHouse_id(Long house_id) {
        this.house_id = house_id;
    }
}
