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
<link rel=stylesheet href=styles/be70d43f.main.css>
<script src=scripts/vendor/10d160c6.modernizr.js></script>
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
				<a class=navbar-brand href=index.html><img
					src=images/b5a5b52d.logo.png></a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href=javascript:>Welcome User</a></li>
					<li><a href=javascript:>Glossary</a></li>
					<li><a href=javascript:>Support</a></li>
					<li><a href=javascript:>Logout</a></li>
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
						<a href=javascript: class="list-group-item active">1. Select
							Quantity</a> <a href=javascript: class=list-group-item>2. Select
							Systems</a> <a href=javascript: class=list-group-item>3. Enter
							Locking IDs</a> <a href=javascript: class=list-group-item>4.
							Review Activations</a> <a href=javascript: class=list-group-item>5.
							Get License Keys</a>
					</div>
				</div>
				<!--/span-->
				<p class="pull-left visible-xs" id=toggle-steps>
					<button type=button class="btn btn-warning btn-xs"
						data-toggle=offcanvas>Show Progress</button>
				</p>
				<div id=wrapper class="col-xs-12 col-sm-9"></div>
				<div id=step1-contents class="col-xs-12 col-sm-9 steps-data">
					<div class="panel panel-primary emc-panel">
						<div class=panel-heading>
							<h3 class=panel-title>Select Quantity</h3>
						</div>
						<div class=panel-body>
							<h2>Step 1: Select Quantity</h2>
							<p class=help-block>Select the quantity of licenses you wish
								to activate for each product</p>
							<table class="table table-hover">
								<thead>
									<tr>
										<th>
										<th>Product
										<th class=text-center>Total Qty.
										<th class=text-center>Active
										<th class=text-center>Available
										<th>Qty. to Activate
								<tbody>
									<tr>
										<td><input type=checkbox class=prod-sel name=prod-sel
											checked>
										<td>Network Mod for Oracle CLT Oracle8 & later UX
										<td class=text-center>10
										<td class=text-center><span class=lightGrayText>0</span>
										<td class=text-center>10
										<td><select class="form-control qty-to-act-picker"
											data-prodid=1><option>1
												<option>2
												<option>3
												<option>4
												<option>5</select>
									<tr>
										<td><input type=checkbox class=prod-sel name=prod-sel>
										<td>Open file mgr 25
										<td class=text-center>10
										<td class=text-center><span class=lightGrayText>0</span>
										<td class=text-center>10
										<td><select class="form-control qty-to-act-picker"
											disabled data-prodid=2><option>1
												<option>2
												<option>3
												<option>4
												<option>5</select>
									<tr>
										<td><input type=checkbox class=prod-sel name=prod-sel>
										<td>Powerpath VE unserved Licenses
										<td class=text-center>10
										<td class=text-center><span class=lightGrayText>0</span>
										<td class=text-center>10
										<td><select class="form-control qty-to-act-picker"
											disabled data-prodid=3><option>1
												<option>2
												<option>3
												<option>4
												<option>5</select>
							</table>
						</div>
						<div class=panel-footer>
							<div class=pull-left>
								<a href=index.html class="btn btn-default">Back</a>
							</div>
							<div class=pull-right>
								<a href=index.html class="btn btn-default">Cancel</a> <a
									href=javascript: data-nextid=step2
									class="btn btn-primary next-step">Next: Select Systems
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
        <div class="alert alert-danger done">Oops! You have already selected the required number of systems</div>  
        <div class="alert alert-danger incomplete">Oops! You have not selected the required number of systems</div>            
          
        <p class="help-block">For Tracking purposes, you can choose to bind a license to a machine.</p>
        <p class="help-block">Select Systems from the site:</p>
<div class="panel-group" id="accordion">

<%for(var k=0; k< resp.selectedProds.length; k++){%>
 <div class="panel panel-default error-holder">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" href="#collapse_<%=k%>">
          <%=resp.selectedProds[k].name%>
        </a>
      </h4>
    </div>
    <%if(k == 0) {%>
    <div id="collapse_<%=k%>" class="panel-collapse collapse in">
    <%} else {%>
      <div id="collapse_<%=k%>" class="panel-collapse collapse">
    <%}%>
<div class="panel-body selection-parent">
        <div class="btn-group btn-input clearfix">
            <button type="button" class="btn btn-default dropdown-toggle form-control" data-toggle="dropdown">
              <span data-bind="label">Select One</span> <span class="caret"></span>
            </button>
                <ul class="dropdown-menu" role="menu">
                 <%for(var i=0; i< resp.length; i++){%>
                    <li class="sel_<%=resp[i].siteID%>"><a href="javascript:"><%=resp[i].city%>, <%=resp[i].country%>, <%=resp[i].provinceCode%>, <%=resp[i].pinCode%>  </a></li>
                  <%}%>
                </ul>
        </div>
        <hr />

         <div class="row">
                              <div class="col-md-9">
                                <p class="help-block">Select <%=resp.selectedProds[k].qty%> System(s) to bind to:</p>                                
                                <p class="help-block" id="selectedSite"><strong>Please select a Site</strong></p>
                              </div>
                              <div class="col-md-3 text-right">
                                <p class="help-block">Number of license(s)</p>
                                <p class="help-block" id="selectedLicenses"><strong> <%=resp.selectedProds[k].qty%></strong></p>
                              </div>
                          </div>
                          <div class="row">
                              <div class="col-md-6">
                                <input type="text" placeholder="Find a Machine" class="form-control filter-list-txt" disabled="disabled">
                                <div class="panel panel-default">
                                  <div class="panel-body no-padding">
                                    <ul class="filter-list">
                                       <%for(var i=0; i< resp.length; i++){                                        
                                           for(var j=0; j< resp[i].systemList.length; j++){%>
                                          <li class="list_sel list_sel_<%=resp[i].siteID%> disp-none"><input type="checkbox" data-id="<%=resp[i].systemList[j].id%>" class="sel_system"> <label><%=resp[i].systemList[j].systemName%></label> </li>
                                       <%} }%>
                                    </ul>
                                  </div>
                                </div>
                                
                              </div>
                              <div class="col-md-6">
                                <div class="panel panel-default">
                                  <div class="panel-heading">
                                    <h3 class="panel-title"><label class="selCount">0</label> of <%=resp.selectedProds[k].qty%> System(s) selected</h3>
                                  </div>
                                  <div class="panel-body no-padding">
                                    <ul class="selected-list">  

                                    </ul>
                                  </div>
                                </div>
                              </div>
                          </div>
                          <input type="hidden" id="prod_exp_<%=k%>" class="prod-sel-qty-exp" value="<%=resp.selectedProds[k].qty%>">
                          <input type="hidden" id="prod_act_<%=k%>" class="prod-sel-qty-act" value="0">

          </div>
          </div>

          </div>
<%}%>
        </div>
       <div class="panel-footer">
                            <div class="pull-left">
                                <a href="wizard.html" class="btn btn-default">Back</a>
                            </div>
                            <div class="pull-right">
                                <a href="index.html" class="btn btn-default">Cancel</a>
                                <a href="javascript:" data-nextid="step3" class="btn btn-primary next-step">Next: Enter Locking IDs &raquo;</a>
                            </div>

                        </div>
        </div></script>
	<script type=text/html id=selectedTmpl><li><span data-id="<%=obj.id%>" class="glyphicon glyphicon-remove remove-item"></span> <%=obj.systemName%></li></script>
	<script type=text/html id=loadingTmpl><%var loadingText = loadingText || 'loading...';%>
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
                            <h3 class="panel-title">Enter Locking IDs</h3>
                        </div>
                        <div class="panel-body">
                             <h2>Step 3: Entering Locking IDs</h2>
                              <p class="help-block">Enter or verify the locking IDs for each system below.</p>
                              <hr/>
                               <%for(var i=0; i< resp.selectedSystems.length; i++){ var a = resp.selectedSystems[i];%>
                                  <h4><span class="glyphicon glyphicon-inbox"></span> <%=a.name%></h4>
                                  <p class="help-block">Mac address</p>
                                  <input type="text" class="form-control " placeholder="Enter the MAC address of this machine">
                                <%}%>

                        </div>
                              <div class="panel-footer">
                            <div class="pull-left">
                                <a href="wizard.html#step2" class="btn btn-default">Back</a>
                            </div>
                            <div class="pull-right">
                                <a href="index.html" class="btn btn-default">Cancel</a>
                                <a href="javascript:" data-nextid="step4" class="btn btn-primary next-step">Next: Review Activations &raquo;</a>
                            </div>

                        </div>


    </div></script>
	<script type=text/html id=step4><div class="panel panel-primary ems-panel">
                        <div class="panel-heading">
                            <h3 class="panel-title">Review Activations</h3>
                        </div>
                        <div class="panel-body">
                            <h2>Step 4: Review Activations</h2>
                            <p class="help-block">Please review, then click "Activate Licenses" to generate  License keys</p>
                            <%for(var i=0; i< resp.activated_licenses.length; i++){ var a = resp.activated_licenses[i];%>
                            <div>
                                <h4><span class="glyphicon glyphicon-inbox"></span> <%=a.bound_to%></h4>
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
                                                    <div class="help-block">Networker mod for Oracle CLT Oracles8 & Later UX</div>
                                                </td>
                                                <td><%=a.quantity%></td>
                                                <td><%=a.units%></td>                                             
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <%}%>
                          <label class="pull-right"><input type="checkbox" id="tnc"> I agree to the <a href="javascript:" data-toggle="modal" data-target="#tncModal">Terms and Conditions</a>
                        </div>
                        <div class="panel-footer">                            
                            <div class="pull-left">
                                <a href="wizard.html#step2" class="btn btn-default">Back</a>
                            </div>
                            <div class="pull-right">
                                <a href="index.html" class="btn btn-default">Cancel</a>
                                <a href="javascript:" data-nextid="step5" id="step4Next" class="btn btn-primary next-step disabled">Next: Get License Keys &raquo;</a>
                            </div>

                        </div>
                    </div></script>
	<script type=text/html id=step5><div class="panel panel-primary ems-panel">
                        <div class="panel-heading">
                            <h3 class="panel-title">Get License Keys</h3>
                        </div>
                        <div class="panel-body">
                            <h2>Step 5: Get License Keys</h2>
                            <a href="javascript:" class="btn btn-success"> <span class="glyphicon glyphicon-envelope"></span>&nbsp;&nbsp;Email All</a>
                            <a href="javascript:" class="btn btn-success"> <span class="glyphicon glyphicon-download"></span>&nbsp;&nbsp;Download All</a>
                            <p class="help-block">Copy or email individual License keys, or download all keys to MS Excel file.</p>
                            <%for(var i=0; i< resp.activated_licenses.length; i++){ var a = resp.activated_licenses[i];%>
                            <div>
                                <h4><span class="glyphicon glyphicon-inbox"></span> <%=a.bound_to%></h4>
                                <div class="panel panel-default get-licenses-panel">
                                    <div class="panel-body">
                                        <table class="table">
                                            <thead>
                                                <th width="50%">License</th>
                                                <th width="15%">Quantity</th>
                                                <th width="15%">Unit</th>
                                                <th width="15%"></th>
                                            </thead>
                                            <tbody>
                                                <td>
                                                    <b><%=a.activation_id%></b>
                                                    <div class="help-block">Networker mod for Oracle CLT Oracles8 & Later UX</div>
                                                </td>
                                                <td><%=a.quantity%></td>
                                                <td><%=a.units%></td>
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
                            <%}%>                        
                        </div>
                        <div class="panel-footer">                            
                            <div class="pull-right">
                                <a href="index.html" class="btn btn-primary">Done</a>                                
                            </div>

                        </div>
                    </div></script>
	<!-- Modal -->
	<div class="modal fade" id=tncModal tabindex=-1 role=dialog
		aria-labelledby=myModalLabel aria-hidden=true>
		<div class=modal-dialog>
			<div class=modal-content>
				<div class=modal-header>
					<button type=button class=close data-dismiss=modal aria-hidden=true>&times;</button>
					<h4 class=modal-title id=myModalLabel>Terms & Condtitions</h4>
				</div>
				<div class=modal-body>
					<div class="marginRight15 marginBottom15">
						<p>Copyright 1994-2014 EMC Corporation. All rights reserved.</p>
						<p>All documents and information on any EMC website are
							protected by copyright. Except as specifically permitted herein,
							no portion of the documents or information on this website may be
							reproduced in any form or by any means without the express
							written consent of EMC.</p>
						<h3 class="subTitleGreen marginTop10">License disclaimer</h3>
						<p>Nothing on any EMC website shall be construed as conferring
							any license under any of EMC's or any third party's intellectual
							property rights, whether by estoppel, implication, or otherwise.</p>
						<h3 class="subTitleGreen marginTop10">Content and liability
							disclaimer</h3>
						<p>EMC shall not be responsible for any errors or omissions
							contained on any EMC website, and reserves the right to make
							changes anytime without notice. Mention of non-EMC products or
							services is provided for informational purposes only and
							constitutes neither an endorsement nor a recommendation by EMC.
							All EMC and third-party information provided on any EMC website
							is provided on an "as is" basis.</p>
						<p>EMC DISCLAIMS ALL WARRANTIES, EXPRESSED OR IMPLIED, WITH
							REGARD TO ANY INFORMATION (INCLUDING ANY SOFTWARE, PRODUCTS, OR
							SERVICES) PROVIDED ON ANY EMC WEBSITE, INCLUDING THE IMPLIED
							WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
							PURPOSE, AND NON-INFRINGEMENT.</p>
						<p>Some jurisdictions do not allow the exclusion of implied
							warranties, so the above exclusion may not apply to you.</p>
						<p>In no event shall EMC be liable for any damages whatsoever,
							and in particular EMC shall not be liable for direct, special,
							indirect, consequential, or incidental damages, or damages for
							lost profits, loss of revenue or loss of use, cost of replacement
							goods, loss or damage to data arising out of the use or inability
							to use any EMC website, any EMC product or service. This includes
							damages arising from use of or in reliance on the documents or
							information present on any EMC website (including any information
							posted or placed by anyone other than EMC), even if EMC has been
							advised of the possibility of such damages.</p>
						<h3 class="subTitleGreen marginTop10">Stock price performance
							disclaimer</h3>
						<p>The stock price performance shown on the stock quotes on
							any EMC website is not necessarily indicative of future price
							performance.</p>
						<h3 class="subTitleGreen marginTop10">Feedback information</h3>
						<p>Any information provided to EMC in connection with any EMC
							website shall be provided by the submitter and received by EMC on
							a non-confidential basis. Such information shall be considered
							non-confidential and property of EMC. By submitting any such
							information to EMC you agree to a no-charge assignment to EMC of
							all worldwide rights, title, and interest in copyrights and other
							intellectual property rights to the information. EMC shall be
							free to use such information on an unrestricted basis.</p>
						<!--<h3 class="subTitleGreen marginTop10">Trademarks</h3>
<p>The trademarks, logos, and service marks (collectively "Trademarks") appearing on the EMC website are the property of EMC and other parties. Nothing contained on the EMC website should be construed as granting any license or right to use any Trademark without the prior written permission of the party that owns the Trademark. A list of EMC trademarks is available at <span class="blueLink"><a href="/legal/emc-corporation-trademarks.htm">http://www.emc.com/legal/emc-corporation-trademarks.htm</a></span>.</p> -->
						<h3 class="subTitleGreen marginTop10">Links to third-party
							sites</h3>
						<p>EMC prohibits the use of the EMC LOGO as a "hot" link to
							any EMC website unless the establishment of such a link is
							approved by EMC Corporation. EMC websites may contain links to
							third-party sites. Access to any website linked to any EMC
							website is not the responsibility of EMC and EMC is not
							responsible for the accuracy, or reliability of any content on
							such websites. Further, the presence of a link to a third-party
							site does not mean that EMC endorses that site, its products, or
							views expressed there. EMC provides these links merely for
							convenience and the presence of such third-party links are not an
							endorsement or recommendation by EMC.</p>
						<h3 class="subTitleGreen marginTop10">Employee blog
							disclaimer</h3>
						<p>The opinions and interests expressed on EMC employee blogs
							are the employees' own and do not necessarily represent EMC's
							positions, strategies or views. EMC makes no representation or
							warranties about employee blogs or the accuracy or reliability of
							such blogs. When you access employee blogs, even though they may
							contain the EMC logo and content regarding EMC products and
							services, employee blogs are independent of EMC and EMC does not
							control their content or operation. In addition, a link to a blog
							does not mean that EMC endorses that blog or has responsibility
							for its content or use.</p>
						<h3 class="subTitleGreen marginTop10">Governing law and
							jurisdiction</h3>
						<p>This EMC website is controlled by EMC from its offices in
							Massachusetts, United States of America. All matters relating to
							your access to, or use of any EMC website shall be governed by
							U.S. federal law or the laws of the Commonwealth of
							Massachusetts. Any legal action or proceeding relating to your
							access to or use of any EMC website shall be instituted in a
							state or federal court in Middlesex County, Massachusetts. You
							and EMC agree to submit to the jurisdiction of, and agree that
							venue is proper in these courts.</p>
						<p>You may not access, download, use, or export information
							(including any software, products or services) contained on this
							EMC website in violation of U.S. export laws or regulations, or
							in violation of any applicable laws or regulations.</p>
					</div>
				</div>
				<div class=modal-footer>
					<button type=button class="btn btn-default" data-dismiss=modal>Close</button>
					<button type=button class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
	<input type=hidden id=step2JSONUrl value=data/systems.json>
	<input type=hidden id=step4JSONUrl value=data/licenses.json>
	<input type=hidden id=step5JSONUrl value=data/licenses.json>
	<script src=scripts/3eda25cb.vendor.js></script>
	<script src=scripts/036656e4.plugins.js></script>
	<script src=scripts/82183004.main.js></script>