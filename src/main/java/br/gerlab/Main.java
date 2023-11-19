package br.gerlab;

import br.gerlab.classes.Densidade_real;
import br.gerlab.classes.Viga_Benkelman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================================================");

        System.out.println("                           Bem vindo ao GERLAB                            ");

        System.out.println("==========================================================================");


        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha a opção desejada");
        System.out.println("[1] DENSIDADE REAL");
        System.out.println("[2] VIGA BENKELMAN");
        char escolha = entrada.next().charAt(0);

        if (escolha== '1'){
            Densidade_real densidade_real= new Densidade_real();
            densidade_real.calcular();
        } else if (escolha=='2') {
            Viga_Benkelman viga_benkelman = new Viga_Benkelman();
            viga_benkelman.calcular();
        }


    }
}