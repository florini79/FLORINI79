package ficha1java;

import java.util.Scanner;

public class Ficha1java {

    public static Scanner ler = new Scanner(System.in);
    public static int val1, val2;

    public static void le_dados() {

        System.out.println("insira um valor");
        val1 = ler.nextInt();
        System.out.println("insira um segundo valor");
        val2 = ler.nextInt();
    }

    public static void main(String[] args) {
        Maior_numero m = new Maior_numero();
        Numero_decrescente n = new Numero_decrescente();
        Soma_impar p = new Soma_impar();
        Troca_numero o = new Troca_numero();
        Compara_numero i = new Compara_numero();
        Media_aluno u = new Media_aluno ();
        int op;
        do {
            System.out.println("");
            System.out.println("---- MENU ----");
            System.out.println("0 - SAIR");
            System.out.println("1 - MAIOR DE 2");
            System.out.println("2 - NUMERO DECRESCENTE ");
            System.out.println("3 - SOMA DOS IMPARES ");
            System.out.println("4 - TROCA NUMEROS ");
            System.out.println("5 - COMPARA NUMEROS ");
            //System.out.println("---- MENU ----");
            op = ler.nextInt();
            switch (op) {
                case 0:
                    break;
                case 1:
                    le_dados();
                    m.maior2(val1, val2);
                    break;
                case 2:
                    n.desce();
                    break;
                case 3:
                    p.impar();
                    break;
                case 4:
                    le_dados();
                    o.troca(val1, val2);
                case 5:
                    le_dados();
                    i.compara(val1, val2);
                    break;
                       case 6:
                     u.Regista_notas();
                     u.media();
                default:
                    System.out.println("Insira um valor válido");
            }
        } while (op != 0);
    }

}
