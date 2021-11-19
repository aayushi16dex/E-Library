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
  border: 2px solid #f1f1f1;
  margin-bottom: 30px;
}
h1{
font-size: 50px;
font-family: Georgia;

}
.button1 {
  background-color: #52BE80; /* Green */
  border: none;
  color: white;
  cursor: pointer;
  padding: 14px 40px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 35px;
  border-radius: 8px;
  transition-duration: 0.4s;
  width: 40%;
  
}
.button1:hover {
  background-color:  #EDBB99; /* Green */
  color: white;
}

.button2 {
  background-color: #008CBA; /* Red */
  border: none;
  color: white;
  cursor: pointer;
  padding: 14px 40px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 35px;
  border-radius: 8px;
  transition-duration: 0.4s;
  width: 40%;
  
}
.button2:hover {
  background-color:  #F5B7B1; /* Blue */
  color: white;
}

.button3 {
  background-color: #f44336;  /* Red */
  border: none;
  color: white;
  cursor: pointer;
  padding: 14px 40px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 35px;
  border-radius: 8px;
  transition-duration: 0.4s;
  width: 40%;
}
.button3:hover {
  background-color: #ABEBC6; /* Red */
  color: white;
}
.button4 {
  background-color:  #EB984E ; /* black */
  border: none;
  color: white;
  cursor: pointer;
  padding: 14px 40px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 35px;
  border-radius: 8px;
  transition-duration: 0.4s;
  width: 40%;
}
.button4:hover {
  background-color: #A9DFBF;  /* black */
  color: white;
}
</style>
<title>LMS Menu</title>
</head>
<!--  <body style="background-color:  #008080;">-->
 
<body>
<form>
  <div class="container">

<table>
            <tr>
                <td>
                    <img src="https://www.mathworks.com/academia/tah-portal/the-northcap-university-40664749/_jcr_content/schoolLogo.adapt.full.medium.png/1592889561527.png" alt = "Cannot embed image" style="float: left; width:450px;height:160px;margin-right: 150px">
                    
       </td> 
    <td><h1> NCU Library </h1></td>
               
            </tr>
        </table>
  
<p style= "color: white; text-align: center; font-size: 200%; background-color:#117A65; padding: 10px 14px;"><b>LMS Menu Display</b></p>
 
<p style = "color: red; background-color:#F0FFF0; font-size: 100%; padding: 8px 12px;"><marquee> <b>Choose only one field at a time</b></marquee></p>
 
  	<a href="AddInput.html" class="button1">Add a New Record</a><hr>
  	<a href="UpdateInput.html" class="button2">Update a Record</a><hr>
    <a href="DeleteInput.html" class="button3">Delete a Record</a><hr>
    <a href="SearchInput.html" class="button4">Search a Record</a><hr>
  
  </div>
   
</form>
</body>
</html>