<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	
</h1>

<P>The ad has been skipped</P>
<p>Available options for you are as below</p>

<c:if test="${not empty options}">
	<ul>
		
			<c:forEach var="options" items="${options}">
				<li>
					<a href="browsingHistory">${options}</a>
				</li>				
			</c:forEach>
	</ul>
</c:if>
</body>
</html>
