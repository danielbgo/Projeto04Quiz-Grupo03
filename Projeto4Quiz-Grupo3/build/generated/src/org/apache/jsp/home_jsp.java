package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import br.com.fatecpg.webquiz.Historicos;
import br.com.fatecpg.webquiz.Usuarios;
import br.com.fatecpg.webquiz.Bd;
import br.com.fatecpg.webquiz.Question;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/navbar.jspf");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("\n");
      out.write("<!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" media=\"(max-width: 640px)\" href=\"max-640px.css\">\n");
      out.write("<link rel=\"stylesheet\" media=\"(min-width: 640px)\" href=\"min-640px.css\">\n");
      out.write("<link rel=\"stylesheet\" media=\"(orientation: portrait)\" href=\"portrait.css\">\n");
      out.write("<link rel=\"stylesheet\" media=\"(orientation: landscape)\" href=\"landscape.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/Style.css\">\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("   <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span> \n");
      out.write("      </button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"#\"</a></li>\n");
      out.write("        <li><a href=\"#\"></a></li> \n");
      out.write("        <li><a href=\"#\"></a></li> \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(Imagens/gramado.jpg); background-size: 500px\" >\n");
      out.write("        ");
if (request.getParameter("comecar") != null && request.getParameter("nome") != "") {
                boolean flag = false;
                session.setAttribute("nome", request.getParameter("nome"));
                for (Usuarios x : Bd.getName()) {

                    if (flag == false && request.getParameter("nome").equals(x.getNome())) {
                        flag = true;
        
      out.write(" \n");
      out.write("        ");
}
                }
                if (!flag) {
                    Usuarios x = new Usuarios();
                    x.setUser(request.getParameter("nome"));
                    Bd.getName().add(x);

                    response.sendRedirect("quiz.jsp");
                } else {
                    response.sendRedirect("quiz.jsp");
                   }
               }
      out.write("\n");
      out.write("\n");
      out.write("        <!--Corpo da Pagina-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("         <div class=\"jumbotron\">\n");
      out.write("                <center> <strong><h2>Olá, seja bem vindo ao nosso Quiz sobre Futebol!</h2></strong>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("        <div class=\"container\" style=\"background-color: white\">\n");
      out.write("            <br/><br/>\n");
      out.write("            <h1></h1>\n");
      out.write("            <h3>\n");
      out.write("               \n");
      out.write("                    <div class=\"row text-center slideanim\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                             <div class=\"thumbnail\">\n");
      out.write("                                <form><center>\n");
      out.write("                                            <h2>Entrar<br><br>\n");
      out.write("                                                Informe o seu Nome:</h2> \n");
      out.write("                                            <input type=\"text\"  placeholder=\"Nome\" name=\"nome\"><br><br>\n");
      out.write("                                            <input type=\"submit\" class=\"btn btn-primary btn-lg\" name=\"comecar\" value=\"Realizar teste\">\n");
      out.write("                                            <br/>\n");
      out.write("                                            <br/>\n");
      out.write("                                        </div>\n");
      out.write("                                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"col-sm-6 text-center\">\n");
      out.write("                            <div class=\"thumbnail\">\n");
      out.write("                                        <h1>Top 10</h1> \n");
      out.write("                                        \n");
      out.write("                                        <center><table id=\"customers\">\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th>Rank </th>  \n");
      out.write("                                                    <th>Nome </th>      \n");
      out.write("                                                    <th>Nota </th>   \n");
      out.write("                                                </tr>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    ");
 
                                                      int cont = 0;
                                                      for(Historicos h : Bd.getUser()){
                                                    
      out.write("  \n");
      out.write("                                                    <td>");
      out.print(++cont);
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(h.getNome());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print( NumberFormat.getIntegerInstance().format(h.getNota()));
      out.write("</td></tr>\n");
      out.write("                                                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("                                            </table>   \n");
      out.write("                                        </center>\n");
      out.write("                                        </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                    </center>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("  \n");
      out.write("                            </h3>\n");
      out.write("\n");
      out.write("                        </div> \n");
      out.write("                        <br/>\n");
      out.write("                        <br/>\n");
      out.write("                        </body>\n");
      out.write("                        </html>\n");
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
