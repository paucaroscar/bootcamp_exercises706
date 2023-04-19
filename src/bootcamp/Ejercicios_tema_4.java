package bootcamp;

import java.util.Arrays;

public class Ejercicios_tema_4 {
    public static void main(String[] args) {
        int numeroif = -5;
        int numerowhile = 3;
        int numerodowhile = 10;
        var estacion = "navidad";

        if (numeroif > 0){
            System.out.println("Es positivo");
        }
        else if (numeroif < 0){
            System.out.println("Es negativo");
        }
        else {
            System.out.println("Es 0");
        }

        while (numerowhile < 3){
            System.out.println(numerowhile);
            numerowhile = numerowhile + 1;
        }


        do {
            System.out.println(numerodowhile);
            numerodowhile = numerodowhile + 2;
        } while (numerodowhile < 3);


        for (int numeroFor = 0; numeroFor <=3; numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        }

        switch (estacion){
            case "primaver":
                System.out.println("ES PRIMAVERA");
                break;
            case "verano":
                System.out.println("ES VERANO");
                break;
            case "otoño":
                System.out.println("ES OTOÑO");
                break;
            case "invierno":
                System.out.println("ES INVIERNO");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }

}
