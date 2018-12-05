package cn.deepclue.eyes.mapper.cas;

import cn.deepclue.eyes.domain.po.cas.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Mapper
@Repository
public interface UserMapper {
    @Select("SELECT count(*) FROM user")
    Integer getCasUser();

    @Select("SELECT * FROM user WHERE id=#{id}")
    User getUserById(@Param("id") String id);

    @Insert("INSERT INTO user(id,create_time,deleted,comment,name,password,create_user,org_id) " +
            "VALUES(#{id},#{createTime},#{deleted},#{comment},#{name},#{password},#{createUser},#{orgId})")
    void addUser(User user);

    @Update("UPDATE user SET deleted=1,delete_time=#{deleteTime},delete_user=#{deleteUser} WHERE id=#{id}")
    void deleteUserById(@Param("id") String id, @Param("deleteTime")Date deleteTime, @Param("deleteUser") String deleteUser);

    @Update("UPDATE user SET name=#{name},update_time=#{updateTime},update_user=#{updateUser} WHERE id=#{id}")
    void updateNameById(@Param("id") String id, @Param("name")String name, @Param("updateTime")Date updateTime, @Param("updateUser")String updateUser);
}
