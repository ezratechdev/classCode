<!DOCTYPE html>
<html>
    <head>
        <title>Hi i am getting all data</title>
    </head>
    <body>
        <div class="main">
            <?php
            include("./conn.php");
            $statement = "SELECT * FROM users";
            $result = mysqli_query($conn,$statement);
            if(!mysqli_num_rows($result)){
                echo("The database is currenty empty");
            }
            while($row = mysqli_fetch_assoc($result)){
                if(!isset($row)) echo("");
                echo("<p>".$row['name']." is ".$row['age']." years old");
            }
            ?>
        </div>
    </body>
</html>