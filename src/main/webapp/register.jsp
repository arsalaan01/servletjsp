<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register Here</title>
    <style>
        .container {
            margin: 10% 20%;
            border: 1px solid black;
            padding: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h3> Register Form</h3>
        <form action="RegisterServlet" method="post">
            <table>
                <tr>
                    <td><span>Enter your name</span></td>
                    <td><input type="text" name="uname" placeholder="Enter your name" /></td>
                </tr>
                <tr>
                    <td><span>Enter your password</span></td>
                    <td><input type="password"  name = "upass" placeholder="Enter your password" /></td>
                </tr>
                <tr>
                    <td><span>Enter your email</span></td>
                    <td><input type="email" name="uemail" placeholder="Enter your email" /></td>
                </tr>
                <tr>
                    <td><span>Select your Gender</span></td>
                    <td>
                        <input type="radio" name="ugender" value="male" /> Male
                        <input type="radio" name="ugender" value="female" /> Female
                    </td>
                </tr>
                <tr>
                    <td><span>Select your Course</span></td>
                    <td>
                        <select name="ucourse">
                            <option value="Java">Java</option>
                            <option value="Php">Php</option>
                            <option value="Python">Python</option>
                            <option value="Android">Android</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><span>Please Select</span></td>
                    <td><input type="checkbox" value="checked" name="ucon"> Agree terms and conditions.</td>
                </tr>
                <tr>
                    <td>
                        <button type="submit">Register</button>
                        <button type="reset">Reset</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>