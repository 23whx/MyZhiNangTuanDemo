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
<jsp:include flush="true" page="../inc/template.jsp">
	<jsp:param name="url" value="../" />
</jsp:include>
<logic:present name="allitem" scope="request">
	<logic:iterate id="item" name="allitem" scope="request">
		<a href="show.do?itemid=${item.itemid}&status=selectitem">${item.itemname}</a>
		<br>
		|- 
		<logic:iterate id="sub" name="item" property="subitems">
			<a
				href="show.do?itemid=${item.itemid}&subid=${sub.subid}&status=selectsub">${sub.subname}</a>|
		</logic:iterate>
		<br>
	</logic:iterate>
</logic:present>
<center>
<h1>�����б�</h1>
<a href="show.do?status=selectcommen&commen=1">�Ƽ�����</a> <a
	href="show.do?status=selectstatus&sta=2">�ѽ������</a> <a
	href="show.do?status=selectstatus&sta=1">δ�������</a> <logic:present
	name="all" scope="request">
	<jsp:include page="split_page.jsp">
		<jsp:param name="jspUrl" value="${jspUrl}" />
		<jsp:param name="lineSize" value="${lineSize}" />
		<jsp:param name="allRecorders" value="${allRecorders}" />
		<jsp:param name="keyWord" value="<%=request.getAttribute("keyWord")%>" />
		<jsp:param name="currentPage" value="${currentPage}" />
		<jsp:param name="status" value="${status}" />
		<jsp:param name="flagname" value="${flagname}" />
		<jsp:param name="flagvalue" value="${flagvalue}" />
		<jsp:param name="searchFlag" value="T" />
	</jsp:include>
	<table border="0" width="100%">
		<tr>
			<td>����</td>
			<td>�û�ID</td>
			<td>�û��ȼ�</td>
			<td>���ͷ���</td>
			<td>����ʱ��</td>
			<td>���</td>
		</tr>
		<logic:iterate id="question" name="all" scope="request">
			<tr>
				<td><a href="show.do?qid=${question.qid}&status=selectid">${question.title}</a></td>
				<td>${question.userid}</td>
				<td>${question.grade}</td>
				<td>${question.offerscore}</td>
				<td>${question.questiontime}</td>
				<td>${question.clickcount}</td>
			</tr>
		</logic:iterate>
	</table>
</logic:present></center>
</body>
</html:html>
