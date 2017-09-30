package Control;

import java.util.Scanner;

class ControlPrincipal{
    public static void main(String[] args) {
        
        System.out.println("Ingrese los numeros a procesar: ");
        
        Scanner inputUsuario = new Scanner(System.in);
        double num1 = inputUsuario.nextDouble();
        double num2 = inputUsuario.nextDouble();
        
        double suma = num1 + num2;
        System.out.println("SUMA = " + suma);
        
        double division = num1 / num2;
        System.out.println("DIVISION = " + division);
    }
}