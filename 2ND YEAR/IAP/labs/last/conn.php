<?php      
    $host = "localhost";
    $user = "root";
    $password = "";  
    $db_name = "lastiap";  
      
    // $con = mysqli_connect($host, $user, $password, $db_name);
    // $con = new mysqli($host, $user, $password, $db_name);
    // if($con->connect_error) {  
    //     die("Failed to connect with MySQL: ".$con->connect_error); 
    // }  else echo "<script>alert('Not connected')</script>";



    $con = mysqli_connect($host,$user,$password,$db_name);
    if(mysqli_connect_error()){
        die("An error occured".mysqli_connect_error());
    }
?>  