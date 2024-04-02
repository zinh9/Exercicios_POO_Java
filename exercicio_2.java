public class Triangulo {
    double ladoA;
    double ladoB;
    double ladoC;
    boolean verifica;
    
    public boolean verificaTriangulo(){
        if (ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) &&  ladoC < (ladoA + ladoB)){
            verifica = true;
        }else{
            verifica = false;
        }
        
        return verifica;
    }
    
    public double calculaArea(){
        double area;
        double s;
        
        if (verifica == true){
            s = (ladoA + ladoB + ladoC) / 2;
            area = sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
        }else{
            System.out.println("Nao eh possivel calcular a area do triangulo!");
            area = 0;
        }
        
        return area;
    }
}

public class main_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo meuT = new Triangulo();
        
        meuT.ladoA = 3;
        meuT.ladoB = 4;
        meuT.ladoC = 5;
        
        System.out.println(meuT.verificaTriangulo());
        System.out.println("A area do meu triangulo eh: " +meuT.calculaArea());
    }
    
}
