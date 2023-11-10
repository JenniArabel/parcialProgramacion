public class AgenciaViaje {
    private String domicilio;
    private String nombre;
    private int numerotelefonoagencia;
    //private Cliente cliente;
    //private PaqueteViaje paqueteviaje;

    public String getdomicilio() {
        return domicilio;
    }
    public void setdomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getnombre() {
        return nombre;
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnumerotelefonoagencia() {
        return numerotelefonoagencia;
    }
    public void setnumerotelefonoagencia(int numerotelefonoagencia) {
        this.numerotelefonoagencia = numerotelefonoagencia;
    }

    //public Cliente getCliente() {
    //    return cliente;
    //}
    //public void setCliente(Cliente cliente) {
    //    this.cliente = cliente;
    //}

    //public PaqueteViaje getPaqueteviaje() {
    //    return paqueteviaje;
    //}

    //public void setPaqueteviaje(PaqueteViaje paqueteviaje) {
    //    this.paqueteviaje = paqueteviaje;
    //}

    public void crearCliente(String nombreCliente) {
        System.out.println("Nombre del cliente: "+ nombreCliente);
    }

    public void crearviaje(boolean isCrear){
        System.out.println("¿Desea crear paquete de viaje? "+ isCrear);
    }

    public void realizarVenta(boolean isRealizarVentas){
        System.out.println("¿Desea realizar la venta? "+ isRealizarVentas);
    }

    // public void composicionCliente(Cliente cliente) {
    //    this.cliente=cliente;
    //}

    //public void composicionPaqueteViaje(PaqueteViaje paqueteviaje) {
    //    this.paqueteviaje=paqueteviaje;
    //}
}

