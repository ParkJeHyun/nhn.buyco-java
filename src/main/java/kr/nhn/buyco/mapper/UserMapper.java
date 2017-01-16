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

import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Component;

import kr.nhn.buyco.artifacts.User;

@Component
public interface UserMapper {
	@SelectProvider(type=Provider.class, method="getAllUser")
	
	public List<User> getAllUser();
	
	public static class Provider {
		public static String getAllUser() {
			BEGIN();
			SELECT("*");
			FROM("`user`");			
			return SQL();
		}
	}
}
