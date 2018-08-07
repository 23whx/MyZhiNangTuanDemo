<%@ page contentType="text/html;charset=gbk"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<html:html lang="true">
<head>
<title>MLDN —— 我的智囊团</title>
<META NAME="Generator"
	CONTENT="Struts + Spring + Hibernate + MySQL + Tomcat + CP">
<META NAME="Author" CONTENT="李兴华">
<META NAME="Keywords" CONTENT="智囊团,SSH,tomcat,mysql">
<META NAME="Description" CONTENT="MLDN旗下网站 —— www.zhinangtuan.net.cn">
</head>
<body>
<center>
<jsp:include flush="true" page="../inc/template.jsp">
	<jsp:param name="url" value="../"/>
</jsp:include> 
<h1>用户注册</h1>
<html:form action="jsp/user.do" method="post">
	用户ＩＤ：<html:text property="userid"></html:text>
	<br>
	用户密码：<html:password property="userpwd"></html:password>
	<br>
	确认密码：<html:password property="confirmpwd"></html:password>
	<br>
	丢失密码提示问题：<html:text property="userques"></html:text>
	<br>
	丢失密码问题答案：<html:text property="userans"></html:text>
	<br>
	验证码：<html:text property="checkcode"></html:text>
	<img src="image.jsp"><br>
	<input type="hidden" name="status" value="register">
	<input type="hidden" name="type" value="1">
	<html:submit value="注册"></html:submit>
	<html:reset value="重置"></html:reset>
</html:form></center>
</body>
</html:html>
