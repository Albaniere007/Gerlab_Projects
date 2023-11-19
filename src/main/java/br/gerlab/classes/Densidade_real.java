package br.gerlab.classes;

import java.math.BigDecimal;
import java.util.Scanner;

public class Densidade_real {
     {
        System.out.println("Voce está em: DENSIDADE REAL ");
    }
    Scanner entrada = new Scanner(System.in);
    private double dado1;
    private double dado2;
    private double dado3;
    private double dado4;


    private void obter_dados(){


        System.out.println("Informe a tara");
        dado1 = entrada.nextDouble();
        System.out.println("Informe a tara + amostra");
        dado2 = entrada.nextDouble();
        System.out.println("Informe a tara + amostra + água");
        dado3 = entrada.nextDouble();
        System.out.println("Informe a tara + água (CALIBRAÇÃO)");
        dado4 = entrada.nextDouble();
    }



    public void calcular() {
        obter_dados();
        double densidade_real = ((dado2 - dado1) / ((dado3 - dado2) - (dado4 - dado1)));

        System.out.printf("A densidade real é: %, .3fg/cm³" , densidade_real);
    }




}
