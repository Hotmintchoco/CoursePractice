/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.53
 * Generated at: 2022-08-07 09:11:25 UTC
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

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/java/CoursePractice/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/tripProject_now/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1655605365268L));
    _jspx_dependants.put("jar:file:/C:/java/CoursePractice/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/tripProject_now/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>코스추천</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://kit.fontawesome.com/c34800a0df.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=6f7f2591af5145e97bd2969fcf925e6f\"></script>\n");
      out.write("<style>\n");
      out.write("    @font-face {\n");
      out.write("    font-family: 'yg-jalnan';\n");
      out.write("    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_four@1.2/JalnanOTF00.woff') format('woff');\n");
      out.write("    font-weight: normal;\n");
      out.write("    font-style: normal;\n");
      out.write("}\n");
      out.write("      \n");
      out.write("   * {font-family: 'yg-jalnan', cursive }\n");
      out.write("\n");
      out.write("  .gd-container {\n");
      out.write("  max-width: 1100px;\n");
      out.write("  position: relative;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  padding-left: 15px;\n");
      out.write("  padding-right: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(" ul > li > a {color: #212121;}\n");
      out.write(" #slider {width: 1000px; height: 1000px; margin: 0 auto;}\n");
      out.write("\n");
      out.write(".dotOverlay {color:#747474; position:relative;bottom:-30px;border-radius:6px;border: 1px solid #ccc;border-bottom:2px solid #ddd;float:left;font-size:12px;padding:5px;background:#fff;}\n");
      out.write(".dotOverlay:nth-of-type(n) {border:0; box-shadow:0px 1px 2px #888;}\n");
      out.write(".customoverlay {position:relative;bottom:55px;border-radius:6px;border: 1px solid #ccc;border-bottom:2px solid #ddd;float:left;}\n");
      out.write(".customoverlay:nth-of-type(n) {border:0; box-shadow:0px 1px 2px #888;}\n");
      out.write(".customoverlay a {display:block;text-decoration:none;color:#000;text-align:center;border-radius:6px;font-size:14px;font-weight:bold;overflow:hidden;background: #d95050;background: #d95050 url(https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/arrow_white.png) no-repeat right 14px center;}\n");
      out.write(".customoverlay .title {display:block;text-align:center;background:#fff;margin-right:35px;padding:10px 15px;font-size:14px;font-weight:bold;}\n");
      out.write(".customoverlay:after {content:'';position:absolute;margin-left:-12px;left:50%;bottom:-12px;width:22px;height:12px;background:url('https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/vertex_white.png')}\n");
      out.write("\n");
      out.write("#courseTitle h1 {text-align: center;}\n");
      out.write("#courseTitle p {text-align: center;}\n");
      out.write("\n");
      out.write("#desListView {background-color: gray; height: 750px; margin: 30px 0 30px 0;}\n");
      out.write("\n");
      out.write(".btn_good .ico {\n");
      out.write("    background: url(https://cdn.visitkorea.or.kr/resources/images/sub/ico_mpost01_on.png);\n");
      out.write("    width: 42px; height: 36px;\n");
      out.write("    display: inline-block;\n");
      out.write("    test-indent: -9999px;\n");
      out.write("    }\n");
      out.write(".btn_good { width: 75px; height: 55px; border: none; background-color: #FFFFFF; }\n");
      out.write("</style>\n");
      out.write("     \n");
      out.write("</head>\n");
      out.write("<body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../includes/header.jsp", out, false);
      out.write("\n");
      out.write("<a style=\"display:scroll;position:fixed;bottom:20px;z-index: 999;right:60px;font-size: 40px;\" href=\"#\" title=\"âtop\">\n");
      out.write("<i class=\"fa-solid fa-circle-arrow-up\"></i></a>\n");
      out.write("	\n");
      out.write("<!-- header card -->\n");
      out.write("	\n");
      out.write("	<div class=\"card\">\n");
      out.write("	   \n");
      out.write("	</div>\n");
      out.write("	<br><br>\n");
      out.write("	<div id=\"slider\">\n");
      out.write("	         <!-- title, city 입력 -->\n");
      out.write("	     <div id=\"courseTitle\">\n");
      out.write("	     	<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${course.courseTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("	     	<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${course.courseCity}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("	     	<button type=\"button\" class=\"btn_good\">\n");
      out.write("	     		<span class=\"ico\"></span>\n");
      out.write("	     		<span class=\"numLike\" id=\"numLike\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${course.courseLike}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("	     	</button>\n");
      out.write("	     	<hr>\n");
      out.write("	     </div>\n");
      out.write("	     \n");
      out.write("	        \n");
      out.write("	     <div id=\"map\" style=\"width:900px;height:500px; margin: 0 auto;\"></div>\n");
      out.write("	     <p>총 거리</p><span id=\"i_result\"></span>\n");
      out.write("	     <input id=\"num\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${course.courseNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("	     <input id=\"resultMapX\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resultMapX}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("	     <input id=\"resultMapY\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resultMapY}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("	<hr>\n");
      out.write("		<div id=\"desListView\">\n");
      out.write("		\n");
      out.write("		</div>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../includes/footer.jsp", out, false);
      out.write("\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	<script>\n");
      out.write("	\n");
      out.write("	var num = document.getElementById('num').value;\n");
      out.write("	var resultMapX = document.getElementById('resultMapX').value;\n");
      out.write("	var resultMapY = document.getElementById('resultMapY').value;\n");
      out.write("	\n");
      out.write("	var courseService = (function() {\n");
      out.write("		\n");
      out.write("		function desList(num, callback, error){\n");
      out.write("			console.log(\"get...................\");\n");
      out.write("	        $.getJSON(\"/course/page/\" + num + \".json\",\n");
      out.write("	            function(data){\n");
      out.write("	                if(callback) {\n");
      out.write("	                    callback(data);\n");
      out.write("	                }\n");
      out.write("	            }).fail(function(xhr, status, err){\n");
      out.write("	                if(error) {\n");
      out.write("	                    error(err);\n");
      out.write("	                }\n");
      out.write("	            });\n");
      out.write("	    } //end for desList\n");
      out.write("	    return {\n");
      out.write("	        desList : desList\n");
      out.write("	    }; // 함수를 객체로 만들어서 리턴\n");
      out.write("	})();\n");
      out.write("	\n");
      out.write("	var courseList = new Array();\n");
      out.write("	var totalMapX;\n");
      out.write("	var totalMapY;\n");
      out.write("	courseService.desList(num, function (list) {\n");
      out.write("		for(var i=0, len = list.length || 0; i<len; i++){\n");
      out.write("			console.log(list[i]);\n");
      out.write("		}\n");
      out.write("		courseList = list;\n");
      out.write("		console.log(courseList);\n");
      out.write("	\n");
      out.write("		\n");
      out.write("		var mapContainer = document.getElementById('map'), // 지도를 표시할 div  \n");
      out.write("	    mapOption = { \n");
      out.write("	        center: new kakao.maps.LatLng(resultMapY, resultMapX), // 지도의 중심좌표\n");
      out.write("	        level: 4 // 지도의 확대 레벨\n");
      out.write("	    };\n");
      out.write("\n");
      out.write("		var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다\n");
      out.write("		var distanceOverlay;\n");
      out.write("		var dots = {};\n");
      out.write("	    \n");
      out.write("		for (var i=0; i<courseList.length; i++) {\n");
      out.write("			var latlng = new kakao.maps.LatLng(courseList[i].mapY, courseList[i].mapX)\n");
      out.write("			var imageSrc = \"/resources/img/marker/marker-icon\" + (i+1) +\".png\"; \n");
      out.write("		    \n");
      out.write("		    // 마커 이미지의 이미지 크기 입니다\n");
      out.write("		    var imageSize = new kakao.maps.Size(40, 45); \n");
      out.write("		    \n");
      out.write("		    // 마커 이미지를 생성합니다    \n");
      out.write("		    var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize); \n");
      out.write("		    \n");
      out.write("		    // 마커를 생성합니다\n");
      out.write("		    var marker = new kakao.maps.Marker({\n");
      out.write("		        map: map, // 마커를 표시할 지도\n");
      out.write("		        position: latlng, // 마커를 표시할 위치\n");
      out.write("		        title : courseList[i].title, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다\n");
      out.write("		        image : markerImage // 마커 이미지 \n");
      out.write("		    });\n");
      out.write("		    \n");
      out.write("		 // 커스텀 오버레이에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다\n");
      out.write("		    var content = '<div class=\"customoverlay\">' +\n");
      out.write("		        '  <a href=\"/destination/get.do?num='+courseList[i].num+'\">' +\n");
      out.write("		        '    <span class=\"title\">'+ courseList[i].title +'</span>' +\n");
      out.write("		        '  </a>' +\n");
      out.write("		        '</div>';\n");
      out.write("		    \n");
      out.write("		    var customOverlay = new kakao.maps.CustomOverlay({\n");
      out.write("		        map: map,\n");
      out.write("		        position: latlng,\n");
      out.write("		        content: content,\n");
      out.write("		        yAnchor: 1 \n");
      out.write("		    });\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		var linePath;\n");
      out.write("		var lineLine = new kakao.maps.Polyline();\n");
      out.write("		var distance;\n");
      out.write("		var totalDistance = 0;\n");
      out.write("\n");
      out.write("		for (var i = 0; i < courseList.length; i++) {\n");
      out.write("			if (i != 0) {\n");
      out.write("				linePath = [ new kakao.maps.LatLng(courseList[i-1].mapY, courseList[i-1].mapX),\n");
      out.write("							 new kakao.maps.LatLng(courseList[i].mapY, courseList[i].mapX) ]\n");
      out.write("			}\n");
      out.write("			;\n");
      out.write("			lineLine.setPath(linePath);\n");
      out.write("\n");
      out.write("			var drawLine = new kakao.maps.Polyline({\n");
      out.write("				map : map,\n");
      out.write("				path : linePath,\n");
      out.write("				strokeWeight: 3, // 선의 두께입니다 \n");
      out.write("            	strokeColor: '#db4040', // 선의 색깔입니다\n");
      out.write("            	strokeOpacity: 1, // 선의 불투명도입니다 0에서 1 사이값이며 0에 가까울수록 투명합니다\n");
      out.write("            	strokeStyle: 'solid' // 선의 스타일입니다\n");
      out.write("			});\n");
      out.write("			\n");
      out.write("\n");
      out.write("			distance = Math.round(lineLine.getLength());\n");
      out.write("			totalDistance = totalDistance + distance; \n");
      out.write("			displayCircleDot(new kakao.maps.LatLng(courseList[i].mapY, courseList[i].mapX), distance);\n");
      out.write("		}\n");
      out.write("		if(7500< totalDistance && totalDistance < 12500) {\n");
      out.write("		 	map.setLevel(5);\n");
      out.write("		} else if(12500<= totalDistance && totalDistance < 20000){\n");
      out.write("			map.setLevel(6);\n");
      out.write("		} else if(20000<= totalDistance && totalDistance < 30000){\n");
      out.write("			map.setLevel(7);\n");
      out.write("		} else if(30000<= totalDistance && totalDistance < 40000){\n");
      out.write("			map.setLevel(8);\n");
      out.write("		} else if(40000<= totalDistance && totalDistance < 80000){\n");
      out.write("			map.setLevel(9);\n");
      out.write("		} else if(80000<= totalDistance){\n");
      out.write("			map.setLevel(10);\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("	    \n");
      out.write("		function displayCircleDot(position, distance) {\n");
      out.write("			if (1000 > distance && distance > 0) {\n");
      out.write("				// 마커까지의 그려진 선의 총 거리를 표시할 커스텀 오버레이를 생성합니다\n");
      out.write("				var distanceOverlay = new kakao.maps.CustomOverlay(\n");
      out.write("					{\n");
      out.write("						content : '<div class=\"dotOverlay\">거리 <span class=\"number\">'\n");
      out.write("								+ distance + '</span>m</div>',\n");
      out.write("						position : position,\n");
      out.write("						yAnchor : 1,\n");
      out.write("						zIndex : 2\n");
      out.write("					});\n");
      out.write("\n");
      out.write("				// 지도에 표시합니다\n");
      out.write("				distanceOverlay.setMap(map);\n");
      out.write("			} else if (distance > 999) {\n");
      out.write("				distance = Math.round(distance / 100)/10;\n");
      out.write("				var distanceOverlay = new kakao.maps.CustomOverlay(\n");
      out.write("					{\n");
      out.write("						content : '<div class=\"dotOverlay\">거리 <span class=\"number\">'\n");
      out.write("								+ distance + '</span>km</div>',\n");
      out.write("						position : position,\n");
      out.write("						yAnchor : 1,\n");
      out.write("						zIndex : 2\n");
      out.write("					});\n");
      out.write("				// 지도에 표시합니다\n");
      out.write("				distanceOverlay.setMap(map);\n");
      out.write("			}\n");
      out.write("		}\n");
      out.write("		totalDistance = Math.round(totalDistance / 100)/10;\n");
      out.write("		\n");
      out.write("		var result = totalDistance + \"km\";\n");
      out.write("		document.getElementById(\"i_result\").innerHTML=result;\n");
      out.write("	})\n");
      out.write("	</script>   \n");
      out.write("    \n");
      out.write("</body>\n");
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
