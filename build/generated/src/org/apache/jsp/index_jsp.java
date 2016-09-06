package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login System</title>\n");
      out.write("        <script>\n");
      out.write("            function ValidateUsername(){\n");
      out.write("                var text=document.getElementById(\"username\").value();\n");
      out.write("                if(text==\"\"){\n");
      out.write("                    document.getElementById(\"errorusername\").innerHTML=\"Provide Correct Userdetail\";\n");
      out.write("                    document.getElementById(\"errorusername\").style.color=\"red\";\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"errorusername\").innerHTML=\"Ok\";\n");
      out.write("                    document.getElementById(\"errorusername\").style.color=\"green\";\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            function ValidateUserpassword(){\n");
      out.write("                var text=document.getElementById(\"password\").value();\n");
      out.write("                if(text==\"\"){\n");
      out.write("                    document.getElementById(\"password\").innerHTML=\"Provide Correct Userdetail\";\n");
      out.write("                    document.getElementById(\"password\").style.color=\"red\";\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"password\").innerHTML=\"Ok\";\n");
      out.write("                    document.getElementById(\"password\").style.color=\"green\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <form action=\"ValidateLogin\" name=\"AdminLogin\" method=\"get\">\n");
      out.write("           <table>\n");
      out.write("            <tr>\n");
      out.write("            <td>Username:</td>\n");
      out.write("            <td><input type=\"text\" id=\"username\" onblur=\"ValidateUsername\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Password:</td>\n");
      out.write("                <td><input type=\"password\" id=\"password\" onblur=\"ValidatePassword\"></td>\n");
      out.write("            </tr> \n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" value=\"submit\"></td>\n");
      out.write("            </tr>\n");
      out.write("           </table>\n");
      out.write("            </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
