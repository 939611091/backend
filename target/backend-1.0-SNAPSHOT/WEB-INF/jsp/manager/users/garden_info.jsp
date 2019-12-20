<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>百果飘香管理系统</title>
    <%-- 后台必须有的CSS--%>
    <jsp:include page="../common/required_css.jsp"/>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

    <!-- Google Font -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>

<body class="hold-transition skin-blue sidebar-mini">
    <div class="wrapper">

        <!-- Main Header -->
        <jsp:include page="../common/main_header.jsp"/>
        <!-- Left side column. contains the logo and sidebar -->
        <jsp:include page="../common/main_siderbar.jsp"/>

       <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <section class="content-header">
            <h1>
                查看果园详情
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i>果园详情管理</a></li>
                <li class="active">查看果园详情</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content ">
            <div class="row">
                <div class="col-md-12">
                    <div class="box box-info">
                        <div class="box-header with-border">
                            <h3 class="box-title">查看果园详情</h3>&nbsp&nbsp&nbsp
                            <h3 class="box-title">${msgError}</h3>
                        </div>
                        <!-- /.box-header -->
                        <!-- form start -->
                        <form class="form-horizontal" method="post" id="edit_gardenVo" >
                            <div class="box-body">
                                    <div class="col-md-8">
                                        <div class="blog_item m-top-20">
<%--                                            <div class="blog_item_img">--%>
<%--                                                <img src="http://localhost:8080/${gardenVo.cPhoto}" width="200" height="350" />--%>
<%--                                            </div>--%>
                                            <div class="blog_text roomy-40">
                                                <h6>果园id：${gardenVo.id }</h6>
                                                <p><em>拥有者id：${gardenVo.user.id }</em></p>
                                                <p>种植类别：${gardenVo.variety.name}&nbsp;&nbsp;&nbsp;&nbsp; 物候期：${gardenVo.period.name}</p>
                                                <p><em>果园名：${gardenVo.name}&nbsp;&nbsp;&nbsp;&nbsp; 树龄：${gardenVo.age}&nbsp;年&nbsp;&nbsp;&nbsp;种植面积：${gardenVo.area}亩</em></p>
                                                <p><em>位置：${gardenVo.loc}&nbsp;&nbsp;&nbsp;&nbsp; 地址：${gardenVo.address}</em></p>
                                                <iframe
                                                        width="697"
                                                        height="550"
                                                        frameborder="0" style="border:0"
                                                        src="${contextPath}/users/garden/map?id=${gardenVo.id}">
                                                </iframe>
                                            </div>
                                        </div>
                                    </div>
                            </div>
                            <!-- /.box-body -->
                            <!-- /.box-footer -->
                        </form>
                    </div>
                </div>
            </div>
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

        <!-- Main Footer -->
        <jsp:include page="../common/main_footer.jsp"/>

        <div class="control-sidebar-bg"></div>
    </div>
    <!-- ./wrapper -->


    <%--后台必要的JavaScript库--%>
    <jsp:include page="../common/required_js.jsp"/>

</body>

</html>