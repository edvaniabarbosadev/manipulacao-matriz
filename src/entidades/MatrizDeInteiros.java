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
        int soma = 0; // VARIÁVEL AUXÍLIO
        for (int i = 0; i < matriz.length; i++){  // LINHA
            for (int j = 0; j < matriz[i].length; j++){  // COLUNA
                soma += matriz[i][j];
            }
        }
        return soma;
    }
    
    public String encontrarValor(int valor) {  // 7
///   1   5
//    3  4
        String posicao= "";
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == valor) { 
                    posicao += "Linha: " + i + "\nColuna: " + j +"\n\n";
                }
            }
        }
        if(posicao.equals("")) {
            return "Valor não encontrado!";
        } else {
            return posicao;
        }        
    }
    
    public int[] somaLinhas() {
        ///   1   5
        //    3  4
        int[] linhaSoma = new int[matriz.length]; // instancia um array com o tamanho de linhas da matriz
        int soma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                soma += matriz[i][j]; // soma das colunas
            }
            linhaSoma[i] = soma; // atribuição da linha posicionada ( i )
            soma = 0;  // zera para proximo laço
        }
        return linhaSoma;
    }
    
    public int[] somaColunas() {
        ///   1   5 4
        //    3  4  6  
        int[] colunaSoma = new int[matriz[0].length]; // Pega a quantidade colunas da matriz
        int soma = 0;
        for (int i = 0; i < matriz[0].length; i++) { // Percorro colunas
            for(int j = 0; j < matriz.length; j++) { // Percorro as linhas
                soma += matriz[j][i]; // coluna -> matriz[0]; linha -> matriz; 
            }
            colunaSoma[i] = soma;
            soma = 0;
        }
        return colunaSoma;
    }
    
    public void transposta() {
        int[][] transposta = new int[matriz[1].length][matriz.length]; // primeiro qnt de colunas, depois qnt de linhas
         for (int i = 0; i < matriz[0].length; i++) {// Percorro colunas
            for(int j = 0; j < matriz.length; j++) { // Percorro as linhas
                transposta[i][j] = matriz[j][i];
            }
        }
         matriz = new int[matriz[0].length][matriz.length]; // Redefinir a caracteristca do atributo matriz
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
        int tamanhoColuna = matriz[0].length -1 ;
        String diagonalSecundaria = "";
        for(int i = 0; i < matriz.length; i++) {
            if(tamanhoColuna >= 0) {
                diagonalSecundaria += matriz[i][tamanhoColuna] + "\n";
                tamanhoColuna--;  
            }            
        }
        return diagonalSecundaria;
    }
    
    public void trocarValores() {
        int[] primeiraLinha = new int[matriz[0].length]; // pega qnt de colunas da matriz       
        
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i == 0) {
                    primeiraLinha[j] = matriz[i][j]; // PEGA VALORES DA PRIMEIRA LINHA
                    matriz[i][j] = matriz[matriz.length - 1][j]; // inserindo valores da ultima linha pra primeira linha
                }
                
                if(i == matriz.length - 1) {     // condição ultima linha
                    matriz[i][j] = primeiraLinha[j]; // insere a primeira linha pra ultima linha
                }
            }
        }
    }
    
    public String valoresPares() {
        String pares = "";
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] % 2 == 0) {   // matriz[0][0] = 3;       
                    pares += matriz[i][j] + "\n";
                }                
            }
        }
        return pares;
    }
    
    public String maiorValor() {
        ///   6  7 4
        //    3  9  6  
        int maior = matriz[0][0];
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
        ///   6  7 4
        //    3  9  6          
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] % 2 == 0) {
                    matriz[i][j] = 1;   // TROCA POR 1 SE FOR PAR, 
                } else {
                    matriz[i][j] = -1; // TROCA POR -1 SE FOR PAR, 
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
