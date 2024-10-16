public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto1 = new Automovil();
        auto1.fabricante = "Subaru";
        auto1.modelo = "Impreza";
        auto1.cilindrada = 2.0;
        auto1.color = "Blanco";

        Automovil auto2 = new Automovil();
        auto2.fabricante = "Mazda";
        auto2.modelo = "BT-50";
        auto2.cilindrada = 3.0;
        auto2.color = "Rojo";

        System.out.println( auto1.verDetalle());
        System.out.println(auto1.acelerar(2500));
        System.out.println(auto2.acelerar(1500));
        System.out.println("----------------------------------");
        System.out.println(auto2.verDetalle() );

        System.out.println(auto1.acelerarFrenar(0));
        System.out.println(auto1.acelerarFrenar(0));
        
        System.out.println("KM Por litro = " + auto1.calcularConsumo(300,40 ));
    }
}
