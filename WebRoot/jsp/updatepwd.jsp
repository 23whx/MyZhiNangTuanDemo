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
<%-- 用户已存在，可以进行更新密码操作 --%>
<logic:present name="flag" scope="request">
<logic:equal value="exists" name="flag" scope="request">
	<html:form action="jsp/user.do" method="post">
		新的密码：<html:password property="userpwd"></html:password><br>
		确认密码：<html:password property="confirmpwd"></html:password><br>
		验证码：<html:text property="checkcode"></html:text><img src="image.jsp"><br>
		<input type="hidden" name="status" value="updatepwd">
		<input type="hidden" name="type" value="4">
		<input type="hidden" name="userid" value="${param.userid}">
		<html:submit value="更新密码"></html:submit>
		<html:reset value="重置"></html:reset>
		<br>
		<a href="login.jsp">用户登陆？</a>
		<a href="register.jsp">用户注册？</a>
	</html:form>
	<script language="javaScript">
		document.userForm.checkcode.value = "" ;
	</script>
	
</logic:equal>
</logic:present>
</center>
</body>
</html:html>