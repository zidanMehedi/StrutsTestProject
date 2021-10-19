<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 10/19/2021
  Time: 3:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <h:form action = "/hello">
        <h:text property="name"/>
        <h:submit/>
        
        <hr/>
    	<h:errors/>
    </h:form>
</body>
</html>
