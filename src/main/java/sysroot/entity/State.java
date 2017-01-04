package sysroot.entity;

import javax.persistence.*;

/**
 * Created by zhangyu2 on 2016/11/25.
 * 个人建议添加个默认构造方法和带全参数的构造方法可以方便jdbc封装
 */
@Entity
@Table(name="info_state")
public class State {
    private Long id ;
    private Long contract_id;
    private String state_type;


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getContract_id() {
        return contract_id;
    }

    public String getState_type() {
        return state_type;
    }

    public void setContract_id(Long contract_id) {
        this.contract_id = contract_id;
    }

    public void setState_type(String state_type) {
        this.state_type = state_type;
    }
}
