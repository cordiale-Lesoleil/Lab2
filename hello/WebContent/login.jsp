<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>按作者名搜索书页面</title>
  </head>
   
  <body>
    <center>
    	<s:form action="Book-research">
    	<s:textfield name="Author" key="Author(如：lx,zyc)"></s:textfield>
    	<s:submit key="查询"></s:submit>
    	</s:form>
    </center>
  </body>
</html>