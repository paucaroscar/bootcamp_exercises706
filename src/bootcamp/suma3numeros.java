package bootcamp;

public class suma3numeros {
    public static void main(String[] args) {
        suma(10, 12, 20);

        coche miCoche = new coche();
        miCoche.incrementarpuertas();

        System.out.println(miCoche.puerta);

    }
    public static void suma(int num1, int num2, int num3){
        int resultado;
        resultado = num1 + num2 + num3;

        System.out.println(resultado);
    }

    public static class coche {
        public int puerta = 0;

        public void incrementarpuertas() {
            this.puerta++;

        }
    }

}

