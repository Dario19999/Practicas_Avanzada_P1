//Importamos la clase de Scanner
import java.util.Scanner;

public class FormulaGeneral {
        
	public static void main(String args[]) {
            //creamos un objeto Scanner
            Scanner input = new Scanner(System.in);
                
            //Declaramos las variables que introducirá el usuario.
            double a, b, c;

            //solicitamos el input de las 3 variables a, b y c.
            System.out.println("Ingrese el valor de 'a'");
            a = input.nextDouble();
            System.out.println("Ingrese el valor de 'b'");
            b = input.nextDouble();
            System.out.println("Ingrese el valor de 'c'");
            c = input.nextDouble();
            
            //Mandamos las 3 variables como parametros a la clase Procedimiento.
            Procedimiento proc = new Procedimiento(a, b, c);
            
            //invocamos al método resultado de la clase procedimiento
            proc.resultado();
            
            //Imprimimos la string que retorna nuestro metodo resultado.
            System.out.println(proc.r);
	}
}	
		
    

