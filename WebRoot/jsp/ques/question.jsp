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
<center><jsp:include flush="true" page="../../inc/template.jsp">
	<jsp:param name="url" value="../../" />
</jsp:include> <SCRIPT language="javascript">
function subchk()
{
    document.questionForm.content.value= window.eWebEditor1.getPureHtml();
}
</SCRIPT> <%
 int temp = 0;
 %> <logic:present name="all" scope="request">
	<Script language="javascript">
	var subitemlength;
	item_id= new Array();
	sub_id=new Array();
	sub_name=new Array();
	
	<logic:iterate id="item" scope="request" name="all" indexId="ind">
		<logic:iterate id="sub" name="item" property="subitems">
			item_id[<%=temp%>]=new Array("${item.itemid}");
			sub_id[<%=temp%>]=new Array("${sub.subid}");
			sub_name[<%=temp%>]=new Array("${sub.subname}");
			<%temp++ ;%>
		</logic:iterate>
	</logic:iterate>
subitemlength=29;//������Ŀ����ĳ���
//������ѡһ����Ŀ��̬�ı�����Ӧ�Ķ�����Ŀ
function changSubitem(itemid,subid)
{
	var subtemp=0;//��Ӷ�����Ŀʱ������±�
	var index=subid.length;
	//ɾ��ԭ��������Ŀ��ѡ��
    for (i=index-1;i>=0;i--)
	  {
	     subid.options[i]=null;
      }
    var itemindex=itemid.selectedIndex;//��ѡ��һ����Ŀ	
	//�����ѡһ����Ŀ����Ӧ�Ķ�����Ŀ
	for (i=0;i<subitemlength;i++)
	 {
		if (itemid.options[itemindex].value==item_id[i])
		 {
			subid.options[subtemp]=new Option(sub_name[i],sub_id[i]);
			subtemp=subtemp+1;
		 }
	 }	  
}
</script>
	<html:form action="jsp/ques/question.do" method="post" onsubmit="subchk()">
		���⣺<html:text property="title"></html:text>
		<br>
		��Ŀ��
		<select name="itemid"
			onchange="changSubitem(document.questionForm.itemid,document.questionForm.subid)">
			<logic:iterate id="item" name="all" scope="request">
				<option value=${item.itemid } selected>${item.itemname}</option>
			</logic:iterate>
		</select>
		<select name="subid">
		</select>
		<script language="javascript">
    		document.questionForm.itemid[0].selected=true ;
    		document.questionForm.itemid.onchange() ;
    	</script>
    	<br>
		���ݣ�<br><textarea name="content" style="display:none"></textarea>
		<IFRAME ID="eWebEditor1" src="edit/editor.html" frameborder="0"
			scrolling="no" width="467" height="200"></IFRAME>
		<br>
		���ͷ�����<html:text property="offerscore"></html:text>
		<br>
		��֤�룺<html:text property="checkcode"></html:text>
		<img src="../image.jsp">
		<br>
		<input type="hidden" name="status" value="insert">
		<input type="hidden" name="type" value="1">
		<input type="hidden" name="userid" value="${userid}">
		<input type="hidden" name="grade" value="${grade}">
		<html:submit value="����"></html:submit>
		<html:reset value="����"></html:reset>
	</html:form>
</logic:present></center>
</body>
</html:html>
