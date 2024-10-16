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


        System.out.println("auto1.fabricante = " + auto1.fabricante);
        System.out.println("auto1.modelo = " + auto1.modelo);
        System.out.println("auto1.color = " + auto1.color);
        System.out.println("auto1.cilindrada = " + auto1.cilindrada);

        System.out.println("----------------------------------");

        System.out.println("auto2.fabricante = " + auto2.fabricante);
        System.out.println("auto2.modelo = " + auto2.modelo);
        System.out.println("auto2.color = " + auto2.color);
        System.out.println("auto2.cilindrada = " + auto2.cilindrada);

    }
}
