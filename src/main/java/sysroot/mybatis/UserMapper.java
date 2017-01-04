package sysroot.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import sysroot.entity.User;

/**
 * @author <a href="mailto:Administrator@gtmap.cn">Administrator</a>
 * @version 1.0, 2016/12/30
 * @description
 */
@Mapper
public interface UserMapper {
    @Select("select * from users where name = #{name}")
    User findUserByNameByAnnotation(@Param("name") String name);
}
