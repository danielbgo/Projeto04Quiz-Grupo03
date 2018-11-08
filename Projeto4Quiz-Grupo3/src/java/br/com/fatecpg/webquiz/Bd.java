/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.webquiz;

import java.util.ArrayList;
import java.util.Collections;

/**
 *teste
 * @author Daniel Lucas
 */
public class Bd {
    public static ArrayList<Question> getQuiz(){
        ArrayList<Question> quiz = new ArrayList<>();
        quiz.add(new Question ("Quantas vezes o Palmeiras venceu o Mundial de Clubes FIFA?", "0", new String[]{"3","1","0"}));
        quiz.add(new Question ("Quem foi o campeão da Copa do Mundo de 2014?", "Alemanha", new String[]{"Alemanha","Brasil","Russia"}));
        quiz.add(new Question ("Qual desses jogadores marcou mais de Mil gols em sua carreira?", "Pelé", new String[]{"Pelé","Neymar","Messi"}));
        quiz.add(new Question ("Qual foi o placar do jogo entre Brasil e Alemanha na Copa do Mundo de 2014?", "7x1", new String[]{"0x0","7x1","1x3"}));
        quiz.add(new Question ("Quantas Copas do Mundo o Brasil venceu?", "5", new String[]{"3","7","5"}));
        quiz.add(new Question ("Quantos titulos de Melhor do Mundo a jogadora de futebol feminino Marta possui?", "6", new String[]{"6","2","3"}));
        quiz.add(new Question ("Qual foi o país sede da Copa do Mundo de 2018?", "Russia", new String[]{"Alemanha","Japão","Russia"}));
        quiz.add(new Question ("Um jogador é expulso de campo ao receber quantos cartões amarelos?", "2", new String[]{"5","1","2"}));
        quiz.add(new Question ("Em uma partida de futebol cada time possui quantos jogadores em campo?", "11", new String[]{"9","15","11"}));
        quiz.add(new Question ("Que time brasileiro possui mais Mundiais de Clubes FIFA?", "São Paulo", new String[]{"Palmeiras","Bragantino","São Paulo"}));
        
        Collections.shuffle(quiz);
        return quiz;
    }
    private static final ArrayList<Historicos> hist = new ArrayList<>();         
    public static ArrayList<Historicos> getUser(){
        
       if (hist.isEmpty()){
        Historicos p1 = new Historicos();
        p1.setUser("teste1",7.0);
        hist.add(p1);
        
        
        Historicos p2 = new Historicos();
        p2.setUser("teste2",7.5);
        hist.add(p2);
        
        Historicos p3 = new Historicos();
        p3.setUser("teste3",8.0);
        hist.add(p3);
        
        Historicos p4 = new Historicos();
        p4.setUser("teste4",8.5);
        hist.add(p4);
        
        
        Historicos p5 = new Historicos();
        p5.setUser("teste5",6.0);
        hist.add(p5);
        
       Historicos p6 = new Historicos();
        p6.setUser("teste6",7.0);
        hist.add(p6);
        
       Historicos p7 = new Historicos();
        p7.setUser("teste7",8.0);
        hist.add(p7);
        
        Historicos p8 = new Historicos();
        p8.setUser("teste8",4.0);
        hist.add(p8);
        
        Historicos p9 = new Historicos();
        p9.setUser("teste9",5.0);
       hist.add(p9);        
       }
       while (hist.size() >= 11) {
            hist.remove(0);
            
        //Collections.sort(user, Collections.reverseOrder());
        }
        
      //Collections.sort(hist, Collections.reverseOrder());
       return hist;
       }
    private static final ArrayList<Usuarios> user = new ArrayList<>();         
    public static ArrayList<Usuarios> getName(){
        if (user.isEmpty()){
        Usuarios p1 = new Usuarios();
        p1.setUser("teste");
        user.add(p1);
        }
        return user;
    }
}
