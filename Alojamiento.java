public class Alojamiento {
    private int cantidadEstrellas;
    private String checkIn;
    private String checkOut;
    private String nombreHotel;
    private String tipoHabitacion;
    private PaqueteViaje paqueteViaje;

    public Alojamiento(int cantidadEstrellas, String checkIn, String checkOut, String nombreHotel, String tipoHabitacion) {
        this.cantidadEstrellas = cantidadEstrellas;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.nombreHotel = nombreHotel;
        this.tipoHabitacion = tipoHabitacion;
    }
    public Alojamiento(PaqueteViaje paqueteViaje) {
        this.paqueteViaje = paqueteViaje;
    }
    public int getCantidadEstrellas() {
        return cantidadEstrellas;
    }

    public void setCantidadEstrellas(int cantidadEstrellas) {
        this.cantidadEstrellas = cantidadEstrellas;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public PaqueteViaje getPaqueteViaje() {
        return paqueteViaje;
    }

    public void setPaqueteViaje(PaqueteViaje paqueteViaje) {
        this.paqueteViaje = paqueteViaje;
    }

    public void mensajeBienvenida(String bienvenida){
        System.out.println("Bienvenido a nuestro " + nombreHotel);
    }

    public void agregarPaqueteViaje (PaqueteViaje paqueteViaje1){
        this.setPaqueteViaje(paqueteViaje1);
    }
}
