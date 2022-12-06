<?php

$server ="127.0.0.1";
$user = "root";
$password="";


$conn = mysqli_connect($server,$user,$password);

if(!$conn){
    die("Faced an error connecting to the server ".mysqli_connect_error($conn));
}


?>