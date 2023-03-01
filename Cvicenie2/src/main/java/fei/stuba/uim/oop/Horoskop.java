package fei.stuba.uim.oop;

import java.util.Scanner;

public class Horoskop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pre skoncenie stlac b, inak hocico");

        while(true) {

            System.out.println("Zadaj den narodenia (DD)");
            String denNarodenia = scanner.nextLine();
            int den = Integer.parseInt(denNarodenia);

            System.out.println("Zadaj mesiac narodenia (MM)");
            String mesiacNarodenia = scanner.nextLine();
            int mesiac = Integer.parseInt(mesiacNarodenia);

            horoskop(den, mesiac);

            String input = scanner.nextLine();
            if (input.equals("b")) {
                System.out.println("koniec");
                break;
            }
        }




    }

    public static String horoskop(int den, int mesiac) {

        switch(mesiac) {
            case 1:
                if (den >= 21) {
                    System.out.println("vodnar");
                    break;
                }

                else {
                    System.out.println("kozorozec");
                }
                break;

            case 2:
                if (den <= 19)
                    System.out.println("vodnar");
                else System.out.println("ryby");
                break;

            case 3:
                if (den <= 20)
                    System.out.println("ryby");
                else System.out.println("baran");
                break;

            case 4:
                if (den <= 20)
                    System.out.println("baran");
                else System.out.println("byk");
                break;

            case 5:
                if (den <= 20)
                    System.out.println("byk");
                else System.out.println("blizenci");
                break;

            case 6:
                if (den <= 21)
                    System.out.println("blizenci");
                else System.out.println("rak");
                break;

            case 7:
                if (den <= 22)
                    System.out.println("rak");
                else System.out.println("lev");
                break;

            case 8:
                if (den <= 22)
                    System.out.println("lev");
                else System.out.println("panna");
                break;

            case 9:
                if (den <= 22)
                    System.out.println("panna");
                else System.out.println("vahy");
                break;

            case 10:
                if (den <= 22)
                    System.out.println("vahy");
                else System.out.println("skorpion");
                break;

            case 11:
                if (den <= 22)
                    System.out.println("skorpion");
                else System.out.println("strelec");
                break;

            case 12:
                if (den <= 21)
                    System.out.println("strelec");
                else System.out.println("kozorozec");
                break;

            default:
                System.out.println("nauc sa zadavat datum");
                break;

        }
        return("ahoj");

    }
}
