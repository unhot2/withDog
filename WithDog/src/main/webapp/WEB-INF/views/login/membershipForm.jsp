<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<section class="membershipForm">
	<form action="loginChk" method="post">
		<div class="form">
			<div class="login-title">
				<h3>회원가입</h3>
			</div>
			<div class="input-group">
				<div class="input">
					<input type="text" name="userId" placeholder=" UserID" required
						autofocus />
				</div>
				<div class="input">
					<input type="password" name="userPwd" placeholder=" Password"
						required />
				</div>
			</div>
			<div class="login-btn">
				<div class="btn">
					<button type="Submit">로그인</button>
				</div>
				<div class="btn">
					<button type="button" onclick="location.href='memberShip'">회원가입</button>
				</div>
				<div class="btn">
					<button type="button" onclick="location.href='userFind'">비밀번호
						찾기</button>
				</div>
			</div>
			<div class="api-btn">
				<a href="${kakao_url}"> <img class="kakao-img"
					src="resources/img/kakao_login_large_wide.png">
				</a>
			</div>
		</div>
	</form>
</section>