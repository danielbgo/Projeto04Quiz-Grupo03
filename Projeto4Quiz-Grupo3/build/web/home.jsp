
<%@page import="java.text.NumberFormat"%>
<%@page import="br.com.fatecpg.webquiz.Historicos"%>
<%@page import="br.com.fatecpg.webquiz.Usuarios"%>
<%@page import="br.com.fatecpg.webquiz.Bd"%>
<%@page import="br.com.fatecpg.webquiz.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="WEB-INF/jspf/header.jspf" %>
        <%@include file="WEB-INF/jspf/navbar.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-image: url(Imagens/Quiz.jpg)">
        <%if (request.getParameter("comecar") != null && request.getParameter("nome") != "") {
                boolean flag = false;
                session.setAttribute("nome", request.getParameter("nome"));
                for (Usuarios x : Bd.getName()) {

                    if (flag == false && request.getParameter("nome").equals(x.getNome())) {
                        flag = true;
        %> 
        <%}
                }
                if (!flag) {
                    Usuarios x = new Usuarios();
                    x.setUser(request.getParameter("nome"));
                    Bd.getName().add(x);

                    response.sendRedirect("quiz.jsp");
                } else {
                    response.sendRedirect("quiz.jsp");
                   }
               }%>

        <!--Corpo da Pagina-->
        <div class="container" style="background-color: white">
            <h1></h1>
            <h3>
                <center> <strong><h1>Olá, seja bem vindo ao nosso Quiz!</h1></strong>

                    <div class="row text-center slideanim">
                        <div class="col-sm-6">
                             <div class="thumbnail">
                                <form><center>
                                            <h2>Entrar<br><br>
                                                Informe o seu Nome:</h2> 
                                            <input type="text"  placeholder="Nome" name="nome"><br><br>
                                            <input type="submit" class="btn btn-primary btn-lg" name="comecar" value="Realizar teste">
                                            <br/>
                                            <br/>
                                        </div>
                                        </div>
                        
                        
                        <div class="col-sm-6 text-center">
                            <div class="thumbnail">
                                        <h1>Top 10</h1> 
                                        
                                        <center><table id="customers">
                                                <tr>
                                                    <th>Rank </th>  
                                                    <th>Nome </th>      
                                                    <th>Nota </th>   
                                                </tr>
                                                <tr>
                                                    <% 
                                                      int cont = 0;
                                                      for(Historicos h : Bd.getUser()){
                                                    %>  
                                                    <td><%=++cont%></td>
                                                    <td><%=h.getNome()%></td>
                                                    <td><%= NumberFormat.getIntegerInstance().format(h.getNota())%></td></tr>
                                                    <%}%>

                                            </table>   
                                        </center>
                                        </div>
                                        </div>
                                        </div>
                                        
                                    </center>
                                </form>

                            </div>
  
                            </h3>

                        </div> 
                        <br/>
                        <br/>
                        </body>
                        </html>
