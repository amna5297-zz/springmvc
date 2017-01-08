<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        
        <style>
        .button {
            background-color: #008CBA;
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        }
        </style>
        
    </head>

    <body>
        <BR />
        <center><p>Hello! ${message}</p></center>
        <center><p>${message1}</p></center>
        <BR />
        
        <center>
            <form action="LoginRequest" method="post">
                Username:   <input type="text" name="username" /><BR/>
                Password:   <input type="password" name="password" /><Br/>                                
                <input type="submit" value="Login" />
            </form>            
        </center>
        
        
        <center><button class="button">
            Upload file
            <form method="POST" enctype="multipart/form-data" action="uploadFile/process/htm">
                <input class="input-file" name="uploadFile" type="file"/>
                <input value="uploadFile" type="submit"/>
            </form>
        </button></center>
        
        <BR />
        <center><h2>~OR~</h2></center>
        
        
        
    </body>
</html>
