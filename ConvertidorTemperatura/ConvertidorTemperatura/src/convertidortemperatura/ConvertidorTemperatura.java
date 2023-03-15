package convertidortemperatura;

import java.util.Scanner;


public class ConvertidorTemperatura {
             double PUNTO_CONGELACION = 32.0;
         double FACTOR_CONVERSION = 5.0 / 9.0;
        double fahrenheit = 50; // temperatura en Fahrenheit
        double celsius; // temperatura en Celsius
        Scanner in = new Scanner(System.in);
        

        public void Calculo(){
                fahrenheit = in.nextInt();
                    celsius = FACTOR_CONVERSION * (fahrenheit - PUNTO_CONGELACION);
        System.out.println(fahrenheit + " grados Fahrenheit = "
                + celsius + " grados Celsius.");
            
        }
    public static void main(String[] args) {

        ConvertidorTemperatura calculo = new ConvertidorTemperatura();
        calculo . Calculo();

    }
}
