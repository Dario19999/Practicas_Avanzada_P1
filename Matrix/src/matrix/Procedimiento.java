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
    public int row,col;

    public Procedimiento(double[][] matriz, int i, int j, int row, int col) {
        matriz = new double[row][col];
        this.matriz = matriz;
        this.row = matriz.length;
        this.col = matriz[0].length;
        this.i = i;
        this.j = j;
        this.row = row;
        this.col = col;
    }
    
    Procedimiento(Procedimiento m, int p_row, int p_col){
        int row = 0, col = 0;
        
    }
    
}
