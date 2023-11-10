public class AgenciaViaje {
    private String domicilio;
    private String nombre;
    private int numerotelefonoagencia;
    private Cliente cliente;
    private PaqueteViaje paqueteviaje;
    private Facturacion facturacion;

    public AgenciaViaje(String domicilio, String nombre, int numerotelefonoagencia, Cliente cliente, PaqueteViaje paqueteviaje, Facturacion facturacion) {
        this.domicilio = domicilio;
        this.nombre = nombre;
        this.numerotelefonoagencia = numerotelefonoagencia;
        this.cliente = cliente;
        this.paqueteviaje = paqueteviaje;
        this.facturacion = facturacion;
    }
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

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public PaqueteViaje getPaqueteviaje() {
        return paqueteviaje;
    }

    public void setPaqueteviaje(PaqueteViaje paqueteviaje) {
        this.paqueteviaje = paqueteviaje;
    }

    public void crearCliente(String nombreCliente) {
        System.out.println("Creando viaje a nombre de: "+ nombreCliente);
    }

    public void crearviaje(boolean isCrear){
        System.out.println("¿Desea la empresa crear un nuevo viaje en el sistema? "+ isCrear);
    }

    public Facturacion getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(Facturacion facturacion) {
        this.facturacion = facturacion;
    }

    public void realizarVenta(boolean isRealizarVentas){
        System.out.println("La empresa recibe el aceptamiento del cliente, desea realizar venta? "+ isRealizarVentas);
    }

     public void composicionCliente(Cliente cliente) {
        this.cliente=cliente;
    }

    public void composicionPaqueteViaje(PaqueteViaje paqueteviaje) {
        this.paqueteviaje=paqueteviaje;
    }
}

