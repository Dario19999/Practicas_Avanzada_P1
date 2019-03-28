/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author dario
 */
class Procedimiento {
    public double[][] matriz;
    public int i,j;
    public int tamaño;

    public Procedimiento(int tamaño) {
        matriz = new double[tamaño][tamaño];
        this.tamaño = tamaño;
    }
    
    public Procedimiento(double[][] matriz){
        this.matriz = matriz;
        this.tamaño = matriz[0].length;

    }
    
    Procedimiento(Procedimiento m, int pivote_f, int pivote_c)
    {
        int f=0, c=0;
        
        matriz = new double[m.tamaño-1][m.tamaño-1];
        for (int it = 0; it < m.tamaño; it++) 
        {
            c = 0;
            for (int jt = 0; jt < m.tamaño; jt++) 
            {
                if(it!=pivote_f && jt!=pivote_c)
                {
                    this.matriz[f][c] = m.matriz[it][jt];
                    c++;
                }
            }
            if(it!=pivote_f)
            {
                f++;
            }
        }
}
    
    public void agregar(int i, int j, double dato){
        matriz[i][j] = dato;
    }
    
    @Override
    public String toString(){
        
        String matrixst = "";
        if(this!=null){
           for(i = 0; i < tamaño; i++){
                matrixst += "|";
                for(j = 0; j < tamaño; j++ ){
                    matrixst += matriz[i][j];
                    matrixst += (j != this.tamaño-1)? ", ":"";
                }
                matrixst += "|\n";
            }
           System.out.println("");
        }
        else{
             matrixst = "error";
        }
        
        return matrixst;
    }
    
    public Procedimiento suma(Procedimiento mat_1){
        if(mat_1.tamaño == this.tamaño){
            double[][] r = new double [this.tamaño][this.tamaño];
            for(i = 0; i<tamaño;i++){
                for(j=0;j<tamaño;j++){
                    r[i][j] = matriz[i][j] + mat_1.matriz[i][j];
                    
                }
            }
            return new Procedimiento(r);
        }
        else{
            return null;
        }
    }
    
    public Procedimiento resta(Procedimiento mat_1){
        if(mat_1.tamaño == this.tamaño){
            double[][] r = new double [this.tamaño][this.tamaño];
            for(i = 0; i<tamaño;i++){
                for(j=0;j<tamaño;j++){
                    r[i][j] = matriz[i][j] - mat_1.matriz[i][j];
                }
            }
            return new Procedimiento (r);
        }
        else{
            return null;
        }
    }
    
    public Procedimiento multi(Procedimiento mat_1){
        if(mat_1.matriz.length == this.tamaño){
            double[][] r = new double [this.tamaño][this.tamaño];
            for(i = 0; i<tamaño;i++){
                for(j=0;j<tamaño;j++){
                    for(int it = 0; it<mat_1.tamaño; it++){
                        r[i][j] += this.matriz[i][it] * mat_1.matriz[it][j];
                    }
                }
            }
            return new Procedimiento (r);
        }
        else{
            return null;
        }
    }
    
    public Procedimiento tras(){
        double[][] r = new double [this.tamaño][this.tamaño];
        for(i = 0; i<tamaño;i++){
                for(j=0;j<tamaño;j++){
                    r[i][j] = this.matriz[j][i];
                }
            }
        return new Procedimiento (r);
    }
    
    public Procedimiento inv(){
     
        if(this.matriz.length == this.matriz[0].length){
        double [][] r = new double [this.matriz.length][this.matriz[0].length*2];
        for (j = 0; j < this.matriz[0].length*2; j++) {
            for (i = 0; i < this.matriz.length; i++) {
                r[i][j] = (j < this.matriz[0].length) ? this.matriz[i][j] : (j - this.matriz[0].length != i) ? 0 : 1;
            }
        }
        
        for (int it = 0; it < this.tamaño; it++) {
            double piv = r[it][it];
            double[][] mult = new double[this.matriz.length][this.matriz[0].length];

            for (int j = 0; j < mult.length; j++) {
                mult [j][0]= r[j][it];
            }

            for (j = 0; j < this.matriz[0].length*2; j++) {
                r[it][j] = r[it][j] / piv;
            }

            for (i = 0; i < this.matriz.length; i++) {
                for ( j = 0; j < this.matriz[0].length * 2; j++) {
                    r[i][j] = (i != it) ? r[i][j] - r[it][j]*mult[i][0] : r[i][j];
                    if(Double.isNaN(r[i][j]) || Double.isInfinite(r[i][j])){
                        return null;
                    }
                }
            }
            System.out.println(new Procedimiento(r));
        }
        return new Procedimiento(r);
        }else{
            return null;
                    
        }
    }
    
    public double deter(Procedimiento mat_1){
       
        if(mat_1.matriz.length == 1){
            return mat_1.matriz[0][0];
        }
        else if(mat_1.matriz.length==2){
            return mat_1.matriz[0][0] * mat_1.matriz[1][1] - mat_1.matriz[0][1] * mat_1.matriz[1][0];
        }
        else if(mat_1.matriz.length == mat_1.matriz[0].length){
            double acumulate = 0.0;
            for(int i=0; i < mat_1.tamaño; i++){
                double sign=1.0;
                if(i%2!=0){
                    sign = -1.0; 
                }
                Procedimiento temp = new Procedimiento(mat_1,0,i);
                acumulate += (sign * mat_1.matriz[0][i] * deter(temp));
            }
            return acumulate;
        }
    return 0;
    }
}