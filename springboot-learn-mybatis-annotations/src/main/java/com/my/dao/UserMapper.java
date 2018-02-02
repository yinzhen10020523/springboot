package com.my.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.my.po.User;

/**
 * 
 *
 * @author: 陈明羽
 * @date: 2018年1月30日 上午11:27:59 
 *
 */
@Mapper
public interface UserMapper {

	@Select("select * from user where id = #{id}")
	User findUserByName(@Param("id") String id) throws Exception;
	
	@Insert("insert into user values (#{id},#{name},#{age},#{address})")
	void insert(User user); 
	
	@Update("update user set name=#{name},age=#{age},address=#{address} where id = #{id}")
	void update(User user); 
	
	@Delete("delete from user where id=#{id}")
	void delete(@Param("id") String id); 
}
