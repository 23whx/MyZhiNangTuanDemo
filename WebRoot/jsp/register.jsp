<%@ page contentType="text/html;charset=gbk"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<html:html lang="true">
<head>
<title>MLDN ���� �ҵ�������</title>
<META NAME="Generator"
	CONTENT="Struts + Spring + Hibernate + MySQL + Tomcat + CP">
<META NAME="Author" CONTENT="���˻�">
<META NAME="Keywords" CONTENT="������,SSH,tomcat,mysql">
<META NAME="Description" CONTENT="MLDN������վ ���� www.zhinangtuan.net.cn">
</head>
<body>
<center>
<jsp:include flush="true" page="../inc/template.jsp">
	<jsp:param name="url" value="../"/>
</jsp:include> 
<h1>�û�ע��</h1>
<html:form action="jsp/user.do" method="post">
	�û��ɣģ�<html:text property="userid"></html:text>
	<br>
	�û����룺<html:password property="userpwd"></html:password>
	<br>
	ȷ�����룺<html:password property="confirmpwd"></html:password>
	<br>
	��ʧ������ʾ���⣺<html:text property="userques"></html:text>
	<br>
	��ʧ��������𰸣�<html:text property="userans"></html:text>
	<br>
	��֤�룺<html:text property="checkcode"></html:text>
	<img src="image.jsp"><br>
	<input type="hidden" name="status" value="register">
	<input type="hidden" name="type" value="1">
	<html:submit value="ע��"></html:submit>
	<html:reset value="����"></html:reset>
</html:form></center>
</body>
</html:html>
