<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

        <!-- Sidebar user panel (optional) -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${contextPath}/resources/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>${sessionScope.admin.username}，我的ID：${sessionScope.admin.adminid}</p>
                <!-- Status -->
                <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
            </div>
        </div>

        <!-- Sidebar Menu -->
        <ul class="sidebar-menu" data-widget="tree">
            <li class="header">菜单</li>
            <li><a href="${contextPath}/admin/index"><i class="fa fa-dashboard"></i> <span>首页</span></a></li>

            <li class="treeview">
                <a href="#"><i class="fa fa-user"></i> <span>用户信息管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="${contextPath}/users/user/list"><i class="fa fa-circle-o"></i>用户信息管理</a></li>
                    <li><a href="${contextPath}/users/garden/list"><i class="fa fa-circle-o"></i>用户果园管理</a></li>
                    <li><a href="${contextPath}/users/user/list"><i class="fa fa-circle-o"></i>用户农事操作管理</a></li>
                    <li><a href="${contextPath}/users/user/list"><i class="fa fa-circle-o"></i>用户药肥使用的记录</a></li>
                    <li><a href="${contextPath}/admin/edit"><i class="fa fa-circle-o"></i>个人信息管理</a></li>
                </ul>
            </li>
            <li class="treeview">
                <a href="#"><i class="fa fa-user"></i> <span>静态资源管理</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="${contextPath}/static/user_auth/list"><i class="fa fa-circle-o"></i>授权信息管理</a></li>
                    <li><a href="${contextPath}/static/weather/list"><i class="fa fa-circle-o"></i>天气信息管理</a></li>
                    <li><a href="${contextPath}/static/reason/list"><i class="fa fa-circle-o"></i>肥药使原因管理</a></li>
                    <li><a href="${contextPath}/static/farming_operating/list"><i class="fa fa-circle-o"></i>农事操作管理</a></li>
                    <li><a href="${contextPath}/static/variety/list"><i class="fa fa-circle-o"></i>品种信息管理</a></li>
                    <li><a href="${contextPath}/static/period/list"><i class="fa fa-circle-o"></i>物候期信息管理</a></li>
                </ul>
            </li>
        </ul>
        <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
</aside>