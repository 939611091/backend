<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<sec:authentication property="principal" var="authentication"/>
<header class="main-header">

    <!-- Logo -->
    <a href="#" class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>BACK</b>MS</span>
        <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>BACK</b>MS</span>
    </a>

    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
        <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>
        <!-- Navbar Right Menu -->
        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <!-- Notifications Menu -->
<%--                <li class="dropdown notifications-menu">--%>
<%--                    <!-- Menu toggle button -->--%>
<%--                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">--%>
<%--                        <i class="fa fa-bell-o"></i>--%>
<%--                        <span class="label label-warning">10</span>--%>
<%--                    </a>--%>
<%--                    <ul class="dropdown-menu">--%>
<%--                        <li class="header">You have ${count} notifications</li>--%>
<%--                        <li>--%>
<%--                            <!-- Inner Menu: contains the notifications -->--%>
<%--                            <ul class="menu">--%>
<%--                                <li><!-- start notification -->--%>
<%--                                    <a href="#">--%>
<%--                                        <i class="fa fa-users text-aqua"></i> 5 new members joined today--%>
<%--                                    </a>--%>
<%--                                    <a href="#">--%>
<%--                                        <i class="fa fa-users text-aqua"></i> 5 new members joined today--%>
<%--                                    </a> <a href="#">--%>
<%--                                        <i class="fa fa-users text-aqua"></i> 5 new members joined today--%>
<%--                                    </a> <a href="#">--%>
<%--                                        <i class="fa fa-users text-aqua"></i> 5 new members joined today--%>
<%--                                    </a> <a href="#">--%>
<%--                                        <i class="fa fa-users text-aqua"></i> 5 new members joined today--%>
<%--                                    </a> <a href="#">--%>
<%--                                        <i class="fa fa-users text-aqua"></i> 5 new members joined today--%>
<%--                                    </a> <a href="#">--%>
<%--                                        <i class="fa fa-users text-aqua"></i> 5 new members joined today--%>
<%--                                    </a>--%>


<%--                                </li>--%>
<%--                                <!-- end notification -->--%>
<%--                            </ul>--%>
<%--                        </li>--%>
<%--                        <li class="footer"><a href="#">查看全部通知</a></li>--%>
<%--                    </ul>--%>
<%--                </li>--%>
                <!-- User Account Menu -->
                <li class="dropdown user user-menu">
                    <!-- Menu Toggle Button -->
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <!-- The user image in the navbar-->
                        <img src="${contextPath}/resources/dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
                        <!-- hidden-xs hides the username on small devices so only the image appears. -->
                        <span class="hidden-xs">用户名：${sessionScope.admin.username}</span>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- The user image in the menu -->
                        <li class="user-header">
                            <img src="${contextPath}/resources/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                            <p>

                                <span>${sessionScope.admin.username}</span>
                                <%--                                <small>${'权限：'}</small>--%>
                            </p>
                        </li>
                        <!-- Menu Footer-->
                        <li class="user-footer">

                            <div class="pull-right">
                                <a href="${contextPath}/admin/exit" class="btn btn-default btn-flat">注销</a>
                                <form id="logoutform" action="#" method="post">

                                </form>
                            </div>
                        </li>
                    </ul>
                </li>

            </ul>
        </div>
    </nav>
</header>
