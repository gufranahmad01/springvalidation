<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Here</title>
</head>
<body>
      <h2>Login Here...</h2>
      <form action="saveLogin" method="post">
      <pre>
            Username<input type="text" name="userName"/>
            Email<input type="text" name="email"/>
            Password<input type="text" name="password"/>
            <input type="submit" value="login"/>
      </pre>
      </form>
      
</body>
</html>