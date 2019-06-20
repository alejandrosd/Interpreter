
package interpreterpostfija;

import java.io.IOException;
import java.util.Stack;

/**
 *
 * @author Alejandro Ocampo
 */
public class operacion extends InterpreterPostfija{
    private String expr = null;
    private String[] post= null;
    
    Stack < String > left = new Stack < String > (); //pila entrada
    Stack < String > right = new Stack < String > (); //pila de operandos
    
    evaluar e=new evaluar();
    
    
    public String operacion() throws IOException{
        leerArchivo a = new leerArchivo();
        
        expr=(a.leertxt("C:\\Users\\Usuario\\Desktop\\tarea modelos\\InterpreterPostfija\\src\\interpreterpostfija\\texto.txt"));  
        System.out.println("la expresion es: "+expr);
        post = expr.split(" ");
        
        //array de la pila de entrada (left)
        for (int i = post.length - 1; i >= 0; i--) {
            left.push(post[i]);
        //    System.out.println("entrada");
        }
        
        
   
        //evaluación postfija
    String operadores = "+-*/%"; 
        while (!left.isEmpty()) {
            if (operadores.contains("" + left.peek())) {
                right.push(""+e.evaluate(left.pop(), right.pop(), right.pop()));
            }else {
                right.push(left.pop());
        } 
    }     
   return right.peek();}
}

