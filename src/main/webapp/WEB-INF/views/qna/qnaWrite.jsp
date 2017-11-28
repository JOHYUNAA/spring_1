<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>qnaWrite</h1>
<form action="./qnaWrite" method="post">
	TITLE: <input type="text" name="title">
	WRITER: <input type="text" name="writer">
	AGE: <input type="text" name="age">
	<p>
		IU<input type="checkbox" name="name" value="iu">
		HYUNA<input type="checkbox" name="name" value="hyuna">
		CHOA<input type="checkbox" name="name" value="choa">
	</p>
	<button>CLICK</button>
</form>
</body>
</html>