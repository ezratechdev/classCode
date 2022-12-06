<?php

$server = "127.0.0.1";
$user = "root";
$password = "";
$database = "phppractice1";

// before we make any sort of connection we have to connect to the server first

// $conn = mysqli_connect($server,$user,$password);

// if(!$conn) die ("Failed to connect to server ".mysqli_connect_error());

// create the database after connection
// $statment = "CREATE DATABASE ".$database;

// $result = mysqli_query($conn,$statment);

// if($result){
//     echo("Database created");
// }else{
//     echo("Database not created".mysqli_error($conn));
// }


// end of database creation


// start of table creation

$conn = mysqli_connect($server,$user,$password,$database);
// $createTable = "CREATE TABLE users (name varchar(15) , age int)";

// $result = mysqli_query($conn,$createTable);

// if($result){
//     echo("Table created successfully");
// }else{
//     echo("Unable to create table ".mysqli_error($conn));
// }





?>