<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="javascript:kakaoLogin();"><img src="https://www.gb.go.kr/Main/Images/ko/member/certi_kakao_login.png"
		style="width: auto; height: 60px;"></a>
	<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
	<script>
		/* 2fd509f61061a0b78b30b306a5695c73 */
		window.Kakao.init("2fd509f61061a0b78b30b306a5695c73");

		function kakaoLogin() {
			window.Kakao.Auth.login({
				scope: 'profile_nickname, account_email, gender',
				success: function(authObj) {
					console.log(authObj);
					window.Kakao.API.request({
						url:'/v2/user/me',
						success: res => {
							const kakao_account = res.kakao_account;
							console.log(kakao_account);
						}
					});
				}
			});
		}
	</script>
</body>
</html>