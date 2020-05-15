<?php session_start();; ?>
<?php
if(!$_SESSION['login']){
    header("Location: index.php");
}
?>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <h1>Profile</h1>
        <a href="logout.php">Logout</a>
    </body>
</html>
