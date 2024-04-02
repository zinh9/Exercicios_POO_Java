public class Retangulo {
    double base;
    double altura;
    boolean verifica;
    
    public boolean verificaRetangulo(){
        if(base != altura){
            verifica = true;
        }else{
            verifica = false;
        }
        
        return verifica;
    }
    
    public double calculaArea(){
        double area;
        
        if(verifica == true){
            area = base * altura;
            return area;
        }else{
            System.out.println("Nao eh possivel calcular a area do retangulo");
            area = 0;
        }
        
        return area;
    }
    
    public double calculaPerimetro(){
        double p = 2 * (base + altura);
        
        return p;
    }
}

public class main_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Retangulo meuR = new Retangulo();
        meuR.altura = 10;
        meuR.base = 10;
        
        System.out.println(meuR.verificaRetangulo());
        System.out.println("A area do meu retangulo eh: " +meuR.calculaArea());
        System.out.println("O perimetro do meu retangulo eh: " +meuR.calculaPerimetro());
    }
    
}
