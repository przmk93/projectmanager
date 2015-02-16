    <%@ page language="java" contentType="text/html; charset=UTF-8"  
     pageEncoding="UTF-8"%>  
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
    <html>  
    <head>  
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
    <title>Insert</title>  
    </head>  
    <body>  
     <center>  
      
      <div style="color: teal; font-size: 30px">Form</div>  
      
      
      
      <c:url var="TaskRegistration" value="saveTask.html" />  
      <form:form id="registerTaskForm" modelAttribute="task" method="post"  
       action="register">  
       <table width="400px" height="150px">  
        <tr>  
         <td><form:label path="commentary">Commentary</form:label>  
         </td>  
         <td><form:input path="commentary" />  
         </td>  
        </tr>  
       
        <tr>  
         <td></td>  
         <td><input type="submit" value="Add" /></td>  
        </tr>  
       </table>  
      </form:form>  
      
      
      <a href="list">Click Here to see Task List</a>  
     </center>  
    </body>  
    </html>  