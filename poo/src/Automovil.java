public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    
    private static int capacidadTanqueEstatico = 50;
    private static String colorPatente = "Blanco"; 
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAXIMA_RUTA = 120; 

    //Enums
    public  Color BLANCO;
    // Constructor
    public Automovil(){
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    public Automovil(String fabricante, String modelo, String color){
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, Motor motor){
        this(fabricante,modelo,color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, String color, Motor motor, Estanque estanque){
        this(fabricante,modelo,color,motor);
        this.estanque = estanque;
    }
    public Automovil(String fabricante, String modelo, String color, Motor motor, Estanque estanque, Persona conductor,
            Rueda[] ruedas) {
        this(fabricante,modelo,color,motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    // Getters & Setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(Color color) {
        color = color;
    }

    public Motor getMotor() {
        return motor;
    }
    
    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public String getTipo() {
        return motor.getTipo().toString();
    }

    public void setCilindrada(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if(estanque == null) {
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque){
        this.estanque = estanque;
    }

    public void setCapacidadTanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public static String getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente =  colorPatente;
    }

    // Methods
    public String verDetalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("auto1.fabricante = "+ this.fabricante + "\n")
           .append("auto1.modelo = " + this.modelo + "\n");
           if (getTipo() !=  null){
            sb.append("auto1.tipo = " + this.getTipo() + "\n");
           };

           sb.append("auto1.color = " + this.color + "\n")
           .append("auto1.cilindrada = " + this.motor.getCilindrada()  + "\n")
           .append("Color Patente = "+ colorPatente);
            return sb.toString();
    }

    public String acelerar(int rpm) {

        return "El auto " + this.fabricante + " Esta acelerando a : " + rpm + " Revoluciones por minuto.";
    }

    public String frenar(int rpm) {
        return "El auto " + this.fabricante + " Esta frenando..."; 
    }

    public String acelerarFrenar(int rpm) {

        String acelerarFrenar = this.acelerar(2000) +  this.frenar(0);
        return acelerarFrenar;
        // return acelerar(1) + " " + frenar(0).toString();
    }   

    public float calcularConsumo(int kilometros, float porcentajeCombustible) {
        
        return  kilometros / (porcentajeCombustible * this.estanque.getCapacidad());
    }

    public float calcularConsumo(int kilometros, int porcentajeCombustible) {
        
        return  kilometros / (this.getEstanque().getCapacidad() * (porcentajeCombustible / 100f));
    }

    public static float calcularConsumoStatic(int kilometros, int porcentajeCombustible) {
        
        return  kilometros / (capacidadTanqueEstatico * (porcentajeCombustible / 100f));
    }



    // Overrides
    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil)obj;

        if(this == obj ) return true;
        if ( !(obj instanceof Automovil) ) return false;

        return (this.fabricante != null
         && this.modelo != null
         && this.fabricante.equals(a.getFabricante())
         && this.modelo.equals(a.getModelo())  );
    }

    @Override
    public String toString() {
        return "ID = " + this.id + "Automovil " + "[fabricante=" + fabricante + ", modelo=" + modelo + ", color=" + color + ", cilindrada="
                + this.motor.getCilindrada() + ", capacidadTanque=" + this.estanque.getCapacidad() + "]";
    }

    
}