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
        quiz.add(new Question ("5+5?", "10", new String[]{"10","30","15"}));
        quiz.add(new Question ("2*1?", "2", new String[]{"1","2","3"}));
        quiz.add(new Question ("5*4?", "20", new String[]{"40","25","20"}));
        Collections.shuffle(quiz);
        return quiz;
    }
    private static final ArrayList<Historicos> hist = new ArrayList<>();         
    public static ArrayList<Historicos> getUser(){
        
       if (hist.isEmpty()){
        Historicos p1 = new Historicos();
        p1.setUser("teste",7.0);
        hist.add(p1);
        
        
        Historicos p2 = new Historicos();
        p2.setUser("teste",7.5);
        hist.add(p2);
        
        Historicos p3 = new Historicos();
        p3.setUser("teste",8.0);
        hist.add(p3);
        
        Historicos p4 = new Historicos();
        p4.setUser("teste",8.5);
        hist.add(p4);
        
        
        Historicos p5 = new Historicos();
        p5.setUser("teste",6.0);
        hist.add(p5);
        
       Historicos p6 = new Historicos();
        p6.setUser("teste",7.0);
        hist.add(p6);
        
       Historicos p7 = new Historicos();
        p7.setUser("teste",8.0);
        hist.add(p7);
        
        Historicos p8 = new Historicos();
        p8.setUser("teste",4.0);
        hist.add(p8);
        
        Historicos p9 = new Historicos();
        p9.setUser("teste",5.0);
       hist.add(p9);        
       }
      Collections.sort(hist, Collections.reverseOrder());
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
