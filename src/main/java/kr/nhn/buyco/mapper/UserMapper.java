package kr.nhn.buyco.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.springframework.stereotype.Component;

import kr.nhn.buyco.artifacts.User;

@Component
public interface UserMapper {
	
	@SelectProvider(type=Provider.class, method="getAllUser")
	public List<User> getAllUser();
	
	@SelectProvider(type=Provider.class, method="signIn")
	public User siginIn(User user);
	
	@InsertProvider(type=Provider.class, method="signUp")
	public int signUp(User user);
	
	@UpdateProvider(type=Provider.class, method="update")
	public int update(User user);
	
	@DeleteProvider(type=Provider.class, method="delete")
	public int delete(int id);
	
	public static class Provider {
		public static String getAllUser() {
			BEGIN();
			
			SELECT("*");
			FROM("`user`");			
			
			return SQL();
		}
		
		public static String signIn(User user) {
			BEGIN();
			
			SELECT("*");
			FROM("`user`");
			if(user.getOauth() != null && user.getOauth().length() != 0) {
				WHERE("oauth = #{oauth}");
			}
			else{
				WHERE("email = #{email}");
				WHERE("password = #{password}");
			}
			return SQL();
		}
		
		public static String signUp(User user) {
			BEGIN();
			
			INSERT_INTO("`user`");
			VALUES("email", "#{email}");
			VALUES("password", "#{password}");
			VALUES("address", "#{address}");
			VALUES("phone", "#{phone}");
			VALUES("oauth", "#{oauth}");
			
			return SQL();
		}
		
		public static String update(User user) {
			BEGIN();
			
			UPDATE("`user`");
			SET("address = #{address}");
			SET("phone = #{phone}");
			WHERE("id = #{id}");
			
			return SQL();
		}
		
		public static String delete(int id) {
			BEGIN();
			
			DELETE_FROM("`user`");
			WHERE("id = #{id}");
			
			return SQL();
		}
	}
}
