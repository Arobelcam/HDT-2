package com;

import java.util.Vector;

public class Pila implements Stack<Double>, Calculator{
    Vector <Double> vector; //Se crea el vector que almacena datos del tipo double
    
    public Pila(){vector = new Vector<Double>();}

    @Override
    public double calculate(String operation) {
        return 0;
    }

    @Override
    public void add(Double item) {
        vector.add(item);
        
    }

    @Override
    public Double remove() {
         return vector.remove(size() - 1);
    }

    @Override
    public Double peek() {
        return vector.get(size());
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return  vector.size();
    }
    
}
