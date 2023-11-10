public class ErrorVenta {
    private boolean sobreventa;

    public boolean isSobreventa() {
        return sobreventa;
    }
    public void setSobreventa(boolean sobreventa) {
        this.sobreventa = sobreventa;
    }

    public ErrorVenta(boolean sobreventa) {
        this.sobreventa = sobreventa;
    }

    public void Error(boolean isError){
        System.out.println("¿Usted tiene una sobreventa? "+isError);
    }
    public void devolverdinero(boolean isdevolverdinero){
        System.out.println("¿Desea un rembolso? "+isdevolverdinero);
    }
    public void reprogramar(boolean isreprogramar){
        System.out.println("¿Desea reprogramar su viaje? "+isreprogramar);
    }
}

