<?php session_start();; ?>

<?php

if($_SESSION['login']){
    
    unset($_SESSION);
    session_destroy();
}

header("Location: index.php");




