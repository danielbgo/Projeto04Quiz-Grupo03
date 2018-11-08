<%-- 
    Document   : quiz
    Created on : 05/11/2018, 09:41:02
    Author     : rafae
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="br.com.fatecpg.webquiz.Historicos"%>
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
    <body style="background-image: url(Imagens/gramado.jpg); background-size: 500px">
        <br/><br/>
         <div class="container">
         <div class="jumbotron">
             <center> <strong><h1>Quiz</h1></strong>
                </div>
                </div>
        <div class="container" style="background-color: white">
            
            <div class="row text-center slideanim">
           

          
                <%
                    String usuario = (String) session.getAttribute("nome");
                    for (Usuarios x : Bd.getName()) {

                    if (usuario == x.getNome()) {%>
                    <br/><br><h1>Boa sorte <%=x.getNome()%></h1><br/><br/><%
                    }
                }
                if (usuario == null) {
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
                        nota = (soma / 10.0) * 10;

                    }
                    Historicos h = new Historicos();

                    h.setUser(usuario, nota);

                    Bd.getUser().add(h);
            %>

            <hr><hr>
            <center><div class="thumbnail" style="width: 500px; border-color: red">
            <h1>
                Nota do ultimo teste: <u><%=NumberFormat.getIntegerInstance().format(nota)%></u>

            </h1>
            <% } %>
            </center>
            </div>


            <form><center>
                <div class="thumbnail" style="width: 500px; border-color: black">
                <fieldset>
                    <% for (Question q : Bd.getQuiz()) {%>
                    <h3>
                        Question: <%= q.getQuestion()%>
                    </h3>
                    <% for (int i = 0; i < q.getAlternatives().length; i++) {%>
                    <input type="radio" name="<%= q.getQuestion()%>" value="<%= q.getAlternatives()[i]%>" required>
                    <%=q.getAlternatives()[i]%><% } %>
                    <hr style="border-color: black">

                    <% }%>
                </fieldset>
                <br>
                <input type="submit" class="btn btn-primary btn-lg" name="enviar" value="Enviar"/>
                <br/>
                <br/>
                </form>
                    </center>
            </div>
            </div>
            </div>
            <br/>
        </div>
    </div>


</body>
</html>
