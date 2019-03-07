/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manie
 */
public class Formula {
    public float A;
    public float B;
    public float C;
    public float Raiz;
    public boolean IsI;
    public float Res1;
    public float Res2;
    public String resultado;
    
    /**
     * 
     * Inicializa los valores A, B y C usados para la fórmula general
     * 
     */
    public Formula(float consA, float consB, float consC){
        A = consA;
        B = consB;
        C = consC;
        
    }
    /**
     * Calc Raiz calcula la parte de la fórmula de la raíz cuadrada
     * El resultado lo guarda en la variable Raiz
     * Igualmete determina si el resultado será imaginario
     * Esto se maraca en el booleano IsI
     */
    private void CalcRaiz(){
        Raiz = (B*B)-(4f*A*C); 
        if(Raiz < 0){ 
            IsI = true; 
            Raiz = Math.abs(Raiz);
            Raiz = (float)Math.sqrt((double)Raiz);//Se calcula la raíz
        }else{
            IsI = false;
             Raiz = (float)Math.sqrt((double)Raiz);//Se calcula la raíz
        }
    }
    /**
     * X1 devuelve el resultado positivo de la fórmula
     *  
     */
    public String X1(){ 
        CalcRaiz(); 
        if(IsI){
            Res1 = -B/(2f*A);
            Res2 = Raiz/(2f*A);
            resultado=""+Res1+"+"+Res2+"i";//Resultado de operación cunado es imaginario
            return(resultado);
        }{
            Res1=-B+Raiz;
            Res1=Res1/(2f*A);
            resultado=""+Res1;//Resultado de opración cuando es real
            return(resultado);
        }
    }
    /**
     * X2 devuelve el resultado positivo de la fórmula
     *  
     */
     public String X2(){
        CalcRaiz();
        if(IsI){
            Res1 = -B/(2f*A);
            Res2 = Raiz/(2f*A);
            resultado=""+Res1+"-"+Res2+"i";//Resultado si es imaginario
            return(resultado);
        }{
            Res1=-B-Raiz;
            Res1=Res1/(2f*A);
            resultado=""+Res1;//Resultado si es real
            return(resultado);
        }
    }
    
    
  
}
