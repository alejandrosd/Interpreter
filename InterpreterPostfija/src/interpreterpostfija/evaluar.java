
package interpreterpostfija;
/**
 *
 * @author Alejandro Ocampo
 */
public class evaluar extends expresion{
 
    @Override
    public int evaluate(String op, String n1, String n2){
    int num1 = Integer.parseInt(n1);
    int num2 = Integer.parseInt(n2);
    if (op.equals("+")) return (num1 + num2);
    if (op.equals("-")) return (num1 - num2);
    if (op.equals("*")) return (num1 * num2);
    if (op.equals("/")) return (num1 / num2);
    return 0;
  }

 
}
