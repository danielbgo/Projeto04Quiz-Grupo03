package br.com.fatecpg.webquiz;


public class Historicos implements Comparable <Historicos> {
    
 
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
    
   public int compareTo(Historicos nota){
       if(this.nota < nota.getNota()){
         return - 1;  
       }
       else if(this.nota > nota.getNota()){
        return 1;         
       }
       return 0;
   }
    
}
