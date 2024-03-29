package com;
import java.util.Vector;
/**
 * Clase que modela el comportamiento de una pila y funcionamiento de una calculadora
 * @author Aarón Beltrán
 * @author Diana Díaz
 * @author Mariel Guamuche 
 * @since 30/enero/2022
 */
public class Pila implements Stack<Double>, Calculator{
    private Vector <Double> vector; //Se crea el vector que almacena datos del tipo double
    private Throwable n; // permite crear propios errores 
    private String expresion="";
    public Pila(){vector = new Vector<>();}    

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
    
    @Override
    public double calculate(String operation) {
        try {
            this.expresion=operation;
            this.vector.clear(); // se limpia el vector antes de iniciarse 
            for (int i = 0; i < operation.length(); i++) {
                if(isOperator(operation.substring(i, i+1))) {                
                    operate(operation.substring(i, i+1));                                                
                } else {
                    if (isNumber(operation.substring(i,i+1))) {
                        this.vector.add(Double.parseDouble(operation.substring(i, i+1))); // agrega el elemento como un numero usando stack                 
                    }
                }            
            }             
            return this.vector.remove(size() - 1);                                                           
        } 
        catch (Exception e){
            System.err.println("No ha ingresado una expresión postfix. Valide su entrada, se mostrará -.00001 como valor default");
            return -0.00001;
        }                   
    }

    /**
     * Valida si el char es un operador 
     * @param c
     * @return
     */
    private boolean isOperator(String c){
        return (c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/"));
    }

    /**
     * Valida si el char es un numero
     * @param c
     * @return
     */
    private boolean isNumber(String c) {
        return ("1".equals(c)||"2".equals(c)||"3".equals(c)||"4".equals(c)||"5".equals(c)||"6".equals(c)||"7".equals(c)||"8".equals(c)||"9".equals(c)||"0".equals(c));
    }

    /**
     * Realiza validacion de los elementos dentro del stack previo a operar 
     * @param operador indica si es una suma +, resta -, multiplicacion * o division /
     */
    private void operate(String operador) {
        if(this.vector.isEmpty()) {
            n = new Throwable(this.expresion+" generó el siguiente error: No hay objetos suficientesdentro del vector para ser procesados");
            System.err.println(n.getMessage());
        } else {   
            if(this.vector.size()>=2) {
                Double b = this.vector.remove(this.vector.size()-1); // se obtiene el elemento b
                Double a = this.vector.remove(this.vector.size()-1); // se obtiene el elemento a
                
                switch(operador) {
                    case "+":
                        this.vector.add(a+b);
                    break;
                    case "-":
                        this.vector.add(a-b);
                    break;
                    case "*":
                        this.vector.add(a*b);
                    break;
                    case "/":
                        try {                            
                            if(b.equals(0.0)) {
                                n = new Throwable(this.expresion+" esta expresión produjó el siguiente Error. División entre cero tiene por resultado infinito, está es una asíntota vertical. Será omitida la división y valores previos al error.");
                                System.err.println(n.getMessage());                                
                            } else {
                                this.vector.add(a/b);
                            }
                        } catch(ArithmeticException e) {
                            n = new Throwable("Error. División entre cero tiene por resultado infinito, está es una asíntota vertical. Expresión: "+this.expresion);
                            System.err.println(n.getMessage());
                        }
                    break;
                    default:
                    break;
                }
                
            } else {
                n = new Throwable(this.expresion+" produjó este error en su expresión postfix: No hay suficientes argumentos numéricos para ser operados previo al primer operador. Se mostrará el resultado omitiendo dicho operador y número.");
                System.err.println(n.getMessage());
            }                   
        }         
    }
}
