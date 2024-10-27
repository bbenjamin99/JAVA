public class Rueda {

    private String fabricante;
    private int aro;
    private Double ancho;

    //Constructor
    public Rueda(String fabricante, int aro, Double ancho){
        this.fabricante = fabricante;
        this.aro = aro;
        this.ancho = ancho;
    }

    //Getter
    public String getFabricante() {
        return fabricante;
    }
    public Integer getAro() {
        return aro;
    }
    public Double getAncho() {
        return ancho;
    }


}
