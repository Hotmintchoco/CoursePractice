/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.53
 * Generated at: 2022-08-01 02:04:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.course;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class coursePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>코스추천</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../fontawesome/css/all.min.css\"> <!-- https://fontawesome.com/ -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/nav.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/animate.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <script src=\"https://kit.fontawesome.com/c34800a0df.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=6f7f2591af5145e97bd2969fcf925e6f\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("    @font-face {\r\n");
      out.write("    font-family: 'yg-jalnan';\r\n");
      out.write("    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_four@1.2/JalnanOTF00.woff') format('woff');\r\n");
      out.write("    font-weight: normal;\r\n");
      out.write("    font-style: normal;\r\n");
      out.write("}\r\n");
      out.write("      \r\n");
      out.write("   * {font-family: 'yg-jalnan', cursive }\r\n");
      out.write("\r\n");
      out.write("  .gd-container {\r\n");
      out.write("  max-width: 1100px;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  margin: 0 auto;\r\n");
      out.write("  padding-left: 15px;\r\n");
      out.write("  padding-right: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(" ul > li > a {color: #212121;}\r\n");
      out.write(" #slider {width: 1000px; height: 1000px; margin: 0 auto;}\r\n");
      out.write("\r\n");
      out.write(".dotOverlay {color:#747474; position:relative;bottom:-30px;border-radius:6px;border: 1px solid #ccc;border-bottom:2px solid #ddd;float:left;font-size:12px;padding:5px;background:#fff;}\r\n");
      out.write(".dotOverlay:nth-of-type(n) {border:0; box-shadow:0px 1px 2px #888;}\r\n");
      out.write(".customoverlay {position:relative;bottom:55px;border-radius:6px;border: 1px solid #ccc;border-bottom:2px solid #ddd;float:left;}\r\n");
      out.write(".customoverlay:nth-of-type(n) {border:0; box-shadow:0px 1px 2px #888;}\r\n");
      out.write(".customoverlay a {display:block;text-decoration:none;color:#000;text-align:center;border-radius:6px;font-size:14px;font-weight:bold;overflow:hidden;background: #d95050;background: #d95050 url(https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/arrow_white.png) no-repeat right 14px center;}\r\n");
      out.write(".customoverlay .title {display:block;text-align:center;background:#fff;margin-right:35px;padding:10px 15px;font-size:14px;font-weight:bold;}\r\n");
      out.write(".customoverlay:after {content:'';position:absolute;margin-left:-12px;left:50%;bottom:-12px;width:22px;height:12px;background:url('https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/vertex_white.png')}\r\n");
      out.write("\r\n");
      out.write("#courseTitle h1 {text-align: center;}\r\n");
      out.write("#courseTitle p {text-align: center;}\r\n");
      out.write("\r\n");
      out.write(".btn_good .ico {\r\n");
      out.write("    background: url(https://cdn.visitkorea.or.kr/resources/images/sub/ico_mpost01_on.png);\r\n");
      out.write("    width: 42px; height: 36px;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    test-indent: -9999px;\r\n");
      out.write("    }\r\n");
      out.write(".btn_good { width: 75px; height: 55px; border: none; background-color: #FFFFFF; }\r\n");
      out.write("</style>\r\n");
      out.write("     \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../includes/header.jsp", out, false);
      out.write("\r\n");
      out.write("<a style=\"display:scroll;position:fixed;bottom:20px;z-index: 999;right:60px;font-size: 40px;\" href=\"#\" title=\"âtop\">\r\n");
      out.write("<i class=\"fa-solid fa-circle-arrow-up\"></i></a>\r\n");
      out.write("	\r\n");
      out.write("<!-- header card -->\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"card\">\r\n");
      out.write("	   \r\n");
      out.write("	</div>\r\n");
      out.write("	<br><br>\r\n");
      out.write("	<div id=\"slider\">\r\n");
      out.write("	         <!-- title, city 입력 -->\r\n");
      out.write("	     <div id=\"courseTitle\">\r\n");
      out.write("	     	<h1>코스 제목</h1>\r\n");
      out.write("	     	<p>지역명</p>\r\n");
      out.write("	     	<button type=\"button\" class=\"btn_good\">\r\n");
      out.write("	     		<span class=\"ico\"></span>\r\n");
      out.write("	     		<span class=\"num\" id=\"numLike\">10</span>\r\n");
      out.write("	     	</button>\r\n");
      out.write("	     	<hr>\r\n");
      out.write("	     </div>\r\n");
      out.write("	     \r\n");
      out.write("	        \r\n");
      out.write("	     <div id=\"map\" style=\"width:500px;height:400px; margin: 0 auto;\"></div>\r\n");
      out.write("	     <p>총 거리</p><span id=\"i_result\"></span>\r\n");
      out.write("	<hr>\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("		\r\n");
      out.write("		var mapContainer = document.getElementById('map'), // 지도를 표시할 div  \r\n");
      out.write("	    mapOption = { \r\n");
      out.write("	        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표\r\n");
      out.write("	        level: 3 // 지도의 확대 레벨\r\n");
      out.write("	    };\r\n");
      out.write("\r\n");
      out.write("		var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다\r\n");
      out.write("		var distanceOverlay;\r\n");
      out.write("		var dots = {};\r\n");
      out.write("\r\n");
      out.write("		// 마커를 표시할 위치와 title 객체 배열입니다 \r\n");
      out.write("		var positions = [\r\n");
      out.write("		    {\r\n");
      out.write("		        title: '카카오', \r\n");
      out.write("		        latlng: new kakao.maps.LatLng(33.450705, 126.570677)\r\n");
      out.write("		    },\r\n");
      out.write("		    {\r\n");
      out.write("		        title: '생태연못', \r\n");
      out.write("		        latlng: new kakao.maps.LatLng(33.450936, 126.569477)\r\n");
      out.write("		    },\r\n");
      out.write("		    {\r\n");
      out.write("		        title: '텃밭', \r\n");
      out.write("		        latlng: new kakao.maps.LatLng(33.450879, 126.569940)\r\n");
      out.write("		    },\r\n");
      out.write("		    {\r\n");
      out.write("		        title: '근린공원',\r\n");
      out.write("		        latlng: new kakao.maps.LatLng(33.451393, 126.570738)\r\n");
      out.write("		    },\r\n");
      out.write("		    {\r\n");
      out.write("		        title: '제주공항',\r\n");
      out.write("		        latlng: new kakao.maps.LatLng(33.5106, 126.4914)\r\n");
      out.write("		    }\r\n");
      out.write("		];\r\n");
      out.write("\r\n");
      out.write("	    \r\n");
      out.write("		for (var i = 0; i < positions.length; i ++) {\r\n");
      out.write("			var imageSrc = \"../img/marker/marker-icon\" + (i+1) +\".png\"; \r\n");
      out.write("		    \r\n");
      out.write("		    // 마커 이미지의 이미지 크기 입니다\r\n");
      out.write("		    var imageSize = new kakao.maps.Size(40, 45); \r\n");
      out.write("		    \r\n");
      out.write("		    // 마커 이미지를 생성합니다    \r\n");
      out.write("		    var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize); \r\n");
      out.write("		    \r\n");
      out.write("		    // 마커를 생성합니다\r\n");
      out.write("		    var marker = new kakao.maps.Marker({\r\n");
      out.write("		        map: map, // 마커를 표시할 지도\r\n");
      out.write("		        position: positions[i].latlng, // 마커를 표시할 위치\r\n");
      out.write("		        title : positions[i].title, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다\r\n");
      out.write("		        image : markerImage // 마커 이미지 \r\n");
      out.write("		    });\r\n");
      out.write("		    \r\n");
      out.write("		 // 커스텀 오버레이에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다\r\n");
      out.write("		    var content = '<div class=\"customoverlay\">' +\r\n");
      out.write("		        '  <a href=\"https://map.kakao.com/link/map/11394059\" target=\"_blank\">' +\r\n");
      out.write("		        '    <span class=\"title\">'+ positions[i].title +'</span>' +\r\n");
      out.write("		        '  </a>' +\r\n");
      out.write("		        '</div>';\r\n");
      out.write("		    \r\n");
      out.write("		    var customOverlay = new kakao.maps.CustomOverlay({\r\n");
      out.write("		        map: map,\r\n");
      out.write("		        position: positions[i].latlng,\r\n");
      out.write("		        content: content,\r\n");
      out.write("		        yAnchor: 1 \r\n");
      out.write("		    });\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		var linePath;\r\n");
      out.write("		var lineLine = new kakao.maps.Polyline();\r\n");
      out.write("		var distance;\r\n");
      out.write("		var totalDistance = 0;\r\n");
      out.write("\r\n");
      out.write("		for (var i = 0; i < positions.length; i++) {\r\n");
      out.write("			if (i != 0) {\r\n");
      out.write("				linePath = [ positions[i - 1].latlng, positions[i].latlng ]\r\n");
      out.write("			}\r\n");
      out.write("			;\r\n");
      out.write("			lineLine.setPath(linePath);\r\n");
      out.write("\r\n");
      out.write("			var drawLine = new kakao.maps.Polyline({\r\n");
      out.write("				map : map,\r\n");
      out.write("				path : linePath,\r\n");
      out.write("				strokeWeight: 3, // 선의 두께입니다 \r\n");
      out.write("            	strokeColor: '#db4040', // 선의 색깔입니다\r\n");
      out.write("            	strokeOpacity: 1, // 선의 불투명도입니다 0에서 1 사이값이며 0에 가까울수록 투명합니다\r\n");
      out.write("            	strokeStyle: 'solid' // 선의 스타일입니다\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("\r\n");
      out.write("			distance = Math.round(lineLine.getLength());\r\n");
      out.write("			totalDistance = totalDistance + distance; \r\n");
      out.write("			displayCircleDot(positions[i].latlng, distance);\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		function displayCircleDot(position, distance) {\r\n");
      out.write("			if (1000 > distance && distance > 0) {\r\n");
      out.write("				// 마커까지의 그려진 선의 총 거리를 표시할 커스텀 오버레이를 생성합니다\r\n");
      out.write("				var distanceOverlay = new kakao.maps.CustomOverlay(\r\n");
      out.write("					{\r\n");
      out.write("						content : '<div class=\"dotOverlay\">거리 <span class=\"number\">'\r\n");
      out.write("								+ distance + '</span>m</div>',\r\n");
      out.write("						position : position,\r\n");
      out.write("						yAnchor : 1,\r\n");
      out.write("						zIndex : 2\r\n");
      out.write("					});\r\n");
      out.write("\r\n");
      out.write("				// 지도에 표시합니다\r\n");
      out.write("				distanceOverlay.setMap(map);\r\n");
      out.write("			} else if (distance > 999) {\r\n");
      out.write("				distance = Math.round(distance / 100)/10;\r\n");
      out.write("				var distanceOverlay = new kakao.maps.CustomOverlay(\r\n");
      out.write("					{\r\n");
      out.write("						content : '<div class=\"dotOverlay\">거리 <span class=\"number\">'\r\n");
      out.write("								+ distance + '</span>km</div>',\r\n");
      out.write("						position : position,\r\n");
      out.write("						yAnchor : 1,\r\n");
      out.write("						zIndex : 2\r\n");
      out.write("					});\r\n");
      out.write("				// 지도에 표시합니다\r\n");
      out.write("				distanceOverlay.setMap(map);\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		totalDistance = Math.round(totalDistance / 100)/10;\r\n");
      out.write("		\r\n");
      out.write("		var result = totalDistance + \"km\";\r\n");
      out.write("		document.getElementById(\"i_result\").innerHTML=result;\r\n");
      out.write("	</script>   \r\n");
      out.write("    \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../includes/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
