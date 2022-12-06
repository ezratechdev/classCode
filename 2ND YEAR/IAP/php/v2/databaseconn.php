<?php
$server = "127.0.0.1";
$user = "root";
$password = "";
$dbname = "practicev2";

$conn = mysqli_connect($server, $user , $password , $dbname );

if(!$conn){
    die("unable to connect to the database".$dbname);
}
?>