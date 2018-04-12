package org.acw.dao;

import org.acw.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author yinliangyun
 *
 * 2018年3月26日-下午9:19:00
 */
public interface UserDao {
	
	@Select("select * from t_user where id = #{id}")
	User findById(@Param(value="id") Integer id);
	
	/**
	 * 根据用户名查询
	 * @param userName
	 * @return
	 */
	@Select("select id, user_name, password, true_name, email, phone from acw_user "
			+ "where user_name = #{userName} and is_valid = 1")
	User findByUserName(@Param(value="userName") String userName);
	
}
