package com.rui.estruturadedados.pilha;

public class Pilha{

    int elementos[];
    int topo;

    public Pilha(){
        elementos = new int[10];
        topo = -1;
    }

    public void push (int e){
        if (isFull()){
            throw new RuntimeException("Pilha está cheia");
        }
        topo++;
        elementos[topo] = e;
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Pilha está vazia");
        }
        int e;
        e = elementos[topo];
        topo--;
        return e;
    }

    public boolean isFull(){
        return (topo == elementos.length - 1);
    }

    public boolean isEmpty(){
        return (topo == -1);
    }

    public int top(){
        if (isEmpty()){
            throw new RuntimeException("Pilha está vazia");
        }
        return elementos[topo];
    }
}
