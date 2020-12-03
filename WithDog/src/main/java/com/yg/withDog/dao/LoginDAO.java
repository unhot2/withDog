package com.yg.withDog.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yg.withDog.dto.LoginDTO;

@Repository
public class LoginDAO {

	@Autowired
	SqlSession sqlSession;

	public boolean LoginChk(LoginDTO dto) {
		boolean chk = false;
		int num = sqlSession.insert("sql.loginChk", dto);
		System.out.println("num값 : " + num);
		if (num == 0) {
			System.out.println("실패");
		} else if (num == 1) {
			System.out.println("성공");
			chk = true;
		}
		return chk;
	}

}
