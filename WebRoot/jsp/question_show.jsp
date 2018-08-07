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
<center><jsp:include flush="true" page="../inc/template.jsp">
	<jsp:param name="url" value="../" />
</jsp:include> <logic:present name="question" scope="request">
	<table border="0" width="100%" border="1">
		<tr>
			<td>标题：</td>
			<td>${question.title}</td>
		</tr>
		<tr>
			<td colspan="2">内容：</td>
		</tr>
		<tr>
			<td colspan="2">${question.content}</td>
		</tr>
		<tr>
			<td colspan="2">提问时间：${question.questiontime} &nbsp;&nbsp;
			提问人：${question.userid} &nbsp;&nbsp; 等级：${question.grade}</td>
		</tr>
	</table>
	<logic:iterate id="ans" name="question" property="answers">
		<table border="0" width="100%">
			<tr>
				<td coslpan="2">问题回答</td>
			</tr>
			<tr>
				<td colspan="2">${ans.quesans}</td>
			</tr>
			<tr>
				<td colspan="2">回答时间：${ans.anstime} &nbsp;&nbsp;
				回答人：${ans.userid} &nbsp;&nbsp; 等级：${ans.grade}</td>
			</tr>
		</table>
	</logic:iterate>
	<table border="1" width="100%">
		<tr>
			<td><html:form action="jsp/ques/answer.do" method="post">
				<html:textarea property="quesans" cols="30" rows="3"></html:textarea>
				<br>
		验证码：<html:text property="checkcode"></html:text>
				<img src="image.jsp">
				<br>
				<input type="hidden" name="status" value="insert">
				<input type="hidden" name="qid" value="${question.qid}">
				<input type="hidden" name="type" value="1">
				<input type="hidden" name="userid" value="${userid}">
				<input type="hidden" name="grade" value="${grade}">
				<html:submit value="回答"></html:submit>
				<html:reset value="重置"></html:reset>
			</html:form></td>
		</tr>
	</table>
</logic:present></center>
</body>
</html:html>
