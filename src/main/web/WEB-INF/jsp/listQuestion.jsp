<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2018/11/30
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/listTable.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/editTablestyles.css"/>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h1>在线问答</h1>
    <a href="${pageContext.request.contextPath}/question/toAddQuestion">我要提问</a><br/><br/><br/>
</div>
<table align="center" id="ajaxtable">
    <tr>
        <th>序号</th>
        <th>问题</th>
        <th>回答次数</th>
        <th>最后修改</th>
    </tr>
    <c:forEach items="${questionList}" var="question">

    <tr>
        <td>${question.queId}</td>

        <td>
            <a href="${pageContext.request.contextPath}/question/datailQuestion?queId=${question.queId}" <c:if test="${question.answerCount==0}">style="color:red" </c:if>>${question.title}</a>
        </td>
        <td>${question.answerCount}</td>
        <td>${question.lastModified}</td>
    </tr>
    </c:forEach>
</table>
</body>

</html>
