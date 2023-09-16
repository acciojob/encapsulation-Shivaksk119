package com.driver;

public class Main {

    public static void main(String[] ags) {

        RWOnly obj = new RWOnly();

        //obj.name = "Shiva";  Show error .name variable is not accessible in this class

        obj.setName("Shiva");

    }
  
}