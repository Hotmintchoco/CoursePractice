/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.53
 * Generated at: 2022-08-22 11:42:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>여행가기 좋은날</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\n");
      out.write("	crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\n");
      out.write("	integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\n");
      out.write("	integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\n");
      out.write("	integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://kit.fontawesome.com/c34800a0df.js\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"owlcarousel/owl.carousel.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/style.css\">\n");
      out.write("<style>\n");
      out.write("@font-face {\n");
      out.write("	font-family: 'yg-jalnan';\n");
      out.write("	src:\n");
      out.write("		url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_four@1.2/JalnanOTF00.woff')\n");
      out.write("		format('woff');\n");
      out.write("	font-weight: normal;\n");
      out.write("	font-style: normal;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("	font-family: 'yg-jalnan', cursive\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul>li>a {\n");
      out.write("	color: #212121;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bg:hover {\n");
      out.write("	opacity: 0.7;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".carousel-inner { //\n");
      out.write("	height: 300px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("p {\n");
      out.write("	color: #212121;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".item, img {\n");
      out.write("	height: 500px; ! important;\n");
      out.write("	width: 100% !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".card-img-top{\n");
      out.write("height: 300px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\n");
      out.write("	<div class=\"card\"></div>\n");
      out.write("	<br>\n");
      out.write("	<br>\n");
      out.write("	<a\n");
      out.write("		style=\"display: scroll; position: fixed; bottom: 20px; z-index: 999; right: 60px; font-size: 40px;\"\n");
      out.write("		href=\"#\" title=”top\"> <i class=\"fa-solid fa-circle-arrow-up\"></i></a>\n");
      out.write("	<!-- header card -->\n");
      out.write("\n");
      out.write("\n");
      out.write("	<div class=\"card\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("	<div id=\"carouselExampleIndicators\" class=\"carousel slide\"\n");
      out.write("		data-ride=\"carousel\">\n");
      out.write("		<ol class=\"carousel-indicators\">\n");
      out.write("			<li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\"\n");
      out.write("				class=\"active\"></li>\n");
      out.write("			<li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("			<li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("		</ol>\n");
      out.write("		<div class=\"carousel-inner\">\n");
      out.write("			<div class=\"carousel-item active\">\n");
      out.write("				<img class=\"carousel-img d-block w-100\"\n");
      out.write("					src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[564].destinationFirstImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"First slide\">\n");
      out.write("				<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("					<p class=\"subtitle\">\n");
      out.write("					<h1>바다 앞 기암절벽과 정자가 어우러진 아름다운 절경</h1>\n");
      out.write("					</p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"carousel-item\">\n");
      out.write("				<img class=\"carousel-img d-block w-100\"\n");
      out.write("					src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[745].destinationFirstImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Second slide\">\n");
      out.write("				<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("					<p class=\"subtitle\">\n");
      out.write("					<h1>밤에 보면 매력이 두 배 #천지연폭포</h1>\n");
      out.write("					</p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"carousel-item\">\n");
      out.write("				<img class=\"carousel-img d-block w-100\"\n");
      out.write("					src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[775].destinationFirstImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Third slide\">\n");
      out.write("				<div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("					<p class=\"subtitle\">\n");
      out.write("					<h1>신라 천년의 밤을 만나다! 경주 동궁과 월지, 월정교</h1>\n");
      out.write("					</p>\n");
      out.write("				</div>\n");
      out.write("\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("		<!-- Control Btn -->\n");
      out.write("\n");
      out.write("		<a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\"\n");
      out.write("			role=\"button\" data-slide=\"prev\"> <span\n");
      out.write("			class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span> <span\n");
      out.write("			class=\"sr-only\">Previous</span>\n");
      out.write("		</a> <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\"\n");
      out.write("			role=\"button\" data-slide=\"next\"> <span\n");
      out.write("			class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span> <span\n");
      out.write("			class=\"sr-only\">Next</span>\n");
      out.write("		</a>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("	<br>\n");
      out.write("	<br>\n");
      out.write("	<br>\n");
      out.write("	<div class=\"container\">\n");
      out.write("		<div class=\"text-center\">\n");
      out.write("			<h2>함께 떠나는 힐링 테마여행</h2>\n");
      out.write("			<p>#유네스코 세계문화유산</p>\n");
      out.write("		</div>\n");
      out.write("		<br>\n");
      out.write("		<div class=\"row g-1\">\n");
      out.write("			<div class=\"col-4\">\n");
      out.write("				<a href=\"http://localhost:8081/destination/get.do?pageNum=1&amount=10&type=&keyword=&destinationAddress=%EC%B6%A9%EC%B2%AD%EB%82%A8&num=708\" class=\"fh5co-card-item image-popup\">\n");
      out.write("					<figure>\n");
      out.write("						<div class=\"overlay\">\n");
      out.write("							<i class=\"ti-plus\"></i>\n");
      out.write("						</div>\n");
      out.write("						<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[92].destinationFirstImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Image\"\n");
      out.write("							class=\"img-responsive\">\n");
      out.write("					</figure>\n");
      out.write("					<div class=\"fh5co-text\">\n");
      out.write("						<h2>충청도</h2>\n");
      out.write("						<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[92].destinationTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("						<p>\n");
      out.write("							<span class=\"btn btn-primary\"> 보러가기</span>\n");
      out.write("						</p>\n");
      out.write("					</div>\n");
      out.write("				</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"col-4\">\n");
      out.write("				<a href=\"http://localhost:8081/destination/get.do?pageNum=1&amount=10&type=T&keyword=%EC%84%B8%EA%B3%84%EB%AC%B8%ED%99%94&destinationAddress=&num=674\" \n");
      out.write("					class=\"fh5co-card-item image-popup\">\n");
      out.write("					<figure>\n");
      out.write("						<div class=\"overlay\">\n");
      out.write("							<i class=\"ti-plus\"></i>\n");
      out.write("						</div>\n");
      out.write("						<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[126].destinationFirstImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Image\"\n");
      out.write("							class=\"img-responsive\">\n");
      out.write("					</figure>\n");
      out.write("					<div class=\"fh5co-text\">\n");
      out.write("						<h2>서울</h2>\n");
      out.write("						<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[126].destinationTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("						<p>\n");
      out.write("							<span class=\"btn btn-primary\">보러가기</span>\n");
      out.write("						</p>\n");
      out.write("					</div>\n");
      out.write("				</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"col-4\">\n");
      out.write("				<a href=\"http://localhost:8081/destination/get.do?pageNum=2&amount=10&type=T&keyword=%EC%84%B8%EA%B3%84%EB%AC%B8%ED%99%94&destinationAddress=&num=178\"\n");
      out.write("					class=\"fh5co-card-item image-popup\">\n");
      out.write("					<figure>\n");
      out.write("						<div class=\"overlay\">\n");
      out.write("							<i class=\"ti-plus\"></i>\n");
      out.write("						</div>\n");
      out.write("						<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[622].destinationFirstImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" \" alt=\"Image\"\n");
      out.write("							class=\"img-responsive\">\n");
      out.write("					</figure>\n");
      out.write("					<div class=\"fh5co-text\">\n");
      out.write("						<h2>경상도</h2>\n");
      out.write("						<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[622].destinationTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("						<p>\n");
      out.write("							<span class=\"btn btn-primary\">보러가기</span>\n");
      out.write("						</p>\n");
      out.write("					</div>\n");
      out.write("				</a>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("			<div class=\"col-4\">\n");
      out.write("				<a href=\"http://localhost:8081/destination/get.do?pageNum=1&amount=10&type=T&keyword=%ED%99%94%EC%84%B1&destinationAddress=&num=135\"\n");
      out.write("					class=\"fh5co-card-item image-popup\">\n");
      out.write("					<figure>\n");
      out.write("						<div class=\"overlay\">\n");
      out.write("							<i class=\"ti-plus\"></i>\n");
      out.write("						</div>\n");
      out.write("						<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[665].destinationFirstImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Image\"\n");
      out.write("							class=\"img-responsive\">\n");
      out.write("					</figure>\n");
      out.write("					<div class=\"fh5co-text\">\n");
      out.write("						<h2>경기도</h2>\n");
      out.write("						<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[665].destinationTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("						<p>\n");
      out.write("							<span class=\"btn btn-primary\">보러가기</span>\n");
      out.write("						</p>\n");
      out.write("					</div>\n");
      out.write("				</a>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<div class=\"col-4\">\n");
      out.write("				<a href=\"http://localhost:8081/destination/get.do?pageNum=1&amount=10&type=&keyword=&destinationAddress=%EC%A0%84%EB%9D%BC%EB%82%A8&num=758\"\n");
      out.write("					class=\"fh5co-card-item image-popup\">\n");
      out.write("					<figure>\n");
      out.write("						<div class=\"overlay\">\n");
      out.write("							<i class=\"ti-plus\"></i>\n");
      out.write("						</div>\n");
      out.write("						<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[42].destinationFirstImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Image\"\n");
      out.write("							class=\"img-responsive\">\n");
      out.write("					</figure>\n");
      out.write("					<div class=\"fh5co-text\">\n");
      out.write("						<h2>전라도</h2>\n");
      out.write("						<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[42].destinationTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("						<p>\n");
      out.write("							<span class=\"btn btn-primary\">보러가기</span>\n");
      out.write("						</p>\n");
      out.write("					</div>\n");
      out.write("				</a>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<div class=\"col-sm-4\">\n");
      out.write("				<a href=\"http://localhost:8081/destination/get.do?pageNum=1&amount=10&type=T&keyword=%EC%84%B8%EA%B3%84%EB%AC%B8%ED%99%94&destinationAddress=&num=318\"\n");
      out.write("					class=\"fh5co-card-item image-popup\">\n");
      out.write("					<figure>\n");
      out.write("						<div class=\"overlay\">\n");
      out.write("							<i class=\"ti-plus\"></i>\n");
      out.write("						</div>\n");
      out.write("						<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[482].destinationFirstImg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Image\"\n");
      out.write("							class=\"img-responsive\">\n");
      out.write("					</figure>\n");
      out.write("					<div class=\"fh5co-text\">\n");
      out.write("						<h2>인천</h2>\n");
      out.write("						<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${des[482].destinationTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("						<p>\n");
      out.write("							<span class=\"btn btn-primary\">보러가기</span>\n");
      out.write("						</p>\n");
      out.write("					</div>\n");
      out.write("				</a>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<br>\n");
      out.write("	<br>\n");
      out.write("	<br>\n");
      out.write("<div class=\"text-center\">\n");
      out.write("			<h2>#축제 #문화 #추천 </h2>\n");
      out.write("<span class=\"btn btn-outline-info\"><a href=\"/festival/page.do\">자세한게 궁금해? 여기 click!!</a></span>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"body2\" style=\"height: 600px;\">\n");
      out.write("	<div class=\"slide-track\">\n");
      out.write("<div class=\"slider-container\">\n");
      out.write("        <span class=\"slider-span\" id=\"slider-span1\"></span>\n");
      out.write("        <span class=\"slider-span\" id=\"slider-span2\"></span>\n");
      out.write("        <span class=\"slider-span\" id=\"slider-span3\"></span>\n");
      out.write("        <span class=\"slider-span\" id=\"slider-span4\"></span>\n");
      out.write("        <span class=\"slider-span\" id=\"slider-span5\"></span>\n");
      out.write("        <span class=\"slider-span\" id=\"slider-span6\"></span>\n");
      out.write("        <span class=\"slider-span\" id=\"slider-span7\"></span>\n");
      out.write("    \n");
      out.write("    <div class=\"image-slider\">\n");
      out.write("        <div class=\"sliders-div\" id=\"slider-1\">\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data[0].firstimg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" class=\"img\" id=\"img1\">\n");
      out.write("            <a href=\"#slider-span1\" class=\"button\" id=\"button-1\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sliders-div\" id=\"slider-2\">\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data[178].firstimg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" class=\"img\" id=\"img2\">\n");
      out.write("            <a href=\"#slider-span2\" class=\"button\" id=\"button-2\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sliders-div\" id=\"slider-3\">\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data[289].firstimg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" class=\"img\" id=\"img3\">\n");
      out.write("            <a href=\"#slider-span3\" class=\"button\" id=\"button-3\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sliders-div\" id=\"slider-4\">\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data[8].firstimg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" class=\"img\" id=\"img4\">\n");
      out.write("            <a href=\"#slider-span4\" class=\"button\" id=\"button-4\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sliders-div\" id=\"slider-5\">\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data[135].firstimg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"alt=\"\" class=\"img\" id=\"img5\">\n");
      out.write("            <a href=\"#slider-span5\" class=\"button\" id=\"button-5\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sliders-div\" id=\"slider-6\">\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data[136].firstimg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" class=\"img\" id=\"img6\">\n");
      out.write("            <a href=\"#slider-span6\" class=\"button\" id=\"button-6\"></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sliders-div\" id=\"slider-7\">\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${data[140].firstimg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" class=\"img\" id=\"img7\">\n");
      out.write("            <a href=\"#slider-span7\" class=\"button\" id=\"button-7\"></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("	\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
