public class Cliente {
    private int cantidadPasajeros;
    private int dni;
    private String domicilioCalle;
    private int domicilioNumeracion;
    private String email;
    private String nombreCliente;
    private int numeroTelefono;
    private AgenciaViaje agencia;
    private Facturacion facturacion;


    public Cliente(int cantidadPasajeros, int dni, String domicilioCalle, int domicilioNumeracion, String email, String nombreCliente, int numeroTelefono) {
        this.cantidadPasajeros = cantidadPasajeros;
        this.dni = dni;
        this.domicilioCalle = domicilioCalle;
        this.domicilioNumeracion = domicilioNumeracion;
        this.email = email;
        this.nombreCliente = nombreCliente;
        this.numeroTelefono = numeroTelefono;
    }

    //public Cliente(AgenciaViaje agencia, Facturacion facturacion) {
    //    this.agencia = agencia;
    //    this.facturacion = facturacion;
    //}

    public AgenciaViaje getAgencia() {
        return agencia;
    }

    public void setAgencia(AgenciaViaje agencia) {
      this.agencia = agencia;
    }

    public Facturacion getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(Facturacion facturacion) {
        this.facturacion = facturacion;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilioCalle() {
        return domicilioCalle;
    }

    public void setDomicilioCalle(String domicilioCalle) {
        this.domicilioCalle = domicilioCalle;
    }

    public int getDomicilioNumeracion() {
        return domicilioNumeracion;
    }

    public void setDomicilioNumeracion(int domicilioNumeracion) {
        this.domicilioNumeracion = domicilioNumeracion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public void cancelarViaje(boolean isCancelado){
        System.out.println("Desea el cliente, antes de facturar, cancelar el viaje? " + isCancelado);
    }
    public void reservarViaje(boolean reservado){ System.out.println("Por ende, desea reservar viaje y continuar con la facturacion? "+ reservado); }

    public void composicionFacturacion (Facturacion facturacion1 ){
        this.facturacion = facturacion1;
    }


}
