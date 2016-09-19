<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="margin: auto;">
	<form action="/CCity/add">
		<table style="padding-top: 100px;">
			<tr>
				<td>
					城市：
					<select name="cityId">
					<c:forEach items="${ sCityList}" var="obj">
            		 	<option value="${ obj.cityname}" id="${ obj.cityid }">
            		</c:forEach>
					</select>
					
				</td>
			</tr>
			<tr>
				<td rowspan="2"><input type="radio" name="sourceId" value="1">
					携程 &nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="sourceId" value="3"> 去哪&nbsp;&nbsp;&nbsp;
					 <input type="radio" name="sourceId" value="2"> 神州
			</tr>
			<tr>
				<td>对方id：</td>
				<td><input name="beyondId"></td>
			</tr>

		</table>

	</form>
</body>
</html>