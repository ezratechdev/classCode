<?php      
    include('conn.php');  
    $username = $_POST['uname'];  
    $password = $_POST['pass'];  
    print($username.$password);
        //to prevent from xxxs injection  
        $username = stripcslashes($username);  
        $password = stripcslashes($password);  
        $username = mysqli_real_escape_string($con, $username);  
        $password = mysqli_real_escape_string($con, $password);  
      
        // $sql = "select * from users where username = '$username' and password = '$password'";  
        // $result = mysqli_query($con, $sql);  
        // $row = mysqli_fetch_array($result, MYSQLI_ASSOC);  
        // $count = mysqli_num_rows($result);
        
        $query = "SELECT * FROM users WHERE username='$username' and password='$password'";
        $result = mysqli_query($con,$query);
        $row = mysqli_fetch_array($result, MYSQLI_ASSOC);  
        $count = mysqli_num_rows($result);

        // if($result->num_rows == 1){
        //     $row = $result->fetch_assoc();
        //     echo "username: " . $row["username"]. " - Password: " . $row["password"];
        // }
        // else{
        //     echo "No data found";
        // }
        // $con -> close();
          
        if($count == 2){ 
		
			header('Location:loggedin.php');
			 echo '<script> alert("Login successful");</script>';
        }  
        else{  
			include('login.php');
            echo "<p style="."color:red;"."> Login failed. Invalid username or password.</p>";  
        }     
?>  