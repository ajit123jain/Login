<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login System</title>
        <script>
            function ValidateUsername(){
                var text=document.getElementById("username").value;
                if(text===""){
                    document.getElementById("errorusername").innerHTML="Provide Correct Userdetail";
                    document.getElementById("errorusername").style.color="red";
                }
                else
                {
                    document.getElementById("errorusername").innerHTML="Ok";
                    document.getElementById("errorusername").style.color="green";
                }
                
            }
            function ValidatePassword(){
                var text=document.getElementById("password").value;
                if(text===""){
                    document.getElementById("errorpassword").innerHTML="Provide Correct UserPassword";
                    document.getElementById("errorpassword").style.color="red";
                }
                else
                {
                    document.getElementById("errorpassword").innerHTML="Ok";
                    document.getElementById("errorpassword").style.color="green";
                }
            }
            </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="ValidateLogin" name="AdminLogin" method="get">
           <table>
            <tr>
            <td>Username:</td>
            <td><input type="text" id="username" name="username" onblur="ValidateUsername();"></td>
            <td><label id="errorusername"></label></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" id="password" name="password" onblur="ValidatePassword();"></td>
                <td><label id="errorpassword"></label></td>
            </tr> 
            <tr>
                <td><input type="submit" value="submit"></td>
            </tr>
           </table>
            </form>
    </body>
</html>
