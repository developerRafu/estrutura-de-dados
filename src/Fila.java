/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author andrepacheco
 */
public class Fila {
    int valores[];
    int primeiro;
    int ultimo;
    int total;
    
    public Fila(){
        valores = new int[5];
        primeiro = 0;
        ultimo = 0;
        total = 0;
    }
    
    public boolean vazio(){
        return total == 0 ;
    }
    
    public boolean cheio(){
        return total == valores.length; 
    }
    
    public void inserir(int item){
        if(cheio()){
            throw new RuntimeException("Fila Cheia!!!");
        }
        valores[ultimo] = item;  
        ultimo = (ultimo + 1) % valores.length;
        total++;
    }
    
    public int remover(){
        if(vazio()){
            throw new RuntimeException("Fila Vazia!!");
        }
        int item = valores[primeiro];
        primeiro = (primeiro + 1) % valores.length;
        total--;
        return item;
    }    
}
