package huijingyuan.mulan.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import huijingyuan.mulan.model.User;

@Mapper
public interface UserDao {
	@Insert("insert into mulan_user (user_name,user_password,user_token) values(#{user_name},#{user_password},#{user_token})")
	public int insertUser(User user);

	@Select("select id from mulan_user where user_token=#{token}")
	public int queryUserByToken(String token);
	
	@Select("select * from mulan_user where user_name=#{user_name} and user_password= #{user_password};")
	public User queryUserByNameAndPassword(User user);
}
