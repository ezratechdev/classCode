<?php
$server= "127.0.0.1";
$user = "root";
$password = "";
$database = "phppractice1";

function connCreator($s,$u,$p,$d){
    return mysqli_connect($s,$u,$p,$d);
}

$conn = connCreator($server,$user,$password,$database);


if(!$conn){
    die("Unable to make a connection".mysqli_connect_error($conn));
}

// mysqli_close($conn);

?>