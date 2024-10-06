import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("***Datos Personales***");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre y apellido: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        System.out.print("Ingrese su numero de cedula: ");
        int cedula = scanner.nextInt();


        System.out.println("Nombre: "+nombre);
        System.out.println("Nacionalidad "+nacionalidad);
        System.out.println("cedula: "+cedula);
    }
}

