package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz


        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz..");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Yapılacak işlemi giriniz. +, -, *, /, % dan birini seciniz..");
        char opr = input.next().charAt(0);


        switch (opr){
            case '+':
                System.out.println(a + " + "+b + " = " + (a+b));
                break;



        }



    }
}