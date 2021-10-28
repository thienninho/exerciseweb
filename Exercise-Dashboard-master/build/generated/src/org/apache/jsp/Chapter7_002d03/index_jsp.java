package org.apache.jsp.Chapter7_002d03;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Murach's Java Servlets and JSP</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Chapter7-03/styles/main.css\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h1>CD list</h1>\r\n");
      out.write("<table>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th>Description</th>\r\n");
      out.write("        <th class=\"right\">Price</th>\r\n");
      out.write("        <th>&nbsp;</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>86 (the band) - True Life Songs and Pictures</td>\r\n");
      out.write("        <td class=\"right\">$14.95</td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <form action=\"cart\" method=\"post\">\r\n");
      out.write("                <input type=\"hidden\" name=\"productCode\" value=\"8601\">\r\n");
      out.write("                <input type=\"submit\" value=\"Add To Cart\">\r\n");
      out.write("            </form><!--<a href=\"cart?productCode=8601\">Add To Cart</a>--></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>Paddlefoot - The first CD</td>\r\n");
      out.write("        <td class=\"right\">$12.95</td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <form action=\"cart\" method=\"post\">\r\n");
      out.write("                <input type=\"hidden\" name=\"productCode\" value=\"pf01\">\r\n");
      out.write("                <input type=\"submit\" value=\"Add To Cart\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>Paddlefoot - The second CD</td>\r\n");
      out.write("        <td class=\"right\">$14.95</td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <form action=\"cart\" method=\"post\">\r\n");
      out.write("                <input type=\"hidden\" name=\"productCode\" value=\"pf02\">\r\n");
      out.write("                <input type=\"submit\" value=\"Add To Cart\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>Joe Rut - Genuine Wood Grained Finish</td>\r\n");
      out.write("        <td class=\"right\">$14.95</td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <form action=\"cart\" method=\"post\">\r\n");
      out.write("                <input type=\"hidden\" name=\"productCode\" value=\"jr01\">\r\n");
      out.write("                <input type=\"submit\" value=\"Add To Cart\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
