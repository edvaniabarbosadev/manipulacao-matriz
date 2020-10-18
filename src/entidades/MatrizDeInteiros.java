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
    
    public int somaMatriz() {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                soma += matriz[i][j];
            }
        }
        return soma;
    }
    
    public String encontrarValor(int valor) {
        String posicao= "";
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == valor) {
                    posicao += "Linha: " + i + "\nColuna: " + j +"\n\n";
                }
            }
        }
        return posicao.equals("") ? "Valor não encontrado!" : posicao;
    }
    
    public String somaLinhas() {
        String textoSoma = "";
        int soma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                soma += matriz[i][j];
            }
            textoSoma += "Linha " + i + ": " + soma + "\n";
             soma = 0;
        }
        return textoSoma;
    }
    
    public String somaColunas() {
        String textoSoma = "";
        int soma = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                soma += matriz[j][i];
            }
            textoSoma += "Coluna " + i + ": " + soma + "\n";
            soma = 0;
        }
        return textoSoma;
    }
    
    public void transposta() {
        int[][] transposta = new int[matriz[1].length][matriz.length];
         for (int i = 0; i < matriz[0].length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }
         matriz = new int[matriz[0].length][matriz.length];
         matriz = transposta;
    }
    
    public String diagonalPrincipal() {
        String diagonalPrincipal = "";
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if(i == j) {
                    diagonalPrincipal += matriz[i][j] + "\n";
                }
            }
        }
        return diagonalPrincipal;
    }
    
    public String diagonalSecundaria() {
        int tamanhoLinha = matriz[0].length -1 ;
        String diagonalSecundaria = "";
        for(int i = 0; i < matriz.length && tamanhoLinha >= 0; i++) {
            diagonalSecundaria += matriz[i][tamanhoLinha] + "\n";
            tamanhoLinha--;
        }
        return diagonalSecundaria;
    }
    
    public void trocarValores() {
        int[] primeiraLinha = new int[matriz[0].length];        
        
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i == 0) {
                    primeiraLinha[j] = matriz[i][j];
                    matriz[i][j] = matriz[matriz.length - 1][j];
                }
                
                if(i == matriz.length - 1) {     
                    matriz[i][j] = primeiraLinha[j];
                }
            }
        }
    }
    
    public String valoresPares() {
        String pares = "";
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] % 2 == 0) {
                    pares += matriz[i][j] + "\n";
                }                
            }
        }
        return pares;
    }
    
    public String maiorValor() {
        int maior = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] > maior) {
                   maior = matriz[i][j];
                }                
            }
        }
        return String.valueOf(maior);
    }
    
    public void substituirParesImpar() {        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] % 2 == 0) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = -1;
                }
            }
        }        
    }
    
    public String isSimetrica() {
        if(matriz.length == matriz[0].length) {
            return "É simétrica";
        } else {
            return "Não é simétrica";
        }
    }
}
