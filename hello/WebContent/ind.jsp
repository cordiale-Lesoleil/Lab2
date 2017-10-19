<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>书表单</title>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">
</script>
<script type="text/javascript">
function re(e)
{
	var BT = document.getElementById("BT");
	window.location.href = "bookinf?BT="+e.innerHTML;
}
</script>
</head>
	<body>
	 <center>
		<s:property value = "username"/>
		所作书籍：
		<table border="1">
			<s:iterator value="list" id="a" status = "s">
			<tr>
			<td>
				<p onclick="re(this);"><s:property value="a"/> </p> 
			</td>
			</tr>
			</s:iterator>
		</table>
		<a href='http://zycy.applinzi.com'><button>返回查询页面</button></a>
	</center>
	</body>
</html>