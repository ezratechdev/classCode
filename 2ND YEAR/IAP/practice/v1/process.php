<?php


if(!isset($_POST['submit'])){
    die("Unable to process data sent");
}


$name = $_POST['name'];
$age = $_POST['age'];

// create connection to database

$server = "127.0.0.1";
$user = "root";
$password = "";
$database = "phppractice1";

include("./conn.php");
// $conn = mysqli_connect($server,$user,$password,$database);

if(!$conn) die("Unable to make connection to database ");

// $statement = "INSERT INTO users name=".$name.",age=".$age;
$statement = "INSERT INTO users VALUES('$name' , '$age')";


$result = mysqli_query($conn,$statement);

if($result){
    echo("A user with name ".$Name."and age has been saved to database");
}else{
    die("unable to make connection to database");
}

?>