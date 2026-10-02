import java.util.ArrayList;

public abstract class Estudiante extends Direccion implements Describible, Identificable{
    private String Nombre;
    private String Codigo;
    private ArrayList<Estudiante> listaEstudiantes;

    public Estudiante (String Nombre, String Codigo, int Calle, String Ciudad){
        super(Calle, Ciudad);
        this.Nombre = Nombre;
        this.Codigo = Codigo;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getCodigo(){
        return Codigo;
    }
    public void registrarEstudiante(Estudiante e){
        listaEstudiantes.add(e);
    }
    @Override
    public String describir() {
        return describir();
    }
    @Override
    public String getCodigo2(){
        return Codigo;
    }
}
