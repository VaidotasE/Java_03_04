package com.company;
import java.util.Scanner;

public class Main {
    public static final int EXIT_CODE = 0;
    public static void main(String[] args) {
        Main objektas = new Main();
    }

    public Main(){
        float suma = 0;
        float skaicius = 0;
        do {
            skaicius = duokGarantuotaiSkaiciu();
            suma += skaicius;
        } while (skaicius != EXIT_CODE);
        System.out.println("Suma: " + suma);
    }

    public float duokGarantuotaiSkaiciu (){
        float rezultatas = 0;

        Scanner sc = new Scanner(System.in);
        boolean arpavyko = false;
        while (arpavyko == false) {
            System.out.print("Ivesk skaiciu: ");
            try {
                rezultatas = sc.nextFloat();
                arpavyko = true;
            } catch (Exception klaida) {
                System.out.println("Ivestas ne skaicius!");
                sc.next();
            }
        }
        return rezultatas;
    }
}
