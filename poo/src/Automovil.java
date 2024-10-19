public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private double cilindrada;
    private int capacidadTanque = 40;
    
    private static int capacidadTanqueEstatico = 50;
    private static String colorPatente = "Blanco"; 
    private static int ultimoId;
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

    public Automovil(String fabricante, String modelo, String color, double cilindrada){
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque){
        this(fabricante,modelo,color,cilindrada);
        this.capacidadTanque = capacidadTanque;
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

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
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
           .append("auto1.modelo = " + this.modelo + "\n")
           .append("auto1.color = " + this.color + "\n")
           .append("auto1.cilindrada = " + this.cilindrada  + "\n")
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
        
        return  kilometros / (porcentajeCombustible * this.capacidadTanque);
    }

    public float calcularConsumo(int kilometros, int porcentajeCombustible) {
        
        return  kilometros / (capacidadTanque * (porcentajeCombustible / 100f));
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
        return "Automovil [fabricante=" + fabricante + ", modelo=" + modelo + ", color=" + color + ", cilindrada="
                + cilindrada + ", capacidadTanque=" + capacidadTanque + "]";
    }

    
}