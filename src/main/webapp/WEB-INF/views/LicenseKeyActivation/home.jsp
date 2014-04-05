<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class=no-js>
<!--<![endif]-->
<head>
<meta charset=utf-8>
<title>EMC</title>
<meta name=description content="">
<meta name=viewport content="width=device-width">
<link rel="shortcut icon" href=/favicon.ico>
<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
<!-- bower:css -->
<!-- endbower -->
<!-- endbuild -->
<link rel=stylesheet href=/resources/styles/772eeba0.main.css>
<script src=/resources/scripts/vendor/10d160c6.modernizr.js></script>
<body>
	<!--[if lt IE 9]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
	<div class="navbar navbar-inverse navbar-fixed-top" role=navigation>
		<div class=container>
			<div class=navbar-header>
				<button type=button class=navbar-toggle data-toggle=collapse
					data-target=.navbar-collapse>
					<span class=sr-only>Toggle navigation</span> <span class=icon-bar></span>
					<span class=icon-bar></span> <span class=icon-bar></span>
				</button>
				<a class=navbar-brand href="/"><img src=/resources/images/b5a5b52d.logo.png></a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href=javascript:><spring:message code="activationPortal.homeScreen.welecome.msg"/></a></li>
					<li><a href=javascript:><spring:message code="activationPortal.homeScreen.glossary.msg"/></a></li>
					<li><a href=javascript:><spring:message code="activationPortal.homeScreen.support.msg"/></a></li>
					<li><a href=javascript:><spring:message code="activationPortal.homeScreen.logout.msg"/></a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
	<div class="main container">
		<div class=row>
			<div class=col-sm-6>
				<h1 class=margin-top-0>
					<spring:message code="activationPortal.homeScreen.liceseneAuthorization.msg"/>
				</h1>
				<div>
					<span class=lightGrayText><spring:message code="activationPortal.homeScreen.soldto.msg"/>:</span> 
					<span>${lac.fulFillmentDetails.address}</span>
				</div>
				<div>
					<span class=lightGrayText><spring:message code="activationPortal.homeScreen.fulfilled.msg"/>:</span> 
							<span>${lac.fulFillmentDetails.date}</span>
				</div>
				<div>
					<span class=lightGrayText><spring:message code="activationPortal.homeScreen.sentto.msg"/>:</span> <span>${lac.fulFillmentDetails.sentEmail}</span>
				</div>
			</div>
			<div class=col-sm-6>
				<div class="lacNumber pull-right">
					<span class=lightGrayText>LAC #</span> <span>${lac.id}</span>
				</div>
			</div>
		</div>
		<br>
		<div class="panel panel-primary">
			<div class=panel-body>
				<h4><spring:message code="activationPortal.homeScreen.header.msg"/></h4>
				<div class="panel panel-default emc-panel">
					<div class=panel-heading>
						<h3 class=panel-title>
							<span class=icons-key></span> <spring:message code="activationPortal.homeScreen.licenseheader.msg"/>
						</h3>
					</div>
					<div class=panel-body>
						<table class="table table-hover">
							<thead>
								<tr>
									<th width=55%><spring:message code="activationPortal.homeScreen.label.product"/>
									<th width=15% class=text-center><spring:message code="activationPortal.homeScreen.label.totalquantity"/>
									<th width=15% class=text-center><spring:message code="activationPortal.homeScreen.label.active"/>
									<th width=15% class=text-center><spring:message code="activationPortal.homeScreen.label.available"/>
							<tbody>
							<c:forEach items="${lac.products}" var="prod">
								<c:if test="${prod.productActivationType =='L'}" >
  									<tr>  									
										<td>${prod.productDetail.name}</td>
										<td class=text-center>${prod.productDetail.totalQty}</td>
										<td class=text-center><span class=lightGrayText>${prod.productDetail.activeQty}</span></td>
										<td class=text-center>${prod.productDetail.availableQty}</td>
									<tr>
								</c:if>
							</c:forEach>								
						</table>
					</div>
					<div class=panel-footer>
						<div class=pull-right>
							<span>5 <spring:message code="activationPortal.homeScreen.label.steps"/></span><a href=SelectLacProductQuantity.jsp class="btn btn-primary"><spring:message code="activationPortal.homeScreen.label.start"/>:
								<spring:message code="activationPortal.homeScreen.label.selectquantity"/> &raquo;</a>
						</div>
					</div>
				</div>
				<div class="panel panel-default emc-panel">
					<div class=panel-heading>
						<h3 class=panel-title>
							<span class=icons-copy></span><spring:message code="activationPortal.homeScreen.certificateheader.msg"/>
						</h3>
					</div>
					<div class=panel-body>
						<table class="table table-hover">
							<thead>
								<tr>
									<th width=55%><spring:message code="activationPortal.homeScreen.label.product"/>
									<th width=15% class=text-center><spring:message code="activationPortal.homeScreen.label.totalquantity"/>
									<th width=15% class=text-center><spring:message code="activationPortal.homeScreen.label.active"/>
									<th width=15% class=text-center><spring:message code="activationPortal.homeScreen.label.available"/>
							<tbody>
								<c:forEach items="${lac.products}" var="prod">
								<c:if test="${prod.productActivationType =='C'}" >
  									<tr>  									
										<td>${prod.productDetail.name}</td>
										<td class=text-center>${prod.productDetail.totalQty}</td>
										<td class=text-center><span class=lightGrayText>${prod.productDetail.activeQty}</span></td>
										<td class=text-center>${prod.productDetail.availableQty}</td>
									<tr>
								</c:if>
							</c:forEach>
						</table>
					</div>
					<div class=panel-footer>
						<div class=pull-right>
							<span>5 <spring:message code="activationPortal.homeScreen.label.steps"/></span><a href=SelectLacProductQuantity.jsp class="btn btn-primary"><spring:message code="activationPortal.homeScreen.label.start"/>:
								<spring:message code="activationPortal.homeScreen.label.selectquantity"/> &raquo;</a>
						</div>
					</div>
				</div>
				<div class="panel panel-default emc-panel">
					<div class=panel-heading>
						<h3 class=panel-title>
							<span class=icons-computer></span> <spring:message code="activationPortal.homeScreen.autoactivateheader.msg"/>
						</h3>
					</div>
					<div class=panel-body>
						<table class=table>
							<thead>
								<tr>
									<th width=55%><spring:message code="activationPortal.homeScreen.label.product"/>
									<th width=15% class=text-center><spring:message code="activationPortal.homeScreen.label.totalquantity"/>
									<th width=15% class=text-center><spring:message code="activationPortal.homeScreen.label.active"/>
									<th width=15% class=text-center><spring:message code="activationPortal.homeScreen.label.available"/>
							<tbody>
								<c:forEach items="${lac.products}" var="prod">
								<c:if test="${prod.productActivationType =='A'}" >
  									<tr>  									
										<td>${prod.productDetail.name}</td>
										<td class=text-center>${prod.productDetail.totalQty}</td>
										<td class=text-center><span class=lightGrayText>${prod.productDetail.activeQty}</span></td>
										<td class=text-center>${prod.productDetail.availableQty}</td>
									<tr>
								</c:if>
							</c:forEach>
						</table>
					</div>
					<div class=panel-footer>
						<div class=pull-right>
							<span>2 <spring:message code="activationPortal.homeScreen.label.steps"/></span><a href=SelectLacProductQuantity.jsp class="btn btn-primary">
								<spring:message code="activationPortal.homeScreen.label.activate"/>
								&raquo;</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src=/resources/scripts/3eda25cb.vendor.js></script>
	<script src=/resources/scripts/036656e4.plugins.js></script>
	<script src=/resources/scripts/58186c39.main.js></script>