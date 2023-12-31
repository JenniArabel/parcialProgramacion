public class Transporte {
    private String tipoDeTransporte;
    private PaqueteViaje paqueteViaje;

    public Transporte(String tipoDeTransporte) {
        this.tipoDeTransporte = tipoDeTransporte;
    }
    public Transporte(PaqueteViaje paqueteViaje) {
        this.paqueteViaje = paqueteViaje;
    }
    public String getTipoDeTransporte() {
        return tipoDeTransporte;
    }

    public void setTipoDeTransporte(String tipoDeTransporte) {
        this.tipoDeTransporte = tipoDeTransporte;
    }

    public PaqueteViaje getPaqueteViaje() {
        return paqueteViaje;
    }

    public void setPaqueteViaje(PaqueteViaje paqueteViaje) {
        this.paqueteViaje = paqueteViaje;
    }

    public void transporteAutobus(boolean isAutobus){
        System.out.println("El cliente desea viajar en autobus de larga distancia? " + isAutobus);
    }
    public void transporteAvion(boolean isAvion){
        System.out.println("El cliente desea viajar en avion? " + isAvion);
    }
    public void agregarPaquete(PaqueteViaje paqueteViaje1){
        this.setPaqueteViaje(paqueteViaje1);
    }
}
