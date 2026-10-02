public class Direccion {
    public int Calle;
    public String Ciudad;

    public Direccion(int Calle, String Ciudad){
        this.Calle = Calle;
        this.Ciudad = Ciudad;
    }
    public int getCalle() {
        return Calle;
    }
    public String getCiudad(){
        return Ciudad;
    }
}
