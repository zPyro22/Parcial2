import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

public static <EstudianteNoEncontradoException extends Throwable> void main(String[] args){
Scanner Scanner = new Scanner(System.in);
RegistrarEstudiantes registro = new RegistrarEstudiantes();
int opcion = 0;
    try {
        do {
            System.out.println("\n======= Registro Estudiantes ========");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Listar Estudiante");
            System.out.println("3. Buscar Estudiante");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion:");

            try {
                opcion = Integer.parseInt(Scanner.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.print("Codigo:");
                        String Codigo = Scanner.nextLine();
                        System.out.print("Nombre");
                        String Nombre = Scanner.nextLine();
                        System.out.print("Ciudad:");
                        String Ciudad = Scanner.nextLine();
                        System.out.print("Calle:");
                        String Calle = Scanner.nextLine();

                        registro.agregar(
                                Codigo,
                                Nombre,
                                new Direccion(Ciudad, Calle)
                        );
                        System.out.println("Estudiante agregado exitosamente.");
                        break;
                    case 2:
                        registro.listar();
                        break;

                    case 3:
                        System.out.println("Ingrese el codigo.");
                        String codigoBuscar = Scanner.nextLine();
                        try {
                            Estudiante estudiante =
                                    registro.buscar(codigoBuscar);
                            System.out.println(
                                    estudiante.describir()
                            );
                        } catch (EstudianteNoEncontradoException e) {
                            System.out.println(
                                    "Error:" + e.getMessage()
                            );
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println(
                                "Opcion invalida"
                        );
                }
            } catch (NumberFormatException e) {
                System.out.println(
                        "Error: debe ingresar una opcion numerica."
                );
            }
        catch(IllegalArgumentException){
            System.out.println(
                    "Error:" + e.getMessage()
            );
        }
     finally {

    } while (opcion !=0);{
    System.out.print("Operacion finalizada");{
    }
    }
}
}