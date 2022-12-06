<?php

$server = "127.0.0.1";
$user = "root";
$password = "";
$dbname = "practicev2";

$conn = mysqli_connect($server, $user , $password , $dbname );

if(!$conn){
    die("unable to connect to the database".$dbname);
}

$statement = "CREATE TABLE users (name varchar(15) , age int)";

$result = mysqli_query($conn,$statement);

if(!$result){
    die("Unable to create table");
    return;
}

echo("Table created");

mysqli_close($conn);

?>