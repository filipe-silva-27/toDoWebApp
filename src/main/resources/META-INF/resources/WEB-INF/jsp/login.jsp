<html>
    <head>
        <title> Login Page</title>
    </head>
    <body>
        <%--expression language is used to use variables passed--%>
        Welcome to the login page ${name}!

        <form method="post">
            Name: <label>
            <input type="text" name="name"/>
        </label><br/>
            Password: <label>
            <input type="password" name="password"/>
        </label><br/>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>