<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>尚硅谷会员注册页面</title>
        <base href="http://localhost:8080/book/">
		<link type="text/css" rel="stylesheet" href="static/css/style.css" >
		<script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>
		<style type="text/css">
			.login_form{
				height:420px;
				margin-top: 25px;
			}
		</style>

		<script>
			$(function () {
				$("#sub_btn").click(function () {
					var username = $("#username").val();
					var $span = $("span.errorMsg");
					var emailpatt = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
					var patt = /^\w{5,12}$/;
					var password = $("#password").val();
					var repwd = $("#repwd").val();
					var eamil = $("#email").val();

					var code = $("#code").val();
					code = code.trim();
					//alert(password);
				//	alert(repwd);


					if(!patt.test(username)){
						$span.text("用户名不合法");
						return false;
					}
					else if(!patt.test(password)){
						$span.text("密码不合法");
						return false;
					}
					else if (password != repwd){
						$span.text("两次密码不同");
						return  false;
					}
					else if(!emailpatt.test(eamil)){
						$span.text("邮箱格式错误");
						return  false;
					}
					else if(code == "" || code == null){
						$span.text("验证码不能为空");
						return false;
					}
					$span.text("");
				});
			});

		</script>
	</head>
	<body>
		<div id="login_header">
			<img class="logo_img" alt="" src="static/img/logo.gif" >
		</div>

			<div class="login_banner">

				<div id="l_content">
					<span class="login_word">欢迎注册</span>
				</div>

				<div id="content">
					<div class="login_form">
						<div class="login_box">
							<div class="tit">
								<h1>注册尚硅谷会员</h1>
								<span class="errorMsg">${empty requestScope.registMsg ? "" :requestScope.registMsg}</span>
<%--								<span class="errorMsg"><%=request.getAttribute("registMsg") == null ? "" :request.getAttribute("registMsg")%></span>--%>
							</div>
							<div class="form">
								<form action="userServlet" method="post">
									<label>用户名称：</label>
									<input type="hidden" value="regist" name="action">
									<input class="itxt" type="text" placeholder="请输入用户名"
										   autocomplete="off" tabindex="1" name="username" id="username"
										   value=${requestScope.username}%>
									>
									<br />
									<br />
									<label>用户密码：</label>
									<input class="itxt" type="password" placeholder="请输入密码"
										   autocomplete="off" tabindex="1" name="password" id="password"
											value=${requestScope.password}%>>
									<br />
									<br />
									<label>确认密码：</label>
									<input class="itxt" type="password" placeholder="确认密码"
										   autocomplete="off" tabindex="1" name="repwd" id="repwd"
										   value=${requestScope.password}%>
									>
									<br />
									<br />
									<label>电子邮件：</label>
									<input class="itxt" type="text" placeholder="请输入邮箱地址"
										   autocomplete="off" tabindex="1" name="email" id="email"
											value=${requestScope.email}%>
									>
									<br />
									<br />
									<label>验证码：</label>

									<input class="itxt" type="text" style="width: 150px;" id="code" name="code">
									<img alt="" src="static/img/code.bmp" style="float: right; margin-right: 40px">
									<br />
									<br />
									<input type="submit" value="注册" id="sub_btn" />
								</form>
							</div>

						</div>
					</div>
				</div>
			</div>
		<div id="bottom">
			<span>
				尚硅谷书城.Copyright &copy;2015
			</span>
		</div>
	</body>
</html>
<%
	System.out.println(request.getAttribute("password"));
%>