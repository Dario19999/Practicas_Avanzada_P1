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
    }
    
    Procedimiento(Procedimiento m, int pivote_f, int pivote_c)
    {
        int rows=0, cols=0;
        tamaño = m.tamaño-1;
        matriz = new double[tamaño][tamaño];
        for (int it = 0; it < m.tamaño; it++) 
        {
            cols = 0;
            for (int jt = 0; jt < m.tamaño; jt++) 
            {
                if(it!=pivote_f && jt!=pivote_c)
                {
                    this.matriz[tamaño][tamaño] = m.matriz[i][j];
                    cols++;
                }
            }
            if(i!=pivote_f)
            {
                rows++;
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
            return new Procedimiento (r);
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
        if(mat_1.tamaño == this.tamaño){
            double[][] r = new double [this.tamaño][this.tamaño];
            for(i = 0; i<tamaño;i++){
                for(j=0;j<tamaño;j++){
                    r[i][j] = matriz[i][j] * mat_1.matriz[i][j];
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
     
        double [][] res = new double [this.tamaño][this.tamaño*2];
        for (j = 0; j < this.tamaño*2; j++) {
            for (i = 0; i < this.tamaño; i++) {
                res[i][j] = (i < this.j) ? this.matriz[i][j] : (j - this.tamaño != i) ? 0 : 1;
            }
        }

        for (int it = 0; i< this.tamaño; i++) {
            double piv = res[it][it];
            double[][] mult = new double[this.tamaño][this.tamaño];

            for (int j = 0; j < mult.length; j++) {
                mult [j][0]= res[j][it];
            }

            for (j = 0; j < this.tamaño*2; j++) {
                res[i][j] = res[i][j] / piv;
            }

            for (i = 0; i < this.tamaño; i++) {
                for ( j = 0; j < this.tamaño * 2; j++) {
                    res[it][j] = (i != it) ? res[i][j] - res[it][j]*mult[i][0] : res[i][j];
                    if(Double.isNaN(res[i][j]) || Double.isInfinite(res[i][j])){
                        return null;
                    }
                }
            }
        }
        return new Procedimiento(res);
    }
    
    public double deter(Procedimiento mat_1){
        
        if(mat_1.tamaño == 1){
            return mat_1.matriz[0][0];
        }else if(mat_1.tamaño==2){
            return mat_1.matriz[0][0] * mat_1.matriz[1][1] - mat_1.matriz[0][1] * mat_1.matriz[1][0];
        }else if(mat_1.tamaño == mat_1.tamaño){
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