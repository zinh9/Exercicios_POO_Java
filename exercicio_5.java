public static void main(String[] args) {
        String [] nomes = {"João", "Mariana", "Marcos", "Helena", "Renan", "Enzo", "Marcia", "Rafael", "Pedro", "Faiçal"};
        
        String nome = InOut.leString("Informe o nome que deseja buscar: ");
        boolean encontrado = false;
        
        for(int i = 0; i < nomes.length; i++){
            if(nomes[i].equals(nome)){
                InOut.MsgDeInforma("Informação", "Nome: " +nomes[i]);
                encontrado = true;
            }
        }
        
        if(encontrado != true){
            InOut.MsgDeErro("ERRO", "Nome não encontrado!");
        }
    }
