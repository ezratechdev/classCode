<!DOCTYPE html>
<html>
    <head>
        <title>Data processor</title>
    </head>
    <body>
        <form method="POST" action="./process.php" target="_self">
            <label for="username">Username</label>
            <input type="text" id="username" name="name" placeholder="Username " required /> <br>
            <label for="age">Age</label>
            <input type="number" id="age" name="age" placeholder="Age" />
            <input type="submit" value="Submit" name="submit">
        </form>
    </body>
</html>