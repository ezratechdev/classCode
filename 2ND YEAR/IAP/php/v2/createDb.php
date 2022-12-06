<?php

include("./conn.php");

$dbname = "practicev2";

$statement = "CREATE DATABASE ".$dbname;

$result = mysqli_query($conn,$statement);

if($result){
    echo("Database with name ".$dbname." has been created");
} else{
    echo("Database with name ".$dbname." has not been created");
}


mysqli_close($conn);
?>