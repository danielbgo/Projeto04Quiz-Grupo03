package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import br.com.fatecpg.webquiz.Historicos;
import br.com.fatecpg.webquiz.Bd;
import br.com.fatecpg.webquiz.Question;
import br.com.fatecpg.webquiz.Usuarios;

public final class quiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("        \n");
      out.write("        <title>Quiz</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(Imagens/Quiz.jpg)\">\n");
      out.write("        <br/><br/>\n");
      out.write("        <div class=\"jumbotron text-center\">\n");
      out.write("        \n");
      out.write("            <center><h1>Quiz</h1></center>\n");
      out.write("            ");

            String usuario = (String)session.getAttribute("nome");
            for(Usuarios x: Bd.getName()){
               
                if(usuario == x.getNome()){
      out.write("\n");
      out.write("                    <h1>Boa sorte ");
      out.print(x.getNome());
      out.write("</h1>");

                }
            }
            if (usuario ==null){
                response.sendRedirect("home.jsp");
            }
            if (request.getParameter("enviar") != null) {
                double soma = 0;
                double nota = 0;
                for (Question q : Bd.getQuiz()) {
                    String userAnswer = request.getParameter(q.getQuestion());
                        if (userAnswer.equals(q.getAnswer())) {
                            soma++;
                        }
                  nota = (soma/10.0)*10;
                  
                }Historicos h = new Historicos();
                
                        h.setUser(usuario,nota);
                        
                        Bd.getUser().add(h);
                    
      out.write("\n");
      out.write("         \n");
      out.write("        <hr><hr>\n");
      out.write("        <h1>\n");
      out.write("            Nota: <u>");
      out.print(NumberFormat.getIntegerInstance().format(nota));
      out.write("</u>\n");
      out.write("            \n");
      out.write("        </h1>\n");
      out.write("       ");
 } 
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       <form>\n");
      out.write("           <fieldset>\n");
      out.write("           ");
 for(Question q: Bd.getQuiz()){ 
      out.write("\n");
      out.write("           <h3>\n");
      out.write("               Question: ");
      out.print( q.getQuestion() );
      out.write("\n");
      out.write("           </h3>\n");
      out.write("                ");
 for(int i=0; i<q.getAlternatives().length; i++){ 
      out.write("\n");
      out.write("                <input type=\"radio\" name=\"");
      out.print( q.getQuestion());
      out.write("\" value=\"");
      out.print( q.getAlternatives()[i] );
      out.write("\" required>\n");
      out.write("                ");
      out.print(q.getAlternatives()[i] );
 } 
      out.write("\n");
      out.write("                <hr style=\"border-color: black\">\n");
      out.write("                \n");
      out.write("           ");
 } 
      out.write("\n");
      out.write("           </fieldset>\n");
      out.write("           <br>\n");
      out.write("           <input type=\"submit\" class=\"btn btn-primary btn-lg\" name=\"enviar\" value=\"Enviar\"/>\n");
      out.write("             <a href=\"home.jsp\" role=\"button\">Voltar</a>\n");
      out.write("       </form>\n");
      out.write("           <br/>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write(" \n");
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
