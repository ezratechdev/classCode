<?php


if(!(isset($_POST['submit']) && isset($_POST['name']) && isset($_POST['age']))){
    die("Unable to capture data");
}


$name = $_POST['name'];

$age = $_POST['age'];

$conn = mysqli_connect("127.0.0.1","root","","practicev2");

if(!$conn){
    die("Unable to create a connection to the database".mysqli_connect_error($conn));
}

$statement = "INSERT INTO users(name,age) VALUES('$name','$age')";

$result = mysqli_query($conn,$statement);

if(!$result){
    echo("Unable to save data");
}else echo("Data saved to table users");

mysqli_close($conn);

?>