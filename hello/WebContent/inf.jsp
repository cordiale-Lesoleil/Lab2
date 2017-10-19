<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>图书信息</title>
</head>
	<body>
	书籍信息
	 <center>
		<table border="1">
			<s:iterator value="list" id="a" status = "s">
			<tr>
			<td>
				<s:property value="a"/>
			</td>
			</tr>
			</s:iterator>
		</table>
		<a href="bookde?bookisbn=${bookisb}"><button>删除</button></a>
		<td>
        <a href='http://zycy.applinzi.com'><button>返回查询页面</button></a>
        </td>
	</center>
	</body>
</html>