<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="/index.php" method="POST" target="_blank">
        <input type="text" name="name" placeholder="Name">
        <input type="text" name="message" placeholder="Message">
        <input type="submit" value="Submit" />
    </form>
    <?php
    $name = $_POST['name'];
    $message = $_POST['message'];
    echo "Message :".$message."\nFrom:".$name;
    ?>
</body>
</html>