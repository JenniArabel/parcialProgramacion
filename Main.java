public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1,123,"Av. Mendoza", 1234, "carlos@gmail.com", "Carlos Ara", 26168080);

        PaqueteViaje paqueteViaje1 = new PaqueteViaje(15, "15 de Enero", "1 de Enero", true, "Mar del Plata", "Mendoza", 200000.00);

        Facturacion facturacion1 = new Facturacion("Carlos Ara", "Tarjeta de credito", 250000.00);

        AgenciaViaje agenciaViaje = new AgenciaViaje("Av. Godoy Cruz 123", "Travel ARA", 2613435, cliente1, paqueteViaje1, facturacion1);

        Alojamiento alojamiento1 = new Alojamiento(3,"2 de Enero","15 de Enero","Hotel Paraiso","Single Room");

        Transporte transporte1 = new Transporte("Bus larga distancia");

        ErrorVenta errorVenta1= new ErrorVenta(false);


        agenciaViaje.crearviaje(true);
        agenciaViaje.crearCliente("Carlos Ara");

        System.out.println(agenciaViaje.getCliente().getNombreCliente()
                + " de DNI: "+ agenciaViaje.getCliente().getDni()
                + " con domicilio en "+ agenciaViaje.getCliente().getDomicilioCalle() + " " + agenciaViaje.getCliente().getDomicilioNumeracion()
                + ", cuyo numero de telefono es "+ agenciaViaje.getCliente().getNumeroTelefono()
                + " y cuyo correo electronico es " + agenciaViaje.getCliente().getEmail()
                + " va a realizar un viaje de cantidad pasajeros: " + agenciaViaje.getCliente().getCantidadPasajeros()
                + ", con la Agencia de viaje llamada: " + agenciaViaje.getnombre()+ " con domicilio en " + agenciaViaje.getdomicilio()
                + ", cuyo numero de telefono es " + agenciaViaje.getnumerotelefonoagencia() + ".");

        System.out.println("El viaje con destino a " + agenciaViaje.getPaqueteviaje().getLugarDestino()
                + " con salida desde " + agenciaViaje.getPaqueteviaje().getLugarOrigen()
                + " tiene fecha de partida el dia " + agenciaViaje.getPaqueteviaje().getFechaSalida()
                + " y tiene fecha de regreso el dia " + agenciaViaje.getPaqueteviaje().getFechaRegreso()
                + " con una duracion de " + agenciaViaje.getPaqueteviaje().getDuracionDias() + " dias."
                + " El costo del paquete es: " + agenciaViaje.getPaqueteviaje().getPrecio()
                + " ¿El pasajero desea contratar excursiones por un precio extra? " + agenciaViaje.getPaqueteviaje().isIncluirExcursiones()
        );

        alojamiento1.setPaqueteViaje(paqueteViaje1);
        transporte1.setPaqueteViaje(paqueteViaje1);

        System.out.println(alojamiento1.getNombreHotel() + " de " + alojamiento1.getCantidadEstrellas() + " estrellas. Recibe turista de la provincia de "
                + alojamiento1.getPaqueteViaje().getLugarOrigen() + ", cuya fecha de CheckIn es el dia " + alojamiento1.getCheckIn()
                + " hasta el dia " + alojamiento1.getCheckOut() +". La habitacion designada para el turista es una " + alojamiento1.getTipoHabitacion() );

        transporte1.transporteAvion(false);
        transporte1.transporteAutobus(true);

        System.out.println("El transporte elegido por el pasajero es via " + transporte1.getTipoDeTransporte()
                + ", cuyo lugar de salida es " + transporte1.getPaqueteViaje().getLugarOrigen()
                + " con destino a " + transporte1.getPaqueteViaje().getLugarDestino() );

        agenciaViaje.getCliente().cancelarViaje(false);
        agenciaViaje.getCliente().reservarViaje(true);
        agenciaViaje.realizarVenta(true);
        agenciaViaje.getPaqueteviaje().calcularPrecioTotal(250000);

        System.out.println("Luego de que la agencia calculara el costo del paquete sumado al extra de las excursiones, el monto total del cliente "
                + agenciaViaje.getFacturacion().getCliente() +  " es de " + agenciaViaje.getFacturacion().getMontoTotal()
                + " y cuyo método de pago elegido es: " + agenciaViaje.getFacturacion().getMetodoPago());
        agenciaViaje.getFacturacion().procesarPago(true);
        agenciaViaje.getFacturacion().generarRecibo(true);


        errorVenta1.Error(false);
        errorVenta1.devolverdinero(false);
        errorVenta1.reprogramar(false);

        System.out.println("Llegado el dia del viaje, el hotel los recibe con un mensaje de bienvenida:");
        alojamiento1.mensajeBienvenida("Les deseamos una coordial bienvenida y una maravillosa estadía");
    }
}
