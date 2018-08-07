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
<center><jsp:include flush="true" page="../inc/template.jsp">
	<jsp:param name="url" value="../" />
</jsp:include> <logic:present name="question" scope="request">
	<table border="0" width="100%" border="1">
		<tr>
			<td>���⣺</td>
			<td>${question.title}</td>
		</tr>
		<tr>
			<td colspan="2">���ݣ�</td>
		</tr>
		<tr>
			<td colspan="2">${question.content}</td>
		</tr>
		<tr>
			<td colspan="2">����ʱ�䣺${question.questiontime} &nbsp;&nbsp;
			�����ˣ�${question.userid} &nbsp;&nbsp; �ȼ���${question.grade}</td>
		</tr>
	</table>
	<logic:iterate id="ans" name="question" property="answers">
		<table border="0" width="100%">
			<tr>
				<td coslpan="2">����ش�</td>
			</tr>
			<tr>
				<td colspan="2">${ans.quesans}</td>
			</tr>
			<tr>
				<td colspan="2">�ش�ʱ�䣺${ans.anstime} &nbsp;&nbsp;
				�ش��ˣ�${ans.userid} &nbsp;&nbsp; �ȼ���${ans.grade}</td>
			</tr>
		</table>
	</logic:iterate>
	<table border="1" width="100%">
		<tr>
			<td><html:form action="jsp/ques/answer.do" method="post">
				<html:textarea property="quesans" cols="30" rows="3"></html:textarea>
				<br>
		��֤�룺<html:text property="checkcode"></html:text>
				<img src="image.jsp">
				<br>
				<input type="hidden" name="status" value="insert">
				<input type="hidden" name="qid" value="${question.qid}">
				<input type="hidden" name="type" value="1">
				<input type="hidden" name="userid" value="${userid}">
				<input type="hidden" name="grade" value="${grade}">
				<html:submit value="�ش�"></html:submit>
				<html:reset value="����"></html:reset>
			</html:form></td>
		</tr>
	</table>
</logic:present></center>
</body>
</html:html>
