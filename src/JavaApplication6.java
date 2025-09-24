import java.util.Scanner;

public class JavaApplication6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Ingresa un número: ");
        int numero = input.nextInt();

       
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        
        input.close();
    }
}

