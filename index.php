<?php session_start();
if($_SESSION['login']){
    header("Location: profile.php");
}
?>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <table border="1">
            <form action="login.php" method="post">
                <tr>
                    <td>Email: </td>
                    <td><input type="email" name="email" /> </td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><input type="password" name="password" /> </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Login" /> 
                    </td>
                </tr>
            </form>
        </table>
    </body>
</html>
