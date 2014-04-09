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
<link rel=stylesheet href=<c:url value="/resources/styles/be70d43f.main.css" />>
<script src=<c:url value="/resources/scripts/vendor/10d160c6.modernizr.js" />></script>
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
			<a class=navbar-brand href="home?lac=${lac.id}"><img
				src=<c:url value="/resources/images/b5a5b52d.logo.png" />></a>
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href=javascript:><spring:message
							code="activationPortal.homeScreen.welecome.msg" /></a></li>
				<li><a href=javascript:><spring:message
							code="activationPortal.homeScreen.glossary.msg" /></a></li>
				<li><a href=javascript:><spring:message
							code="activationPortal.homeScreen.support.msg" /></a></li>
				<li><a href=javascript:><spring:message
							code="activationPortal.homeScreen.logout.msg" /></a></li>

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
							<span class="glyphicon glyphicon-lock"></span> <spring:message code="activationPortal.homeScreen.licenseheader.msg"/>
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
										<td>										
											${prod.productDetail.name}											
										</td>										
										<td class=text-center>${prod.productDetail.totalQty}</td>
										<td class=text-center>
											<span class=lightGrayText>
												<c:if test = "${prod.productDetail.activeQty !=0}">
													<a class=productInfoLink data-lacid=${lac.id} data-productid=${prod.productDetail.id} href=javascript:;>${prod.productDetail.activeQty}</a>
												</c:if>
												<c:if test ="${prod.productDetail.activeQty==0}">
													${prod.productDetail.activeQty}
												</c:if>
											</span>
										</td>
										<td class=text-center>${prod.productDetail.availableQty}</td>
									<tr>
								</c:if>
							</c:forEach>
						</table>
					</div>
					<div class=panel-footer>
						<div class=pull-right>
							<span>5 <spring:message code="activationPortal.homeScreen.label.steps"/></span>
								<a href="selectQuantity?lac=${lac.id}&activationType=L" class="btn btn-primary">
								<spring:message code="activationPortal.homeScreen.label.start"/>:
								<spring:message code="activationPortal.homeScreen.label.selectquantity"/> &raquo;</a>
						</div>
					</div>
				</div>
				<div class="panel panel-default emc-panel">
					<div class=panel-heading>
						<h3 class=panel-title>
							<span class="glyphicon glyphicon-file"></span>
							<spring:message code="activationPortal.homeScreen.certificateheader.msg"/>
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
							<span>5 <spring:message code="activationPortal.homeScreen.label.steps"/></span>
							<a href="selectQuantity?lac=${lac.id}&activationType=C" class="btn btn-primary">
							<spring:message code="activationPortal.homeScreen.label.start"/>:
							<spring:message code="activationPortal.homeScreen.label.selectquantity"/> &raquo;</a>
						</div>
					</div>
				</div>
				<div class="panel panel-default emc-panel">
					<div class=panel-heading>
						<h3 class=panel-title>
							<span class="glyphicon glyphicon-certificate"></span> <spring:message code="activationPortal.homeScreen.autoactivateheader.msg"/>
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
							<span>2 <spring:message code="activationPortal.homeScreen.label.steps"/></span>
							<a href="selectQuantity?lac=${lac.id}&activationType=A" class="btn btn-primary">
							<spring:message code="activationPortal.homeScreen.label.activate"/>
								&raquo;</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id=infoModal>
		<div class="modal-dialog modal-lg">
			<div class=modal-content>
				<div class=modal-header>
					<button type=button class=close data-dismiss=modal aria-hidden=true>&times;</button>
					<h4 class=modal-title>Product Activation Details</h4>
				</div>
				<div class=modal-body></div>
				<div class=modal-footer>
					<button type=button class="btn btn-default" data-dismiss=modal>Close</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
<script type=text/html id=loadingTmpl>[% var loadingText = loadingText || 'loading...'; %]
        <div class="loading">
            
        </div></script><script type=text/html id=productInfoTmpl>
		
		<h5>Name: <b>[%= resp.name %]</b></h5>  
		
        <table class="table table-hover">
          <thead>
            <tr>
              <th width="25%">Activation Id</th>
              <th width="20%">Bound to</th>
              <th width="15%" class="text-center">Activated By</th>
              <th width="25%" class="text-center">Activated On</th>
              <th width="15%" class="text-center"></th>
            </tr>
          </thead>
          <tbody>
            [% for(var i=0; i<resp.activatedLicensesList.length; i++){ %]
                <tr>
                  <td>[%= resp.activatedLicensesList[i].activationId %]</td>
                  <td>[%= resp.activatedLicensesList[i].boundTo %]</td>
                  <td class="text-center">[%= resp.activatedLicensesList[i].activatedBy %]</td>
                  <td class="text-center">[%= resp.activatedLicensesList[i].activatedOn %]</td>
                  <td class="text-center">
                    <a href="javascript:;" class="prodInfoIcon icons-mail"></a>
                    <a href="javascript:;" class="prodInfoIcon icons-user"></a>
                    <a href="javascript:;" class="prodInfoIcon icons-info"></a>
                  </td>
                </tr>
            [% } %]
          </tbody>
        </table></script>			
	<script src=<c:url value="/resources/scripts/3eda25cb.vendor.js" />></script>
	<script src=<c:url value="/resources/scripts/036656e4.plugins.js" />></script>
	<script src=<c:url value="/resources/scripts/aaf28002.main.js" />></script>
	