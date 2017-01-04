package sysroot.entity;

import javax.persistence.*;

/**
 * Created by zhangyu2 on 2016/11/25.
 * 个人建议添加个默认构造方法和带全参数的构造方法可以方便jdbc封装
 */
@Entity
@Table(name="info_contract")
public class Contract {
    private Long id ;
    private Long rental;
    private Long house_id;
    private Long contract_temp;
    private String type_pay;
    private String description;
    private String start_time;
    private String end_time;
    private float pledge_pay;
    private float before_pay;
    private int rental_type;
    private String rental_get;
    private String rental_space;


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getRental() {
        return rental;
    }

    public Long getHouse_id() {
        return house_id;
    }

    public Long getContract_temp() {
        return contract_temp;
    }

    public String getType_pay() {
        return type_pay;
    }

    public String getDescription() {
        return description;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public float getPledge_pay() {
        return pledge_pay;
    }

    public float getBefore_pay() {
        return before_pay;
    }

    public int getRental_type() {
        return rental_type;
    }

    public String getRental_get() {
        return rental_get;
    }

    public String getRental_space() {
        return rental_space;
    }

    public void setRental(Long rental) {
        this.rental = rental;
    }

    public void setHouse_id(Long house_id) {
        this.house_id = house_id;
    }

    public void setContract_temp(Long contract_temp) {
        this.contract_temp = contract_temp;
    }

    public void setType_pay(String type_pay) {
        this.type_pay = type_pay;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void setPledge_pay(float pledge_pay) {
        this.pledge_pay = pledge_pay;
    }

    public void setBefore_pay(float before_pay) {
        this.before_pay = before_pay;
    }

    public void setRental_type(int rental_type) {
        this.rental_type = rental_type;
    }

    public void setRental_get(String rental_get) {
        this.rental_get = rental_get;
    }

    public void setRental_space(String rental_space) {
        this.rental_space = rental_space;
    }
}
