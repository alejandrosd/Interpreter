
package interpreterpostfija;

import java.io.*;


/**
 *
 * @author Alejandro Ocampo
 */
public class leerArchivo {
    String texto;
    
    
    public String leertxt(String dir) throws FileNotFoundException, IOException{
        
        try{
            BufferedReader bf= new BufferedReader(new FileReader(dir));
            String temp="";
            String bfRead;
            while((bfRead=bf.readLine())!= null){
                temp = temp + bfRead;                
            }
            texto = temp;
        }catch(Exception e){
            System.out.println("nn");
        }
        return texto;
    }
    
}
