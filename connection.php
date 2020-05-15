<?php

$host = "localhost";
$user = "root";
$password = "";


$connection = mysqli_connect($host, $user, $password);

if(!$connection){
    die("Error!");
}
else{
    echo "Connected!";
}

