<%@ page import="java.util.Date,java.text.SimpleDateFormat" %> 
<html>
  <head>
     <!-- refresh toutes les 60 secondes -->
     <meta http-equiv="Refresh" content="60"> 
  </head>
  <body>
<%
   DateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy - HH'h'mm");
   out.println(formatDate.format(new Date()));
%>
  </body>
</html>