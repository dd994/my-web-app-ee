<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 02.01.2020
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new user</title>
</head>

<body>
<div>
    <h1>Let add new user.</h1>
</div>

<div>
    <%--    <%--%>
    <%--        if (request.getAttribute("userName") != null) {--%>
    <%--            out.println("<p>UserTest '" + request.getAttribute("userName") + "' added!</p>");--%>
    <%--        }--%>
    <%--    %>--%>
    <div>
        <%--        <div>--%>
        <%--            <h2>Add userTest</h2>--%>
        <%--        </div>--%>

        <form method="post">
            <label>First name:
                <input type="text" name="firstname"><br/>
            </label>
            <label>Second name:
                <input type="text" name="secondname"><br/>
            </label>
            <label>Mail:
                <input type="text" name="mail"><br/>
            </label>
            <label>Age:
                <input type="text" name="age"><br/>
            </label>
            <button type="submit">Submit</button>
        </form>
    </div>
</div>

<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>