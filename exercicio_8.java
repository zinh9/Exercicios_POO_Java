public static void main(String[] args) {
        int [] vetor = {3, 6, 1, 9, 5, 8, 3, 6, 4, 9, 13, 15};
        
        int x = InOut.leInt("Digite a posição de X: ");
        int y = InOut.leInt("Digite a posição de Y: ");
        int soma = vetor[x] + vetor[y];
        
        InOut.MsgDeInforma("Soma", "A soma dos valores de X e Y encontrados é: " +soma);
    }
