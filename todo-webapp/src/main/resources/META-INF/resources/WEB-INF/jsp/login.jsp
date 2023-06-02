<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
   <h1> Welcome to Login Page  ${name} </h1>
   <pre>${errorMessage}</pre>
   <form action="" method="POST">
         Name : <input type="text" name="name" id="name">
         Password : <input type="password" name="password" id="password">
         <input type="submit" value="Login">
   </form>
</body>
</html>