<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <style>
        body {
            margin: 0;
            padding: 0;
        }

        .main-wrap {

        }

        header {
            height: 80px;
            background: #C62828;
        }
        
        ul{
        }
    </style>
    <link rel="stylesheet" href="http://localhost:8080/<%=request.getContextPath()%>/css/font-awesome/css/font-awesome.css"/>
</head>
<body>
<section class="main-wrap">
    <header>
        <nav class="left-nav">
            <ul>
                <li class="fa fa-bars"></li>
                <li>Challenge</li>
            </ul>
        </nav>
        <nav class="right-nav"></nav>
    </header>
</section>
</body>
</html>