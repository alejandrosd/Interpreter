
package interpreterpostfija;

import java.io.IOException;


/**
 *
 * @author Alejandro Ocampo
 */
public class InterpreterPostfija {
    
    static operacion operacion=new operacion();

    
        public static void main(String[] args) throws IOException {            
            System.out.println("el resultado es: "+operacion.operacion());
        }

}