public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int i = 0, j = numeros.length - 1, aux = 0, primeiro = numeros[i];
        
        while(i < 10){
            aux = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = aux;
            
            i++;
            j--;
            
            if(i == 10){
                numeros[9] = primeiro;
            }
        }
        
        for(i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] +"\t");
        }
}
