/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.webquiz;

import java.util.ArrayList;

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
        return quiz;
    }
    
}
