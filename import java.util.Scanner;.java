import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("¿Cuál es tu edad?"); // impresión
        Scanner edad = new Scanner(System.in); // creando un input
        
        // nextLine sirve para leer textos
        // nextInt sirve para leer enteros
        // nextFloat sirve para leer flotante (decimales)
        int age = edad.nextInt();
        
        if (age < 10) {
            System.out.println("Aún eres un niño");
        } else {
            // Si no es menor de 10, entra y vuelve a preguntar
            if (age >= 10 && age < 14) {
                System.out.println("Eres un preadolescente");
            } else {
                // Si tampoco es preadolescente, entra y vuelve a preguntar
                if (age >= 14 && age < 18) {
                    System.out.println("Eres un adolescente");
                } else {
                    // Y sucesivamente
                    if (age >= 18 && age < 30) {
                        System.out.println("Eres un adulto joven");
                    } else {
                        System.out.println("Eres un adulto");
                    }
                }
            }
        }
        
        edad.close();
    }
}