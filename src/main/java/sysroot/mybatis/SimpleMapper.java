package sysroot.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import sysroot.entity.*;

/**
 * @author <a href="mailto:Administrator@gtmap.cn">Administrator</a>
 * @version 1.0, 2016/12/30
 * @description
 */
@Mapper
public interface SimpleMapper {

    @Select("select * from info_contract where id = #{id}")
    Contract findContractById(@Param("id") String id);

    @Select("select * from info_house where id = #{id}")
    House findHouseById(@Param("id") String id);

    @Select("select * from info_state where id = #{id}")
    State findStateById(@Param("id") String id);

    @Select("select * from info_sys_role where id = #{id}")
    SysRole findSysRoleById(@Param("id") String id);

    @Select("select * from info_user where id = #{id}")
    User findUserById(@Param("id") String id);



}
