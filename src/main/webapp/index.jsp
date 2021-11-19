<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: #008080;
  overflow-x: hidden;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

img{
   float: left;
   margin-right: 300px;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
h1{
font-size: 50px;
font-family: Georgia;

}
/* Set a style for the submit button */
.submitbtn {
  background-color: #04AA6D;
  color: white;
  font-size: 30px;
  padding: 12px 16px;
  margin: 2px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.submitbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
<title>LMS</title>
</head>
<!--  <body style="background-color:  #008080;">-->
<body>
<form action = "RegistrationServlet" method = "post" >
  <div class="container">

<table>
            <tr>
                <td>
                    <img src="https://www.mathworks.com/academia/tah-portal/the-northcap-university-40664749/_jcr_content/schoolLogo.adapt.full.medium.png/1592889561527.png" alt = "Cannot embed image" style="float: left; width:450px;height:160px;margin-right: 150px">
                    
       </td> 
    <td> <h1> NCU Library </h1></td>
               
            </tr>
        </table>
  
<p style= "color: white; text-align: center; font-size: 200%; background-color:#04AA6D; padding: 10px 14px;"><b>Library Management System</b></p>
 
<p style = "color: red; background-color:#F0FFF0; font-size: 100%; padding: 8px 12px;"><marquee> <b>Note: All * are mandatory fields</b></marquee></p>
    <label for="college id"><b>College Id <span style="color: #ff0000">*</span></b></label>
    <input type="text" placeholder="Enter college id" name = "college id"  required>

    <label for="uname"><b>Full Name <span style="color: #ff0000">*</span></b></label> 
    <input type="text" placeholder="Enter full name" name = "uname" required>

    <label for="pass"><b>Password <span style="color: #ff0000">*</span></b></label>
  
    <input type="password" placeholder="Enter password" name = "pass" required>
 
    <hr>
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="submitbtn">Register</button>
  </div>
   <div class="container signin">
    <p>Already have an account? <a href="Login.jsp">Sign in</a>.</p>
  </div>
  
</form>
</body>
</html>