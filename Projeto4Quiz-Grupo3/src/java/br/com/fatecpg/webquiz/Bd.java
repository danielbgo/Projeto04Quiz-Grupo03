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
    private static final ArrayList<Usuarios> user = new ArrayList<>();         
    public static ArrayList<Usuarios> getUser(){
        
       if (user.isEmpty()){
        Usuarios p1 = new Usuarios();
        p1.setUser("teste",7.0);
        user.add(p1);
        
        Usuarios p2 = new Usuarios();
        p2.setUser("teste",7.5);
        user.add(p2);
        
        Usuarios p3 = new Usuarios();
        p3.setUser("teste",8.0);
        user.add(p3);
        
        Usuarios p4 = new Usuarios();
        p4.setUser("teste",8.5);
        user.add(p4);
        
        
        Usuarios p5 = new Usuarios();
        p5.setUser("teste",6.0);
        user.add(p5);
        
       Usuarios p6 = new Usuarios();
        p6.setUser("teste",7.0);
        user.add(p6);
        
       Usuarios p7 = new Usuarios();
        p7.setUser("teste",8.0);
        user.add(p7);
        
        Usuarios p8 = new Usuarios();
        p8.setUser("teste",4.0);
        user.add(p8);
        
        Usuarios p9 = new Usuarios();
        p9.setUser("teste",5.0);
       user.add(p9);        
       }
      Collections.sort(user, Collections.reverseOrder());
       return user;
       }
    
}
