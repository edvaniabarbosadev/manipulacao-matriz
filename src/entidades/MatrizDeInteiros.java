package entidades;

import java.util.Random;

public class MatrizDeInteiros {
    
    private int matriz[][];

    public MatrizDeInteiros(int linha, int coluna) {
        matriz = new int[linha][coluna];
    }

    public int[][] getMatriz() {
        return matriz;
    }
    
    public void setMatriz(){
        Random valorRand = new Random();
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = valorRand.nextInt(10);
            }
        }
    }
}
