<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Home</title>
        <link href="../../resources/css/home.css" rel="stylesheet" type="text/css">
        <script src="../../resources/js/home.js"></script>
    </head>
    <body>
        <div id = "container">
            <h1>
                Welcome! Spring App has been successfully run!
            </h1>
            <P> The time on the server is ${serverTime}. </P>
        </div>
    </body>
</html>