/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-02 09:14:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recharge_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script src=\"js/jquery-2.1.0.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<script src=\"js/bmob-min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<title>regist</title>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT LANGUAGE=\"JAVASCRIPT\">\r\n");
      out.write("\r\n");
      out.write("function check(ctl){\r\n");
      out.write("  var contents = ctl.value ;\r\n");
      out.write(" \r\n");
      out.write("  if ((contents.indexOf(\" \")!=-1) || (contents.indexOf(\"0\")==0) || ((contents/contents)!=1) &&(contents != 0)){\r\n");
      out.write("   alert('对不起，您输入的价格的格式错误！'); \r\n");
      out.write("  \r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<style>\r\n");
      out.write("#logindiv {\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\theight: 350px;\r\n");
      out.write("\tbackground: rgba(255, 255, 255, 0.5);\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tmargin-top: 200px;\r\n");
      out.write("\t\tborder-radius: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login {\r\n");
      out.write("\tbackground: rgba(0, 0, 0, 0.5);\r\n");
      out.write("\twidth: 250px;\r\n");
      out.write("\theight: 60px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tline-height: 60px;\r\n");
      out.write("\tborder-top-left-radius: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#regist {\r\n");
      out.write("\twidth: 250px;\r\n");
      out.write("\theight: 60px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tline-height: 60px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image: url(img/2.jpg);\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"logindiv\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"login\">\r\n");
      out.write("\t\t\t<a ><h3 style=\"color: #000000\">充值中心</h3></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div id=\"regist\">\r\n");
      out.write("\t\t\t<h3 style=\"color: #FFFFFF\">注册</h3>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"padding: 100px 100px 10px;\">\r\n");
      out.write("\t\t\t<form class=\"bs-example bs-example-form\" role=\"form\" action=\"updatausers\" method=\"post\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"num\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"adress\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.adress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"money\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.money}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t<span class=\"input-group-addon\">余&nbsp&nbsp&nbsp額:</span> \r\n");
      out.write("\t\t\t\t\t<span style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.money}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&nbsp&nbspRMB</span> \r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t<span class=\"input-group-addon\">充值金額</span> <INPUT TYPE=TEXT SIZE=20 NAME=\"moneys\" onBlur=\"check(this)\"> <br><br>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<input style=\"width: 100px;\" type=\"button\" name=\"button1\" id=\"button1\" value=\"返回\" onclick=\"history.go(-1)\">\r\n");
      out.write("\t\t\t\t<button style=\"width: 100px;\" id=\"but\"  type=\"submit\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-success btn-lg\">充值</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t//验证内容是否合法\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t//验证昵称是否为空\r\n");
      out.write("\t\t\t\t\t\t$(\"#name\").blur(\r\n");
      out.write("\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif ($(\"#name\").val() != null\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&& $(\"#name\").val() != \"\") {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#info-name\").html(\"&nbsp\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#info-username\").html(\"请输入昵称\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t//验证手机号是否合法\r\n");
      out.write("\t\t\t\t\t\t$(\"#phone\")\r\n");
      out.write("\t\t\t\t\t\t\t\t.blur(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar username = $(\"#phone\").val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar pattern = /^((1[3,5,8][0-9])|(14[5,7])|(17[0,6,7,8])|(19[7]))\\d{8}$/;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif ((username.match(pattern))) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#info-username\").html(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"&nbsp\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"#info-username\").html(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"手机号不正确\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t//验证密码是否安全\r\n");
      out.write("\t\t\t\t\t\t$(\"#password\").blur(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t//验证密码是否和法\r\n");
      out.write("\t\t\t\t\t\t\tvar pass = $(\"#password\").val();\r\n");
      out.write("\t\t\t\t\t\t\tif(pass == null || pass == \"\") {\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#info-password\").html(\"请输入8位以上的密码\");\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\tif(pass.length >= 8 ) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#info-password\").html(\"&nbsp\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#info-password\").html(\"密码要求8位以上\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}