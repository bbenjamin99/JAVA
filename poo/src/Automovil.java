public class Automovil {
    String fabricante;
    String modelo;
    String color = "Gris";
    double cilindrada;
    int capacidadTanque = 40;

    public String verDetalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("auto1.fabricante = "+ this.fabricante + "\n")
           .append("auto1.modelo = " + this.modelo + "\n")
           .append("auto1.color = " + this.color + "\n")
           .append("auto1.cilindrada = " + this.cilindrada);
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
}