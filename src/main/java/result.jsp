<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
    Available Brands
</h1>
<%
String result= (String) request.getAttribute("brands");
Iterator it = result.iterator();
out.println("<br>We have <br><br>");
out.println(result+"<br>");
%>
</body>
</html>