<!DOCTYPE html>
<html>
    <head>
        <title>PHP Practice</title>
    </head>
    <body>
        <form method="post" action="./process.php">
            <fieldset>
                <legend>User Data</legend>
                <label for="name">Name</label>
                <input type="text" placeholder="Name" id="name" name="name" required />
                <label for="age">Age</label>
                <input type="number" name="age" id="age" placeholder="Age">
                <input type="submit" value="Send" name="submit">
            </fieldset>
        </form>

        <div>
            <?php
            include("./databaseconn.php");
            $statement = "SELECT name , age from users where users.age > 10";
            $result = mysqli_query($conn,$statement);
            if(!(mysqli_num_rows($result) > 0)) echo("No record found\nTable has a length of ".mysqli_num_rows($result));
            while($row = mysqli_fetch_assoc($result)){
                echo("<p style='color:red'> Name : ".$row['name']." has age of".$row['age']);
                // echo("<script>alert('Hi')</script>");
            }
            mysqli_close($conn);
            // include("./index.php");
            ?>
        </div>
    </body>
</html>