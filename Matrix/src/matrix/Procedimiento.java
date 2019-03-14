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
        if(this==null){
            matrixst = "error";
        }
        else{
            for(i = 0; i < tamaño; i++){
                matrixst += "|";
                for(j = 0; j < tamaño; j++ ){
                    matrixst += matriz[i][j];
                    matrixst += (j != this.tamaño-1)? ", ":"";
                }
                matrixst += "|\n";
            }
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
    
 
}
