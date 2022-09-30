package controller;

public class Anos {
    public Anos(){
        super();
    }

    public void anos(){
        int cont = 0;
        double alturaMaria = 1.5, alturaAna = 1.10;

        do{
//            System.out.println("Ana " + alturaAna + " ");
//            System.out.println("Maria " + alturaMaria + " ");
            alturaAna += 0.03;
            alturaMaria += 0.02;
            cont ++;
        }while(alturaAna < alturaMaria);

        System.out.println("Ana será maior que Maria daqui a " + cont + " anos.");

    }
}
