<%@ page contentType="text/html;charset=gbk"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<html:html lang="true">
<head>
	<title>MLDN —— 我的智囊团</title>
	<META NAME="Generator" CONTENT="Struts + Spring + Hibernate + MySQL + Tomcat + CP">
	<META NAME="Author" CONTENT="李兴华">
	<META NAME="Keywords" CONTENT="智囊团,SSH,tomcat,mysql">
	<META NAME="Description" CONTENT="MLDN旗下网站 —— www.zhinangtuan.net.cn">
</head>
<body>
<center>
<jsp:include flush="true" page="../inc/template.jsp">
	<jsp:param name="url" value="../"/>
</jsp:include>

<logic:present name="flag" scope="request">
	<logic:equal value="error" name="flag" scope="request">
		<h2>登陆失败，错误的用户名或密码！</h2>
	</logic:equal>
</logic:present>

<html:form action="jsp/user.do" method="post">
	用户ＩＤ：<html:text property="userid"></html:text><br>
	登陆密码：<html:password property="userpwd"></html:password><br>
	验证码：<html:text property="checkcode"></html:text>
		<img src="image.jsp">
	<br>
	<input type="hidden" name="status" value="login">
	<input type="hidden" name="type" value="2">
	<html:submit value="登陆"></html:submit>
	<html:reset value="重置"></html:reset>
	<br>
	<a href="register.jsp">注册新用户？</a>
	<a href="forgetpwd.jsp">忘记密码？</a>
</html:form> 
</center>
</body>
</html:html>