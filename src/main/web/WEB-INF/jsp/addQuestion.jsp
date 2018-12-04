<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2018/11/30
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/question/doAddQuestion" method="post">
<div align="center">
    <h1>我要提问</h1>
    <a href="${pageContext.request.contextPath}/question/list">返回首页</a><br/><br/><br/>
</div>
<table align="center" id="ajaxtable">
    <tr>
        <th>问题:</th>
        <td>
            <input type="text" name="title" id="title">
        </td>
    </tr>
    <tr>
        <th>问题描述:</th>
        <td>
            <textarea name="detailDesc" id="detailDesc" cols="25" rows="2"></textarea>
        </td>
    </tr>
</table>
<div align="center">
    <input type="submit" value="保存问题">
</div>
</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
            $(function () {
                $("form").submit(function () {
                    var title = $("#title").val();
                    if (title==null || title==""){
                        alert("必须填写问题!")
                        return false;
                    }
                })
            })
</script>
</html>
