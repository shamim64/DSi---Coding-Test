<?php require_once("connection.php"); ?>
<?php session_start();; ?>

<?php

$email = $_POST['email'];
$pass = sha1($_POST['password']);

$sql = "SELECT * FROM users WHERE email='$email'";


function sanitize($value){
    
    $value = htmlentities($value);
    $value = htmlspecialchars($value);
    
    return $value;
}