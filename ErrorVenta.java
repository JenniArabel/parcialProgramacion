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
        System.out.println("Esta contratacion presenta algun error de sobreventa? "+isError);
    }
    public void devolverdinero(boolean isdevolverdinero){
        System.out.println("Por lo tanto, se requiere de alguna medida como: reembolso? "+isdevolverdinero);
    }
    public void reprogramar(boolean isreprogramar){
        System.out.println("o reprogramar fecha de viaje? "+isreprogramar);
    }
}

