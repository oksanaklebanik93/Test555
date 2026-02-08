package org.example;

import java.util.Scanner;

public class Main{
   public static void main (String[] args) {
  Cat Tom = new Cat("Tom", "Black");
       System.out.println(Tom.name+Tom.color);
       Tom.myr();
       Cat Ron= new Cat("Ron","Grey");
       System.out.println(Ron.name + Ron.color);
       Ron.myr();
       }
   }

