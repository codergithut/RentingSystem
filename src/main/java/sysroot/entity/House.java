package sysroot.entity;

import javax.persistence.*;

/**
 * Created by zhangyu2 on 2016/11/25.
 * 个人建议添加个默认构造方法和带全参数的构造方法可以方便jdbc封装
 */
@Entity
@Table(name="info_house")
public class House {
    private Long id ;
    private String house_info;
    private String address;
    private Long other_id;
    private Long own_id;


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getHouse_info() {
        return house_info;
    }

    public String getAddress() {
        return address;
    }

    public Long getOther_id() {
        return other_id;
    }

    public Long getOwn_id() {
        return own_id;
    }

    public void setHouse_info(String house_info) {
        this.house_info = house_info;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOther_id(Long other_id) {
        this.other_id = other_id;
    }

    public void setOwn_id(Long own_id) {
        this.own_id = own_id;
    }
}
