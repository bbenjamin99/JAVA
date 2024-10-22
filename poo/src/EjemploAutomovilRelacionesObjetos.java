public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Persona conductorAuto1 = new Persona("Benjamin", "Benitez");

        Automovil auto1 = new Automovil();
        auto1.setFabricante("Volkswagen");
        auto1.setModelo("Gol Trend");
        auto1.setMotor(new Motor(2.0d, TipoMotor.DIESEL));  
        auto1.setEstanque(new Estanque(50));


        Automovil mazda = new Automovil();
        mazda.setFabricante("Honda");
        mazda.setModelo("Mazda");
        mazda.setColor(Color.BLANCO);
        Motor motorMazda = new Motor();
        motorMazda.setTipo(TipoMotor.DIESEL);
        Estanque estanqueMazda = new Estanque(80); // Por defecto el estanque tiene 40.

    }
}
