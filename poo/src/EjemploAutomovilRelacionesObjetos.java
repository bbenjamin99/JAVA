public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Persona conductorAuto1 = new Persona("Benjamin", "Benitez");
        Rueda[] ruedasNissan = new Rueda[5];

        for(int i = 0 ; i <= ruedasNissan.length; i++) {
            ruedasNissan[i] = new Rueda("Michelin", 26, 16.6);
        }

        Automovil nissan = new Automovil();
        nissan.setFabricante("Nissan");
        nissan.setModelo("Navara");
        nissan.setMotor(new Motor(2.0d, TipoMotor.DIESEL));  
        nissan.setEstanque(new Estanque(50));

        Persona micaela = new Persona("Micaela", "De Luca");
        Automovil mazda = new Automovil();
        mazda.setFabricante("Honda");
        mazda.setModelo("Mazda");
        mazda.setColor(Color.BLANCO);
        Motor motorMazda = new Motor();
        motorMazda.setTipo(TipoMotor.DIESEL);
        Estanque estanqueMazda = new Estanque(80); // Por defecto el estanque tiene 40.
        
        Automovil nissan2 = new Automovil("Nissan", "Navara2", "Blanco",new Motor(2.0,TipoMotor.DIESEL), new Estanque(), micaela, new Rueda[4]);
    }
}
