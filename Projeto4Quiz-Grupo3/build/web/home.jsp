
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
        <%if(request.getParameter("comecar")!=null && request.getParameter("nome")!=""){
            boolean flag = false;     
            session.setAttribute("nome", request.getParameter("nome"));
           for(Usuarios x : Bd.getName()){

           if(flag == false && request.getParameter("nome").equals(x.getNome())){
           flag = true;      
           %> 
           <%}}
           if(!flag){
           Usuarios x = new Usuarios();
           x.setUser(request.getParameter("nome"));
           Bd.getName().add(x);

           response.sendRedirect("quiz.jsp");    
            }
           else{
           response.sendRedirect("quiz.jsp");
           }}%>
<div class="jumbotron text-center">
  <h1></h1>
           <h3>
            <center><h1>Pagina Inicial</h1></center><br/>
                <form><center><div class="entrar">
                    <h2>Entrar<br><br>
                    Informe o seu Nome:</h2> 
                    <input type="text"  placeholder="Nome" name="nome"><br><br>
                    <input type="submit" name="comecar" value="Realizar teste">
                    <h1>Top 10</h1> 
                        <div class="telas">
                        <table id="customers">
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
                         <td><%=h.getNota()%></td></tr>
                         <%}%>

                       </table>   
                       </div>
                        </div>
            </center>
                   </form>
            </h3>
  
</div>  
    </body>
</html>
