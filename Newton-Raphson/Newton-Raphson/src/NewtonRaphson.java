import java.util.Scanner;

public class NewtonRaphson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        double pot = 0, aprox = 0;
        
         double [][] termino = new double [100][2];
        
        System.out.println("Ingresar la potencia mas alta de la ecuacion");
        pot = in.nextInt();
        
        System.out.println("Ingresar la aproximación inicial");
        aprox = in.nextDouble();
        
        for(int i=0; i<=pot; i++){
            System.out.println("Ingresar valor de x^"+i);
            termino[i][0] = in.nextDouble();
            termino[i][1] = i;
        }

        Procedimiento proc = new Procedimiento(termino, pot);
        double x = proc.calculo(aprox);
    }
    
}
