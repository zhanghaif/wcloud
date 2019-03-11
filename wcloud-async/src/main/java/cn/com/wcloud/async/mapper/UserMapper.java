package cn.com.wcloud.async.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import cn.com.wcloud.async.entity.User;

@Component
@Mapper
public interface UserMapper{

	
	@Insert("INSERT INTO user (use_id, ues_name, use_age) VALUES (#{use_id}, #{ues_name}, #{use_age})")
    int insert(User user);
	
	@Select("SELECT * FROM user")
	List<User> list();
}
