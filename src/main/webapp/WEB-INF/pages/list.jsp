<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tasks</title>
</head>
<body>
 <center>



  <c:if test="${!empty taskList}">
   <table border="1" bgcolor="black" width="600px">
    <tr
     style="background-color: teal; color: white; text-align: center;"
     height="40px">
     
     <td>Id</td>
     <td>Commentary</td>

    </tr>
    <c:forEach items="${taskList}" var="task">
     <tr
      style="background-color: white; color: black; text-align: center;"
      height="30px">
      
      <td><c:out value="${task.id}" />
      </td>
      <td><c:out value="${task.commentary}" />
      </td>
    
     </tr>
    </c:forEach>
   </table>
  </c:if>


  
 </center>
</body>
</html>



