<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="./resources/css/home.css" rel="stylesheet">
</head>
<body>
<h1>
	Hello world!!
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="./notice">Go Notice</a>
<a href="./notice/noticeList?name=notice">Go NoticeList</a>
<a href="./qna/qnaList">Go QnaList</a>
<img src="./resources/images/Tulips.jpg">
<h3>MASTER</h3>
</body>
</html>
