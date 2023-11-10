public class Cliente {
    private int cantidadPasajeros;
    private int dni;
    private String domicilioCalle;
    private int domicilioNumeracion;
    private String email;
    private String nombre;
    private int numeroTelefono;
    //private AgenciaDeViaje agencia;
    private Facturacion facturacion;


    public Cliente(int cantidadPasajeros, int dni, String domicilioCalle, int domicilioNumeracion, String email, String nombre, int numeroTelefono) {
        this.cantidadPasajeros = cantidadPasajeros;
        this.dni = dni;
        this.domicilioCalle = domicilioCalle;
        this.domicilioNumeracion = domicilioNumeracion;
        this.email = email;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

   // public Cliente(AgenciaDeViaje agencia, Facturacion facturacion) {
     //   this.agencia = agencia;
      //  this.facturacion = facturacion;
   // }

    //public AgenciaDeViaje getAgencia() {
     //   return agencia;
   // }

   // public void setAgencia(AgenciaDeViaje agencia) {
    //    this.agencia = agencia;
   // }

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public void cancelarViaje(boolean iscancelado){
        System.out.println("Desea cancelar su viaje: "+ iscancelado);
    }
    public void reservarViaje(boolean reservado){ System.out.println("Desea reservar su viaje: "+ reservado); }

    public void composicionFacturacion (Facturacion facturacion1 ){
        this.facturacion = facturacion1;
    }


}
