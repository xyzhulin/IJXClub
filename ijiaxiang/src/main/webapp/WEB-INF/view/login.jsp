<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/login.css" ></link>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.2.1.min.js" ></script>
    <script type="text/javascript">
        $(document).ready(function(){
        });
    </script>
</head>
<body>
<div id="loginPattern">
    <a href="#" style="margin: 8px 0 0 10px;"><—返回到首页</a>
    <div id="submitDiv">
        <form action="#" method="post">
            <table id="submitTable" frame="box" width="300px" height="110px">
                <tr>
                    <td><label></label><input class="input" type="text" title="请输入账号" placeholder="请输入账号"></input></td>
                <tr>

                <tr>
                    <td><label></label><input class="input" type="password" title="请输入密码" placeholder="请输入密码"></input>
                    </td>
                <tr>

                <tr>
                    <td>
                        <div style="float: left;"><input type="checkbox" id="remember" width="8px"/>记住密码</div>
                        <div style="float:right"><a href="#">忘记密码</a></div>
                    </td>
                </tr>

                <tr>
                    <td><input id="submitButton" type="submit" value="登录"></td>
                </tr>
            </table>
        </form>
    </div>
</div>
<div id="loginBottom">
    IJiaXiang.club
</div>

</body>
</html>
