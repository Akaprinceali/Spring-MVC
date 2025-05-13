<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Signup</title>
</head>
<body>
    
    <div align="center">
    
    <h2>Student Signup Form</h2>

    <form action="signup" method="get">
        <label>Name:</label>
        <input type="text" name="name" required><br><br>

        <label>Email:</label>
        <input type="email" name="email" required><br><br>

        <label>Password:</label>
        <input type="password" name="password" required><br><br>

        <label>Age:</label>
        <input type="number" name="age" min="1" required><br><br>

        <label>Phone:</label>
        <input type="text" name="phone" required><br><br>

        <label>Gender:</label>
        <input type="radio" id="male" name="gender" value="Male" required>
        <label for="male">Male</label>

        <input type="radio" id="female" name="gender" value="Female">
        <label for="female">Female</label>

        <input type="radio" id="other" name="gender" value="Other">
        <label for="other">Other</label>
        <br><br>

        <input type="submit" value="Sign Up">
    </form>
    
    </div>

</body>
</html>
