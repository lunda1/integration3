package com.company.team.business.infrastructure.db.mapper;

import com.company.team.business.domain.model.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user_account WHERE name = #{name}")
    User findByName(String name);

    @Insert("INSERT INTO user_account (name) VALUES(#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(User user);

    @Select("SELECT * FROM user_account WHERE id = #{id}")
    Optional<User> findById(Integer id);
}
