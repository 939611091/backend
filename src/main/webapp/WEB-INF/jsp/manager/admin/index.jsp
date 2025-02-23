<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>百果飘香管理系统</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <jsp:include page="../common/required_css.jsp"/>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<style>

    .block-flowchart .panel-body {padding: 0 30px 0 20px;}
    .flow-item {float: left; width: 16.66667%; max-width: 180px; text-align: center; margin-bottom: 9px; padding-right: 15px;}
    .flow-item > div {position: relative; padding: 5px 0 5px 8px; line-height: 20px; background: #E8EBEF; white-space:nowrap; overflow: visible; color: #3c4353}
    .flow-item > div:before, .flow-item > div:after {content: ' '; display: block; width: 0; height: 0; border-style: solid; border-width: 15px 0 15px 10px; border-color: transparent transparent transparent #E8EBEF; position: absolute; left: 0; top: 0;}
    .ie-8 .flow-item > div:before {display: none}
    .flow-item > div:before {border-left-color: #fff; z-index: 1}
    .flow-item > div:after {left: auto; right: -10px; z-index: 2}
    .ie-8 .flow-item > div {margin-right: 10px}
    .flow-item-0 > div {color: #838A9D; font-weight: bold; padding-left: 0;}
    .flow-item-0 > div:before {display: none}
    .flow-item-1 > div {background: #E3F2FD}
    .flow-item-1 > div:after {border-left-color: #E3F2FD}
    .flow-item-2 > div {background: #E8F5E9}
    .flow-item-2 > div:after {border-left-color: #E8F5E9}
    .flow-item-3 > div {background: #FFF3E0}
    .flow-item-3 > div:after {border-left-color: #FFF3E0}
    .flow-item-4 > div {background: #FFEBEE}
    .flow-item-4 > div:after {border-left-color: #FFEBEE}
    .flow-item-5 > div {background: #F3E5F5}
    .flow-item-5 > div:after {border-left-color: #F3E5F5}
    .flow-item-1 > div:hover {background: #1565C0; color: #fff;}
    .flow-item-1 > div:hover:after {border-left-color: #1565C0}
    .flow-item-2 > div:hover {background: #43A047; color: #fff;}
    .flow-item-2 > div:hover:after {border-left-color: #43A047}
    .flow-item-3 > div:hover {background: #EF6C00; color: #fff;}
    .flow-item-3 > div:hover:after {border-left-color: #EF6C00}
    .flow-item-4 > div:hover {background: #E53935; color: #fff;}
    .flow-item-4 > div:hover:after {border-left-color: #E53935}
    .flow-item-5 > div:hover {background: #9C27B0; color: #fff;}
    .flow-item-5 > div:hover:after {border-left-color: #9C27B0}

    .block-sm .flow-item {padding-right: 5px}
    .block-sm .flow-item > div:before, .block-sm .flow-item > div:after {border-width: 15px 0 15px 6px;}
    .block-sm .row-3 .flow-item-1, .block-sm .row-3 .flow-item-3 {width: 25%}
    .block-sm .flow-item > div:after {right: -6px;}

</style>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <!-- Main Header -->
    <jsp:include page="../common/main_header.jsp"/>
    <!-- Left side column. contains the logo and sidebar -->
    <jsp:include page="../common/main_siderbar.jsp"/>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">

        <!-- Main content -->
        <section class="content container-fluid">
            <div class="box box-default">

                <!-- /.box-header -->
                <div class="box-body" >
                    <h1>欢迎使用百果飘香管理系统 </h1>
                    <%--<c:choose>--%>
                        <%--<c:when test="${notificationCount > 0}">--%>
                            <%--<p>您有 ${notificationCount} 条<a href="${contextPath}/manager/user/currentuser/message_list">未读通知</a>哦 (๑＞ڡ＜)☆</p>--%>
                        <%--</c:when>--%>
                            <h3>你好，${sessionScope.user.nickname}管理员 (๑＞ڡ＜)☆</h3>
                    <%--</c:choose>--%>
                    <h3 class="box-title">${msgSuccess}${msgError}</h3>
                </div>
            </div>



        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <!-- Main Footer -->
    <jsp:include page="../common/main_footer.jsp"/>
</div>
<!-- ./wrapper -->

<%--后台必要的JavaScript库--%>
<jsp:include page="../common/required_js.jsp"/>

</body>
</html>