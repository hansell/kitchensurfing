<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   
         <p>尊敬的<c:out value="${requestScope.username }"/>用户:</p>
         <p style='padding-left:30px;'>
            
                                                                 激活账户的url地址已发送至您的邮箱,请在30分钟之内激活!!!
         
         </p>
      
   
    
</body>
</html>