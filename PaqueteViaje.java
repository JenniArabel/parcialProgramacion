public class PaqueteViaje {
    private int duracionDias;
    private String fechaRegreso;
    private String fechaSalida;
    private boolean incluirExcursiones;
    private String lugarDestino;
    private String lugarOrigen;
    private double precio;

    //private AgenciadeViaje agencia;

    public PaqueteViaje(int duracionDias, String fechaRegreso, String fechaSalida, boolean incluirExcursiones, String lugarDestino, String lugarOrigen, double precio) {
        this.duracionDias = duracionDias;
        this.fechaRegreso = fechaRegreso;
        this.fechaSalida = fechaSalida;
        this.incluirExcursiones = incluirExcursiones;
        this.lugarDestino = lugarDestino;
        this.lugarOrigen = lugarOrigen;
        this.precio = precio;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }
    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public boolean isIncluirExcursiones() {
        return incluirExcursiones;
    }

    public void setIncluirExcursiones(boolean incluirExcursiones) {
        this.incluirExcursiones = incluirExcursiones;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public double getPrecio() {
        return precio;
    }
    //public AgenciadeViaje getAgencia() {
    //   return agencia;
    //}

    //public void setAgencia(AgenciadeViaje agencia) {
    //    this.agencia = agencia;
    //}

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void calcularPrecioTotal(int valorTotal){
        System.out.println("El precio total del paquete de viaje es: " + valorTotal);
    }

    //public void composicionAgencia (AgenciadeViaje agencia) {
    //    this.AgenciadeViaje = agencia;
    //}
}
