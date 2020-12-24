package com.bergit.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        FizzBuzzProcess fizzBuzzProcess = new FizzBuzzProcess();
        for(int i=1;i<100;i++){
            System.out.println(fizzBuzzProcess.getResult(i));
        }
    }
}
