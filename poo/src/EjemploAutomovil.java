public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto1 = new Automovil();
        auto1.setFabricante("Subaru");
        auto1.setModelo("Impreza");
        auto1.setCilindrada(2.0);
        auto1.setColor("Blanco"); 

        Automovil auto2 = new Automovil("Honda", "Mazda", "Azul");
        
        Automovil auto3 = new Automovil("Volkswagen", "Gol", "Gris");
        Automovil auto4Igual3 = new Automovil("Volkswagen", "Gol", "Gris");

        System.out.println(auto2);
        System.out.println(auto2.toString() );



        // System.out.println("Son iguales? = " + (auto3 == auto4Igual3 ) );
        // System.out.println("Son iguales ( Con Equals?) : " + auto3.equals(auto4Igual3));

    //     System.out.println( auto1.verDetalle());
    //     System.out.println(auto1.acelerar(2500));
    //     System.out.println(auto2.acelerar(1500));
    //     System.out.println("----------------------------------");
    //     System.out.println(auto2.verDetalle() );

    //     System.out.println(auto1.acelerarFrenar(0));
    //     System.out.println(auto1.acelerarFrenar(0));
        
    //     System.out.println("KM Por litro = " + auto1.calcularConsumo(300,40 ));


    //     System.out.println("-------------------------------------------");

    //    System.out.println( auto3.verDetalle() ) ;
    }
}
