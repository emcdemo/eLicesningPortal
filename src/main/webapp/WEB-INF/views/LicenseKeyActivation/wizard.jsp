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
<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>


<link rel="shortcut icon" href=/favicon.ico>
<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
<!-- bower:css -->
<!-- endbower -->
<!-- endbuild -->
<link rel=stylesheet href=<c:url value="/resources/styles/be70d43f.main.css" />>
<script src=<c:url value="/resources/scripts/vendor/10d160c6.modernizr.js" />></script>
<script type="text/javascript" src=<c:url value="/resources/jquery/1.6/jquery.js" />></script>
<script type="text/javascript">
var token = $("meta[name='_csrf']").attr("content");
var header = $("meta[name='_csrf_header']").attr("content");
$(document).ready(function(){
	$(document).ajaxSend(function(e, xhr, options) {
		xhr.setRequestHeader(header, token);
	});
});
function sendAjax() {
	var jsonData = "{\"lacId\" : \"AAA3BBBB4CCCCC5\",\"activateProductList\" : [ {\"productId\" : \"1\",\"selectedSystems\" : [ {\"systemId\" : \"1\",\"siteId\" : \"1\"} ]} ]}";
		
	$.ajax
		(				
				{ 
					type: "POST", 
					url: "process", 
					data: jsonData, 
					headers: { 
				            'Accept': 'application/json',
				            'Content-Type': 'application/json' 
				    }, 
					dataType: "text", 
					success: function(text) { 
						alert(text); 
					}, error: 
					function(xhr) 
					{ 
						alert(xhr); 
					}
				}
		);
}
</script>

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
			<a class=navbar-brand href="home?lac=${lacId}"><img
				src=<c:url value="/resources/scripts/3eda25cb.vendor.js" />></a>
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
	<div class=main>
		<div class=container>
			<div class="row row-offcanvas row-offcanvas-left">
				<div class="col-xs-6 col-sm-3 sidebar-offcanvas" id=sidebar
					role=navigation>
					<div class=list-group>
						<a href=javascript: class="list-group-item active">1. <spring:message code="activationPortal.homeScreen.label.selectquantity"/></a> 
						<a href=javascript: class=list-group-item>2. <spring:message code="activationPortal.homeScreen.label.selectsystems"/></a> 
						<a href=javascript: class=list-group-item>3. <spring:message code="activationPortal.lockingScreen.LockingId.button"/></a> 
						<a href=javascript: class=list-group-item>4. <spring:message code="activationPortal.reviewActivationScreen.ReviewActivation.button"/></a> 
						<a href=javascript: class=list-group-item>5. <spring:message code="activationPortal.activateLicenseKeys.acitvateLicenseKeys.button"/></a>
					</div>

				</div>
				<!--/span-->
				<p class="pull-left visible-xs" id=toggle-steps>
					<button type=button class="btn btn-warning btn-xs"
						data-toggle=offcanvas><spring:message code="activationPortal.homeScreen.label.showprogress"/></button>
				</p>
				
				<div id=wrapper class="col-xs-12 col-sm-9"></div>
				<div id=step1-contents class="col-xs-12 col-sm-9 steps-data">
					<div class="panel panel-primary emc-panel">
						<div class=panel-heading>
							<h3 class=panel-title><spring:message code="activationPortal.homeScreen.label.selectquantity"/></h3>
						</div>
						<div class=panel-body>
							<h2><spring:message code="activationPortal.homeScreen.label.step"/> 1: <spring:message code="activationPortal.homeScreen.label.selectquantity"/></h2>
							<p class=help-block><spring:message code="activationPortal.selectQuantityScreen.headerNote.msg"/></p>
							<table class="table table-hover">
								<thead>
									<tr>
										<th>
										<th><spring:message code="activationPortal.homeScreen.label.product"/>
										<th class=text-center><spring:message code="activationPortal.homeScreen.label.totalquantity"/>
										<th class=text-center><spring:message code="activationPortal.homeScreen.label.active"/>
										<th class=text-center><spring:message code="activationPortal.homeScreen.label.available"/>
										<th><spring:message code="activationPortal.homeScreen.label.qtyToActivate"/>
								<tbody>
									<c:set var="pageCount" value="0" scope="page" />
									<c:forEach items="${selectedProducts}" var="prod">
										<c:set var="activeTag" value="disabled" scope="page"/>
										<c:set var="checked" value="" scope="page"/>											
										<c:if test="${pageCount==0}">
											<c:set var="activeTag" value="" scope="page"/>
											<c:set var="checked" value="checked" scope="page"/>
										</c:if>
  										<tr>
  											<td><input type=checkbox class="prod-sel " + ${checked} name=prod-sel>  									
											<td>${prod.productDetail.name}</td>
											<td class=text-center>${prod.productDetail.totalQty}</td>
											<td class=text-center><span class=lightGrayText>${prod.productDetail.activeQty}</span></td>
											<td class=text-center>${prod.productDetail.availableQty}</td>
											<td>	
												<select class="form-control qty-to-act-picker " + ${activeTag} data-prodid="${pageCount}">
													<c:forEach var="availableQtyCount" begin="1" end="${prod.productDetail.availableQty}" step="1" varStatus ="status">														
														<option>${availableQtyCount}</option>												
													</c:forEach>
												</select>
											</td>
										<tr>										
										<c:set var="pageCount" value="${pageCount + 1}" scope="page"/>
									</c:forEach>									
							</table>
						</div>
						<div class=panel-footer>
							<div class=pull-left>
								<a href="home?lac=${lacId}" class="btn btn-default"><spring:message code="activationPortal.common.back.label"/></a>
							</div>
							<div class=pull-right>
								<a href="home?lac=${lacId}" class="btn btn-default"><spring:message code="activationPortal.common.cancel.label"/></a> <a
									href=javascript: data-nextid=step2
									class="btn btn-primary next-step"><spring:message code="activationPortal.common.next.label"/> <spring:message code="activationPortal.homeScreen.label.selectsystems"/>
									&raquo;</a>
							</div>
						</div>
					</div>
				</div>
				<!--/span-->
				<div id=step2-contents
					class="col-xs-12 col-sm-9 disp-none steps-data"></div>
				<div id=step3-contents
					class="col-xs-12 col-sm-9 disp-none steps-data"></div>
				<div id=step4-contents
					class="col-xs-12 col-sm-9 disp-none steps-data"></div>
				<div id=step5-contents
					class="col-xs-12 col-sm-9 disp-none steps-data"></div>
			</div>
		</div>
	</div>
	<!-- templates for next steps will be part of Initial load to save resources later on -->
	<script type=text/html id=step2><div class="panel panel-primary emc-panel">
                        <div class="panel-heading">
                            <h3 class="panel-title">Select Systems</h3>
                        </div>
                        <div class="panel-body">
        <h2>Step 2: Select Systems</h2>
        <div class="alert alert-danger done"><spring:message code="activationPortal.mapMachineProductScreen.errorMsg.incorrectMachineSelection"/></div>  
        <div class="alert alert-danger incomplete">Oops! You have not selected the required number of systems</div>            
          
        <p class="help-block"><spring:message code="activationPortal.mapMachineProductScreen.tracking.msg"/></p>
        <p class="help-block"><spring:message code="activationPortal.mapMachineProductScreen.selectSite.msg"/>:</p>
<div class="panel-group" id="accordion">

[%for(var k=0; k< resp.selectedProds.length; k++){%]
 <div class="panel panel-default error-holder">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" href="#collapse_[%= k %]">
          [%=resp.selectedProds[k].name %]
        </a>
      </h4>
    </div>
    [% if(k == 0) {%]
    <div id="collapse_[%= k %]" class="panel-collapse collapse in">
    [% } else {%]
      <div id="collapse_[%= k %]" class="panel-collapse collapse">
    [% } %]
<div class="panel-body selection-parent">
        <div class="btn-group btn-input clearfix">
            <button type="button" class="btn btn-default dropdown-toggle form-control" data-toggle="dropdown">
              <span data-bind="label">Select One</span> <span class="caret"></span>
            </button>
                <ul class="dropdown-menu" role="menu">
                 [% for(var i=0; i< resp.length; i++){ %]
                    <li class="sel_[%= resp[i].siteID %]"><a href="javascript:">[%= resp[i].city%], [%=resp[i].country%], [%=resp[i].provinceCode%], [%=resp[i].pinCode%]  </a></li>
                  [% } %]
                </ul>
        </div>
        <hr />

         <div class="row">
                              <div class="col-md-9">
                                <p class="help-block">Select [%= resp.selectedProds[k].qty %] System(s) to bind to:</p>                                
                                <p class="help-block" id="selectedSite"><strong>Please select a Site</strong></p>
                              </div>
                              <div class="col-md-3 text-right">
                                <p class="help-block">Number of license(s)</p>
                                <p class="help-block" id="selectedLicenses"><strong> [%= resp.selectedProds[k].qty %]</strong></p>
                              </div>
                          </div>
                          <div class="row">
                              <div class="col-md-6">
                                <input type="text" placeholder="Find a Machine" class="form-control filter-list-txt" disabled="disabled">
                                <div class="panel panel-default">
                                  <div class="panel-body no-padding">
                                    <ul class="filter-list">
                                       [% for(var i=0; i< resp.length; i++){                                        
                                           for(var j=0; j< resp[i].systemList.length; j++){ 
                                        %]
                                          <li class="list_sel list_sel_[%= resp[i].siteID %] disp-none"><input type="checkbox" data-id="[%=resp[i].systemList[j].id%]" class="sel_system"> <label>[%= resp[i].systemList[j].systemName  %]</label> </li>
                                       [% } }%]
                                    </ul>
                                  </div>
                                </div>
                                
                              </div>
                              <div class="col-md-6">
                                <div class="panel panel-default">
                                  <div class="panel-heading">
                                    <h3 class="panel-title"><label class="selCount">0</label> of [%= resp.selectedProds[k].qty %] System(s) selected</h3>
                                  </div>
                                  <div class="panel-body no-padding">
                                    <ul class="selected-list">  

                                    </ul>
                                  </div>
                                </div>
                              </div>
                          </div>
                          <input type="hidden" id="prod_exp_[%= k %]" class="prod-sel-qty-exp" value="[%= resp.selectedProds[k].qty %]">
                          <input type="hidden" id="prod_act_[%= k %]" class="prod-sel-qty-act" value="0">

          </div>
          </div>

          </div>
[% } %]
        </div>
       <div class="panel-footer">
                            <div class="pull-left">
                                <a href="selectQuantity?lac=${lacId}&activationType=${activationType}" class="btn btn-default"><spring:message code="activationPortal.common.back.label"/></a>
                            </div>
                            <div class="pull-right">
                                <a href="home?lac=${lacId}" class="btn btn-default"><spring:message code="activationPortal.common.cancel.label"/></a>
                                <a href="javascript:" data-nextid="step3" class="btn btn-primary next-step"><spring:message code="activationPortal.common.next.label"/>: <spring:message code="activationPortal.lockingScreen.LockingId.button"/> &raquo;</a>
                            </div>

                        </div>
        </div></script>
	<script type=text/html id=selectedTmpl><li><span data-id="[%= obj.id %]" class="glyphicon glyphicon-remove remove-item"></span> [%= obj.systemName %]</li></script>
	<script type=text/html id=loadingTmpl>[% var loadingText = loadingText || 'loading...'; %]
         <div class="panel panel-primary emc-panel">
                        <div class="panel-heading">
                            <h3 class="panel-title">Loading Next Step</h3>
                        </div>
                        <div class="panel-body">
        <div class="loading"></div>
        </div>
        </div></script>
	<script type=text/html id=step3><div class="panel panel-primary ems-panel">
                        <div class="panel-heading">
                            <h3 class="panel-title"><spring:message code="activationPortal.lockingScreen.LockingId.button"/></h3>
                        </div>
                        <div class="panel-body">
                             <h2>Step 3: <spring:message code="activationPortal.lockingScreen.LockingId.button"/></h2>
                              <p class="help-block"><spring:message code="activationPortal.reviewActivationScreen.verifyLockingId.msg" /></p>
                              <hr/>

                               [% for(var i=0; i< resp.selectedSystems.length; i++){  %]
                       
          							<h4><span class="glyphicon glyphicon-inbox"></span> [%= resp.selectedSystems[i].name %]</h4>   <span class="help-block">[%= (resp.selectedProds[i]? resp.selectedProds[i].name:'') %]</span>
                                    <input type="text" class="form-control mac-input" placeholder="Enter the MAC address of this machine">
                               
 								[% } %]

                        </div>
                              <div class="panel-footer">
                            <div class="pull-left">
                                <a href="selectQuantity?lac=${lacId}&activationType=${activationType}" class="btn btn-default"><spring:message code="activationPortal.common.back.label"/></a>
                            </div>
                            <div class="pull-right">
                                <a href="home?lac=${lacId}" class="btn btn-default"><spring:message code="activationPortal.common.cancel.label"/></a>
                                <a href="javascript:" data-nextid="step4" class="btn btn-primary next-step">Next: <spring:message code="activationPortal.reviewActivationScreen.ReviewActivation.button"/> &raquo;</a>
                            </div>

                        </div>


    </div></script>
	<script type=text/html id=step4><div class="panel panel-primary ems-panel">
                        <div class="panel-heading">
                            <h3 class="panel-title"><spring:message code="activationPortal.reviewActivationScreen.ReviewActivation.button"/></h3>
                        </div>
                        <div class="panel-body">
                            <h2>Step 4: Review Activations</h2>
                            <p class="help-block"><spring:message code="activationPortal.reviewActivationScreen.headerNote.msg"/></p>
                            [% for(var i=0; i< resp.selectedSystems.length; i++){ var a = resp.selectedSystems[i];%]
                            <div>
                                <h4><span class="glyphicon glyphicon-inbox"></span> [%= a.name %]</h4>
                                <div class="panel panel-default get-licenses-panel">
                                    <div class="panel-body">
                                        <table class="table">
                                            <thead>
                                                <th>License</th>
                                                <th>Quantity</th>
                                                <th>Unit</th>
                                                
                                            </thead>
                                            <tbody>
                                              <tr>
                                                <td>                                                   
                                                    <div class="help-block">[%= a.prodName %]</div>
                                                </td>
                                                <td>1</td>
                                                <td>seat</td>                                             
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            [% } %]
                          <label class="pull-right"><input type="checkbox" id="tnc"> <spring:message code="activationPortal.reviewActivationScreen.termsandcondition.label1"/> <a href="javascript:" data-toggle="modal" data-target="#tncModal"><spring:message code="activationPortal.reviewActivationScreen.termsandcondition.label2"/></a>
                        </div>
                        <div class="panel-footer">                            
                            <div class="pull-left">
                                <a href="selectQuantity?lac=${lacId}&activationType=${activationType}" class="btn btn-default"><spring:message code="activationPortal.common.back.label"/></a>
                            </div>
                            <div class="pull-right">
                                <a href="home?lac=${lacId}" class="btn btn-default"><spring:message code="activationPortal.common.cancel.label"/></a>
                                <a href="javascript:" data-nextid="step5" id="step4Next" class="btn btn-primary next-step disabled"><spring:message code="activationPortal.reviewActivationScreen.activatelicenses.button"/> &raquo;</a>
                            </div>

                        </div>
                    </div></script>
	<script type=text/html id=step5><div class="panel panel-primary ems-panel">
                        <div class="panel-heading">
                            <h3 class="panel-title"><spring:message code="activationPortal.activateLicenseKeys.acitvateLicenseKeys.button"/></h3>
                        </div>
                        <div class="panel-body">
                            <h2>Step 5: Get License Keys</h2>
                            <a href="javascript:" class="btn btn-success"> <span class="glyphicon glyphicon-envelope"></span>&nbsp;&nbsp;Email All</a>
                            <a href="javascript:" class="btn btn-success"> <span class="glyphicon glyphicon-download"></span>&nbsp;&nbsp;Download All</a>
                            <p class="help-block">Copy or email individual License keys, or download all keys to MS Excel file.</p>
                            [% for(var i=0; i< resp.activated_licenses.length; i++){ var a = resp.activated_licenses[i];%]
                            <div>
                                <h4><span class="glyphicon glyphicon-inbox"></span> [%= a.bound_to %]</h4>
                                <div class="panel panel-default get-licenses-panel">
                                    <div class="panel-body">
                                        <table class="table">
                                            <thead>
                                                <th width="50%"><spring:message code="activationPortal.common.license.header.label"/></th>
                                                <th width="15%"><spring:message code="activationPortal.common.quantity.header.label"/></th>
                                                <th width="15%"><spring:message code="activationPortal.common.unit.header.label"/></th>
                                                <th width="15%"></th>
                                            </thead>
                                            <tbody>
                                                <td>
                                                    <b>[%=a.activation_id%]</b>
                                                    <div class="help-block">[%=a.productName%]</div>
                                                </td>
                                                <td>[%=a.quantity%]</td>
                                                <td>[%=a.units %]</td>
                                                <td>
                                                    <button type="button" class="btn btn-success">
                                                        <span class="glyphicon glyphicon-envelope"></span>&nbsp;&nbsp;Email
                                                    </button>
                                                </td>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            [% } %]                        
                        </div>
                        <div class="panel-footer">                            
                            <div class="pull-right">
                                <a href="home?lac=${lacId}" class="btn btn-primary"><spring:message code="activationPortal.common.done.header.label"/></a>                                
                            </div>

                        </div>
                    </div></script>
	<!-- Modal -->
	
	<%@include file="TermsAndCondition.jsp" %>
	
	<input type=hidden id=step2JSONUrl value=<c:url value="/resources/data/systems.json" />>
	<input type=hidden id=step4JSONUrl value=<c:url value="/resources/data/licenses.json" />>
	<input type=hidden id=step5JSONUrl value=process>
	<script src=<c:url value="/resources/scripts/3eda25cb.vendor.js" />></script>
	<script src=<c:url value="/resources/scripts/036656e4.plugins.js" />></script>
	<script src=<c:url value="/resources/scripts/aaf28002.main.js" />></script>
	