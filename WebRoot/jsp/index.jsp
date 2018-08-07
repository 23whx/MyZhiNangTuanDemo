<%@ page contentType="text/html;charset=gbk"%>
<%@ page import="org.lxh.myzngt.util.*"%>
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
</jsp:include> <logic:present name="userid" scope="session">
	��ӭ${userid}����&nbsp;
	ͷ�Σ�<%=IntegralGrade.getInstance().getGradeInfo(
							(Integer) session.getAttribute("grade"))%>&nbsp;
	<a href="user/index.htm">��������</a>
</logic:present>
<table border="1" width="100%">
	<tr>
		<td rowspan="4"><logic:present name="allitem" scope="request">
			<logic:iterate id="item" name="allitem" scope="request">
				<h3><a href="show.do?itemid=${item.itemid}&status=selectitem">${item.itemname}</a></h3>
				<logic:iterate id="sub" name="item" property="subitems">
					<h4>&nbsp;&nbsp;<a
						href="show.do?itemid=${item.itemid}&subid=${sub.subid}&status=selectsub">${sub.subname}</a></h4>
				</logic:iterate>
			</logic:iterate>
		</logic:present></td>
	</tr>
	<tr>
		<td><logic:present name="allcommen" scope="request">
			<table border="0" width="80%">
				<tr>
					<td>
					<h3>�Ƽ�������&nbsp;<a href="show.do?status=selectcommen&commen=1">����</a></h3>
					</td>
				</tr>
				<logic:iterate id="ques" name="allcommen" scope="request">
					<tr>
						<td><a href="show.do?qid=${ques.qid}&status=selectid">${ques.title}</a>
						</td>
					</tr>
				</logic:iterate>
			</table>
		</logic:present></td>
	</tr>
	<tr>
		<td><logic:present name="status1" scope="request">
			<table border="0" width="80%">
				<tr>
					<td>
					<h3>���������&nbsp;<a href="show.do?status=selectstatus&sta=2">����</a></h3>
					</td>
				</tr>
				<logic:iterate id="ques" name="status1" scope="request">
					<tr>
						<td><a href="show.do?qid=${ques.qid}&status=selectid">${ques.title}</a>
						</td>
					</tr>
				</logic:iterate>
			</table>
		</logic:present></td>
	</tr>
	<tr>
		<td><logic:present name="status2" scope="request">
			<table border="0" width="80%">
				<tr>
					<td>
					<h3>�ѽ������&nbsp;<a href="show.do?status=selectstatus&sta=1">����</a></h3>
					</td>
				</tr>
				<logic:iterate id="ques" name="status2" scope="request">
					<tr>
						<td><a href="show.do?qid=${ques.qid}&status=selectid">${ques.title}</a>
						</td>
					</tr>
				</logic:iterate>
			</table>
		</logic:present></td>
	</tr>
</table>
</center>
</body>
</html:html>
