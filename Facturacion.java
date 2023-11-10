public class Facturacion {
    private String cliente;
    private String metodoPago;
    private double montoTotal;

    public Facturacion(String cliente, String metodoPago, double montoTotal) {
        this.cliente = cliente;
        this.metodoPago = metodoPago;
        this.montoTotal = montoTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void generarRecibo(boolean recibo){
        System.out.println("Recibo generado? " + recibo);
    }
    public void procesarPago (boolean pago){
        System.out.println("Desea procesar pago? " + pago);
    }


}