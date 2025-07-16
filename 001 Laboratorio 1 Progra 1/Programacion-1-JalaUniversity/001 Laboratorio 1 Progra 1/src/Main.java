import java.lang.reflect.Array;
import java.util.Scanner;
import java.text.DecimalFormat; // Per format of the results
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

//        Ejercicio 1: Adivina el Resultado (entrada libre + lógica)
        System.out.print("Enter you name please: ");
        String name = lee.nextLine();
        System.out.print("Enter first number: ");
        int first_number = lee.nextInt();
        System.out.print("Enter second number: ");
        int second_number = lee.nextInt();
        while (second_number == 0) {
            System.out.print("Enter a valid value: ");
            second_number = lee.nextInt();
        }
        System.out.print("Enter thirty number: ");
        int third_number = lee.nextInt();
        while (third_number == 0) {
            System.out.print("Enter a valid value: ");
            third_number = lee.nextInt();
        }
        int result = 0;

        // Caso n1 = 1, n2 = 2, n3 = 3
//        1*2+3
//        1+2*3
//        1+2+3
//        1*2*3
//        1/2/3
//        1/2*3
//        1*2/3
//        1+2/3
//        1/2+3
        int operation1 = first_number + second_number + third_number;
        int operation2 = first_number * second_number * third_number;
        int operation3 = first_number * second_number + third_number;
        int operation4 = first_number + second_number * third_number;
        int operation5 = first_number / second_number + third_number;
        int operation6 = first_number + second_number / third_number;
        int operation7 = first_number * second_number / third_number;
        int operation8 = first_number / second_number * third_number;
        int[] vector = new int[8];
        vector[0] = operation1;
        vector[1] = operation2;
        vector[2] = operation3;
        vector[3] = operation4;
        vector[4] = operation5;
        vector[5] = operation6;
        vector[6] = operation7;
        vector[7] = operation8;

        // Desea = want
        System.out.println("Values: " + Arrays.toString(vector));
        System.out.print(" Enter the value you want: ");
        int want_value = lee.nextInt();
        boolean sw = false;
        for (int i = 0; i < vector.length; i++) {
            if (want_value == vector[i]) {
                result = vector[i];
                sw = true;
            }
        }
        if (!sw) {
            System.out.println("You entered a invalid value, please try again");
        } else {
            System.out.println("Hi " + name + "! You entered three numbers: " + first_number + ", " + second_number + ", " + third_number);
            // Averiguemos que operacion se utilizo para obtenerlo
            System.out.println("Let's find out what operation was used to get: " + result);
            if (result == operation1) {
                System.out.println(" Plus and Plus");
                System.out.println(first_number + " + " + second_number + " + " + third_number);
            } else if (result == operation2) {
                System.out.println(" Product and product ");
                System.out.println("(" + first_number + " * " + second_number + ") * " + third_number);
            } else if (result == operation3) {
                System.out.println(" Product and plus ");
                System.out.println("(" + first_number + " * " + second_number + ") + " + third_number);
            } else if (result == operation4) {
                System.out.println(" Plus and product ");
                System.out.println(first_number + " + (" + second_number + " * " + third_number + ")");
            } else if (result == operation5) {
                System.out.println(" Division and plus ");
                System.out.println("(" + first_number + " / " + second_number + ") + " + third_number);
            } else if (result == operation6) {
                System.out.println(" Plus and division ");
                System.out.println(first_number + " + (" + second_number + " / " + third_number + ")");
            } else if (result == operation7) {
                System.out.println(" Product and division ");
                System.out.println("(" + first_number + " * " + second_number + ") / " + third_number);
            } else if (result == operation8) {
                System.out.println(" Division and product ");
                System.out.println(first_number + " / (" + second_number + " * " + third_number + ")");
            }
        }

//        Ejercicio 2: Calculadora Gamer – FPS y estadísticas
//        Instrucción:
//        Crea un programa que simule estadísticas de un jugador gamer o deportista. Solicita los siguientes datos:
//        Cantidad de partidas jugadas
//        Cantidad de victorias
//        Tiempo promedio de juego por partida (en minutos)
//
//        Calcula:
//        Porcentaje de victorias
//        Total de minutos jugados
//        Horas jugadas (formato decimal con 2 decimales)

        System.out.print("Enter the number of games played: ");
        int games_played = lee.nextInt();
        System.out.print("Enter the number of wins: ");
        int number_wins = lee.nextInt();
        // Ingrese el tiempo promedio de juego por partida (en minutos)
        System.out.print("Enter the average of game per departure: (in minutes) ");
        // Promedio por partida
        int average_perDeparture = lee.nextInt();
        // Para el redondeo con dos decimales
        DecimalFormat df = new DecimalFormat("#.##");

        double percentage_ofWins = ((double) number_wins / games_played) * 100;
        int total_minutes = average_perDeparture * games_played;
        double hours_played = (double) total_minutes / 60;


        System.out.print("Result: \n");
        System.out.print("Percentage of wins: " + df.format(percentage_ofWins) + "%\n");
        System.out.print("Total of minutes played: " + total_minutes + "\n");
        System.out.print("Hours played: " + df.format(hours_played) + "\n\n");

//========================================================================================================================================================================

//        Ejercicio 3: Precios de conciertos o torneos con validación
//        Instrucción:
//        Simula la compra de una entrada para un concierto o torneo.
//
//        Solicita:
//        Tipo de evento: concierto / torneo / otro
//        Precio base
//        Edad del usuario
//
//        Reglas:
//        Si tiene entre 15 y 18 años, se aplica 20% de descuento.
//        Si es mayor de 50, aplica 30%.
//        Si es entre 18 y 50, precio normal.

        System.out.print("Enter type of event: ");
        String type_ofEvent = lee.nextLine();
        System.out.print("Enter base price: ");
        double base_price = lee.nextDouble();
        System.out.print("Enter age of user: ");
        int age_ofUser = lee.nextInt();
        // descuento =discount
        double discount = 0.0;

        if (age_ofUser >= 15 && age_ofUser <= 18) {
            discount = base_price * 0.2;
        } else if (age_ofUser > 50) {
            discount = base_price * 0.3;
        } else if (age_ofUser > 18 && age_ofUser <= 50) {
//            No se aplica descuento, no discount applied
            System.out.print(" No discount applied");
        } else {
            System.out.print(" Enter a valid age");
        }
        base_price = base_price - discount;


        System.out.print(" Result: \n");
        System.out.print("Event: " + type_ofEvent + "\n");
        System.out.print("Age: " + age_ofUser + "\n");
        if (discount != 0.0) {
            System.out.print("End Price: " + base_price + "(" + discount + " % discount applied)\n");
        } else {
            System.out.print("End Price: " + base_price + "\n");
        }

//========================================================================================================================================================================
//        Ejercicio 4: Elige tu carrera y calcula tu horario ideal
//        Instrucción:
//
//        Permite al usuario seleccionar su área de interés:
//
//            A. Ingeniería civil
//            B. Ciberseguridad
//            C. Análisis de datos
//            D. Electrónica
//            E. Diseño y arte
//
//        Según la carrera elegida, el programa debe sugerir:
//            Un lenguaje de programación útil
//            Horas semanales ideales para estudiar
//            Proyecto simple para empezar

        System.out.print("Enter you area of interest: ");
        String area_ofInterest = lee.nextLine();

        switch (area_ofInterest) {
            case ("Civil Engineering"):
                // Lenguaje util = useful language
//                Suggested project = Proyecto sugerido
                System.out.println("Useful Language: Python for started");
                System.out.println("Ideal Hours to study: 10-12 hours");
                System.out.println("Suggested project: Simulator simple of loads using basic models");
                break;

            case ("CyberSecurity"):
                System.out.println("Useful Language: Python for started");
                System.out.println("Ideal Hours to study: 12 hours");
                System.out.println("Suggested project: Script that detects open ports on a local network");
                break;

//          Analisis de datos = Data Analisys
            case ("Data Analisys"):
                System.out.println("Useful Language: Python for started to libraries it contains");
                System.out.println("Ideal Hours to study: 10-14 hours");
                System.out.println("Suggested project: Analisys of a public dataset with graphics");
                break;
//          Electronica = Electronic
            case ("Electronic"):
                System.out.println("Useful Language: C/C++ for started");
                System.out.println("Ideal Hours to study: 8-10 hours");
                System.out.println("Suggested project: Control of led light with Arduino and basic sensors");
                break;
//          Disenio y arte = Design and Art
            case ("Design and Art"):
                System.out.println("Useful Language: JS (for web design with html and css)");
                System.out.println("Ideal Hours to study: 8-12 hours");
                System.out.println("Suggested project: Personal portfolio on a web page with animations and attractive web design");
                break;
            default:
                System.out.print("Please enter valid data");
        }


    }
}