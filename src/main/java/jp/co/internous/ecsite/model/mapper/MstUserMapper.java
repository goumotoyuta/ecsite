package jp.co.internous.ecsite.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.ecsite.model.domain.MstUser;
import jp.co.internous.ecsite.model.form.LoginForm;

	
	@Mapper
	public interface MstUserMapper {
		
		@Select(value="SELECT * FROM mst_user WHERE user_name = #{userName} and password = #{password}")
		MstUser findByUserNameAndPassword(LoginForm form);
		
		//ログインに入力された情報がDBにあるか確認するため
		@Select(value="SELECT count(id) FROM mst_user WHERE user_name = #{userName}")
		int findCountByUserName(String userName);
	}
	

