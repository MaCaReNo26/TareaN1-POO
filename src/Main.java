import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ejercicio 1 como actualizacion
        System.out.println("------------- ||| EJERCICIO 1 |||-------------");
        int cantidad;
        float precio, total;
        System.out.println("-----|| REGISTRO DE INVENTARIOS DE PLÁSTICOS ||-----");
        System.out.println("Ingrese el cuantos productos hay en stock: ");
        cantidad = sc.nextInt();
        System.out.println("Ingrese el precio unitario: ");
        precio = sc.nextFloat();
        total = cantidad * precio;
        System.out.println("Valor total del stock: "+total);

        System.out.println("------------- ||| EJERCICIO 2 |||-------------");
        System.out.println("-----|| REGISTRO DE CLIENTES ||-----");
        System.out.println("Ingrese la cantidad de clientes a ingresar: ");
        int cant = sc.nextInt();
        sc.nextLine();
        ArrayList<String[]> clientes = new ArrayList<>();
        for (int i = 0; i < cant; i++) {
            String cedula = "", nombres = "", telefono = "", email = "";
            System.out.println("--- || Ingresando datos del cliente N"+(i+1)+" ||---");
            while(cedula.trim().isEmpty()){
                System.out.println("Ingrese su cedula: ");
                cedula = sc.nextLine();
            }while(nombres.trim().isEmpty()){
                System.out.println("Ingrese sus nombres: ");
                nombres = sc.nextLine();
            }while(telefono.trim().isEmpty()){
                System.out.println("Ingrese su telefono: ");
                telefono = sc.nextLine();
            }while(email.trim().isEmpty()){
                System.out.println("Ingrese su email: ");
                email = sc.nextLine();
            }
            clientes.add(new String[]{cedula, nombres, telefono, email});
        }
        for (int i = 0; i < cant; i++) {
            String[] c = clientes.get(i);
            System.out.println("-----|| Ficha del cliente N"+(i+1)+" ||-----");
            System.out.println("CEDULA: "+c[0]);
            System.out.println("NOMBRE: "+c[1]);
            System.out.println("TELEFONO: "+c[2]);
            System.out.println("EMAIL: "+c[3]);
        }

        System.out.println("------------- ||| EJERCICIO 3 |||-------------");
        System.out.println("-----|| REQUISITOS PARA EL CUARTEL ||-----");
        int edad = 0;
        double altura = 0;
        while(edad <= 0){
            System.out.println("Ingrese su edad: ");
            edad = sc.nextInt();
        }while(altura <= 0){
            System.out.println("Ingrese su altura: ");
            altura = sc.nextDouble();
        }
        if (edad >= 18 && altura >= 1.60) {
            System.out.println("Felicidades Usted cumple con los requisitos :D");
        } else {
            System.out.println("Usted no cumple con los requisitos :C");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("1. If");
        System.out.println("2. while");
        System.out.println("3. for");
        System.out.println("Ingrese la opcion: ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                String usuario = "Alex";
                String clave = "1234";
                System.out.println("Ingrese su usuario: ");
                String a = sc.next();
                System.out.println("Ingrese su contraseña: ");
                String b = sc.next();

                if(usuario.equals(a) && clave.equals(b) ){
                    System.out.println("Acceso correcto");
                }else{
                    System.out.println("Usuario o contraseña incorrectos");
                }
            case 2:
                String contra1 = "alex123", contra = "";
                while(!(contra1.equals(contra))){
                    System.out.println("Ingrese su contraseña: ");
                    contra = sc.nextLine();
                }
            case 3:
                System.out.println("Ingrese la tabla de multiplicar que necesita: ");
                int num = sc.nextInt();
                for (int i = 0; i < 10; i++) {
                    System.out.println((i+1)+" * "+num+" = "+(i+1)*num);
                }
        }
    }
}