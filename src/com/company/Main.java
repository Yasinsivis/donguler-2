package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  int total=0, number;
        Scanner input=new Scanner(System.in);

      do {
          System.out.print("Sayı Giriniz:");
          number=input.nextInt();
          if(number%2==0 && number%4==0){
              total+=number;
          }
      }while (number%2 != 1);

      System.out.println("Sayıların Toplamı :"+total);

    }
}
