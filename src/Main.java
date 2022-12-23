public class Main {
    public static void main(String[] args) {

        //parte 1 valores agregados a la suma
        int resultado = suma(2,5,3);
        System.out.println(resultado);

        //parte2 objeto coche

        Coche miCoche  = new Coche();
        miCoche.agregarPuerta();
        miCoche.agregarPuerta();

        System.out.println(miCoche.puerta);

    }

    //parte 1 metodo suma
    public  static int suma (int a, int b,int c ){
        return a+b+c;
    }

}

//parte2 clase coche

class Coche {
    int puerta=2;

    public void agregarPuerta() {
        this.puerta++;
    }
}


