<%@ page contentType="text/html;charset=gbk"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<html:html lang="true">
<head>
	<title>MLDN ���� �ҵ�������</title>
	<META NAME="Generator" CONTENT="Struts + Spring + Hibernate + MySQL + Tomcat + CP">
	<META NAME="Author" CONTENT="���˻�">
	<META NAME="Keywords" CONTENT="������,SSH,tomcat,mysql">
	<META NAME="Description" CONTENT="MLDN������վ ���� www.zhinangtuan.net.cn">
</head>
<body>
<center>
<jsp:include flush="true" page="../../inc/template.jsp">
	<jsp:param name="url" value="../../"/>
</jsp:include> 
<logic:present name="flag" scope="request">
	<logic:equal name="flag" value="error" scope="request">
		<h2>�������������</h2>
	</logic:equal>
</logic:present>
<html:form action="jsp/admin/admin.do" method="post">
	��������룺<html:password property="oldpwd"></html:password><br>
	���������룺<html:password property="adminpwd"></html:password><br>
	ȷ�������룺<html:password property="confirmpwd"></html:password><br>
	��֤�룺<html:text property="checkcode"></html:text>
	<img src="image.jsp"><br>
	<input type="hidden" name="status" value="updatepwd">
	<input type="hidden" name="type" value="4">
	<html:submit value="�޸�"></html:submit>
	<html:reset value="����"></html:reset>
</html:form>
</center>
</body>
</html:html>