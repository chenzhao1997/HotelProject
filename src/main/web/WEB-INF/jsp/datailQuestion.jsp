<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2018/11/30
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <div align="center">
<table border="1">
    <tr>
        <th>问题:</th>
        <td>${question.title}</td>
    </tr>
    <tr>
        <th>问题描述:</th>
        <td>${question.detailDesc}</td>
    </tr>
</table>
<table>
    <tr>
        <th>网友回答:</th>
    </tr>
    <tr>
        <c:forEach items="${answerList}" var="answer">
        <td>${answer.ansDate}</td>
        <td>${answer.ansContent}</td>
        </c:forEach>
    </tr>
</table>
<form action="${pageContext.request.contextPath}/answer/addAnswer" method="post">
<table>
    <tr>
        <th>我来回答:</th>
        <td>
            <input type="hidden" value="${question.queId}" name="queId">
            <textarea name="ansContent" id="ansContent" cols="30" rows="10"></textarea>
        </td>
    </tr>
    <tr align="center">
        <td colspan="2">
            <input type="submit" value="提交答案">
            <a href="${pageContext.request.contextPath}/question/list">返回首页</a>
        </td>
    </tr>
</table>
    </div>

</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("form").submit(function () {
            var ansContent = $("#ansContent").val();
            if (ansContent==null || ansContent==""){
                alert("必须填写问题!")
                return false;
            }
        })
    })
</script>
</html>
