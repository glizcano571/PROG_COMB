import java.util.*;
public class Main{
	public static void main(String[] args) {
		System.out.println("cual es tu edad?");//impresion
		Scanner edad = new Scanner(System.in);//creando un input
		//nextline sirve para leer enteros
		//nextInt sirve para leer enteros
		//nextFloat sirve para leer flotante (decimales)
		int age = edad.nextInt();
		
if (age < 10) {
            System.out.println("Aún eres un niño");
        } else if (age < 14) {
            System.out.println("Eres un preadolescente");
        } else if (age < 18) {
            System.out.println("Eres un adolescente");
        } else if (age < 30) {
            System.out.println("Eres un adulto joven");
        } else {
            System.out.println("Eres un adulto");
        }
        
        edad.close();
    }
}