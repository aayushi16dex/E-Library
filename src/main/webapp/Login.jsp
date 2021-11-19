<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: white;
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
  background-color: #E59866;
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
 
</style>
<title>login.ncu</title>
</head>
 
<body>
<form action = "Authentication.jsp" >
  <div class="container">

<table>
            <tr>
                <td>
                    <img src="https://www.mathworks.com/academia/tah-portal/the-northcap-university-40664749/_jcr_content/schoolLogo.adapt.full.medium.png/1592889561527.png" alt = "Cannot embed image" style="float: left; width:450px;height:160px;margin-right: 150px">
                    
       </td> 
    <td><h1> NCU Library </h1></td>
               
            </tr>
        </table>
  
<p style= "color: white; text-align: center; font-size: 200%; background-color:#E59866; padding: 10px 14px;"><b>Login Page</b></p>
 
<p style = "color: red; background-color:#F0FFF0; font-size: 100%; padding: 8px 12px;"><marquee> <b>Note: All * are mandatory fields</b></marquee></p>
     
    <label for="uid"><b>College id<span style="color: #ff0000">*</span></b></label> 
    <input type="text" placeholder="Enter college id" name = "uid" required>

    <label for="pass"><b>Password <span style="color: #ff0000">*</span></b></label> 
    <input type="password" placeholder="Enter password" name = "pass" required>

    <hr>
     
    <button type="submit" class="submitbtn">Sign in</button>
  </div>
</form>

</body>
</html>