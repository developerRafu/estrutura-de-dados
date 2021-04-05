/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrepacheco
 */
public class Pilha {
    static final int MAX = 10;
    int top;
    int a[] = new int[MAX];
    
    public Pilha(){
        top = -1;
    }
    
    public boolean isEmpty(){
     return (top < 0);    
    }
    
    public boolean push(int x){
        if(top >= (MAX-1)){
            System.out.println("Estouro de Pilha");
            return false;
        }else{
            a[++top] = x;
            return true;
        }
        
    }
    
    public int pop(){
        if(top < 0){
            System.out.println("Pilha vazia");
            return 0;
        }else{
            int x = a[top--];
            return x;
        }
    }
    
    public int peek(){
        if( top < 0){
            System.out.println("Pilha Vazia");
            return 0;
        }else{
            return a[top];
        }
    }
}
