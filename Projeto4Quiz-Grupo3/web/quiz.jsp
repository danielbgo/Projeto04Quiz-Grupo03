<%-- 
    Document   : quiz
    Created on : 05/11/2018, 09:41:02
    Author     : rafae
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.fatecpg.webquiz.Bd"%>
<%@page import="br.com.fatecpg.webquiz.Question"%>
<%@page import="br.com.fatecpg.webquiz.Usuarios"%>
<!DOCTYPE html>
<html>
    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/header.jspf" %>
        <%@include file="WEB-INF/jspf/navbar.jspf" %>
        
        <title>Quiz</title>
    </head>
    <body style="background-image: url(Imagens/Quiz.jpg)">
        <br/><br/>
        <div class="jumbotron text-center">
        
            <center><h1>Quiz</h1></center>
            <%
            String usuario = (String)session.getAttribute("nome");
            for(Usuarios x: Bd.getUser()){
               
                if(usuario == x.getNome()){%>
                    <h1>Boa sorte <%=x.getNome()%></h1><%
                }
            }
            if (usuario ==null){
                response.sendRedirect("home.jsp");
            }
            if (request.getParameter("enviar") != null) {
                int soma = 0;
                Usuarios user = new Usuarios();
                for (Question q : Bd.getQuiz()) {
                    String userAnswer = request.getParameter(q.getQuestion());
                        if (userAnswer.equals(q.getAnswer())) {
                            soma++;
                        }                    
                }%>
         
        <hr><hr>
        <h1>
            Nota: <u><%= 100*((double)(soma)/3.0)%></u>
            
        </h1>
       <% } %>
       
       
       
       <form>
           <fieldset>
           <% for(Question q: Bd.getQuiz()){ %>
           <h3>
               Question: <%= q.getQuestion() %>
           </h3>
                <% for(int i=0; i<q.getAlternatives().length; i++){ %>
                <input type="radio" name="<%= q.getQuestion()%>" value="<%= q.getAlternatives()[i] %>">
                <%=q.getAlternatives()[i] %><% } %>
                <hr style="border-color: black">
                
           <% } %>
           </fieldset>
           <br>
             <input type="submit" name="enviar" value="Enviar"/>
             <a href="home.jsp" role="button">Voltar</a>
       </form>
           <br/>
        </div>
        </div>
           
 
    </body>
</html>
