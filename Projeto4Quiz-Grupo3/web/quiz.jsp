<%-- 
    Document   : quiz
    Created on : 05/11/2018, 09:41:02
    Author     : rafae
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.fatecpg.webquiz.Bd"%>
<%@page import="br.com.fatecpg.webquiz.Question"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz</title>
    </head>
    <body>
        <h1>Quiz</h1>
        <% if(request.getParameter("enviar") != null){
        int soma = 0;
        for (Question q: Bd.getQuiz()){
            String userAnswer = request.getParameter(q.getQuestion());
            if (userAnswer.equals(q.getAnswer())){
                soma++;
            }
        }%>
        <hr><hr>
        <h1>
            Nota: <u><%= 100*((double)(soma)/3.0)%></u> 
        </h1>
       <% } %>
       <h2>Quiz</h2>
       <form>
           <% for(Question q: Bd.getQuiz()){ %>
           <h3>
               Question: <%= q.getQuestion() %>
           </h3>
                <% for(int i=0; i<q.getAlternatives().length; i++){ %>
                <input type="radio" name="<%= q.getQuestion()%>" value="<%= q.getAlternatives()[i] %>">
                <%=q.getAlternatives()[i] %><% } %>
                <hr>
                
           <% } %>     
             <input type="submit" name="enviar" value="Enviar"/>
             <a href="home.jsp" role="button">Voltar</a>
       </form>
    </body>
</html>
