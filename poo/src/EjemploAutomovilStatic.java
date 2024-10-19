public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil("Honda", "Mazda", "Azul");
        Automovil auto3 = new Automovil("Volkswagen", "Gol", "Gris");
        Automovil auto4Igual3 = new Automovil("Volkswagen", "Gol", "Gris");


        System.out.println(auto1.verDetalle());
        System.out.println(auto2.verDetalle());
        System.out.println(auto3.verDetalle());
        System.out.println("------------------------------");

        System.out.println("Kilometros por litros: " + auto1.calcularConsumoStatic(120, 40));

    }
}
