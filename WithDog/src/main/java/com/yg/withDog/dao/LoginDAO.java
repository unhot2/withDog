package com.yg.withDog.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yg.withDog.dto.LoginDTO;

@Repository
public class LoginDAO {

	@Autowired
	SqlSession sqlSession;

	public List<LoginDTO> LoginChk(LoginDTO dto) {
		return sqlSession.selectList("sql.listall", dto);
	}

	public List<LoginDTO> listall() {
		return sqlSession.selectList("sql.listall");
	}
}
