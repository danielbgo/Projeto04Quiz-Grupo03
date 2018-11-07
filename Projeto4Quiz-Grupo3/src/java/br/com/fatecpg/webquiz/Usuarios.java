package br.com.fatecpg.webquiz;

import br.com.fatecpg.webquiz.Bd;
import br.com.fatecpg.webquiz.Question;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios implements Comparable <Usuarios> {
    
 
    private String nome;
    private double nota;

    public void setUser(String nome, double nota) {        
        this.setNome(nome);
        this.setNota(nota);
    }
       

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
   public int compareTo(Usuarios nota){
       if(this.nota < nota.getNota()){
         return - 1;  
       }
       else if(this.nota > nota.getNota()){
        return 1;         
       }
       return 0;
   }
    
}
