<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	
</h1>

<P>Below are the latest items you have browsed</P>

<c:if test="${not empty browsingList}">
	<ul>
		
			<c:forEach var="browse" items="${browsingList}">
				<li>
					<a href="">${browsingList}</a>
				</li>				
			</c:forEach>
	</ul>
</c:if>
</body>
</html>
