package com.company;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> primeFactors = new TreeSet<>();
        if(n%2 == 0){
            primeFactors.add(2);
        }
        for(int i=3;i<=n/2;i += 2){
            if(n%i == 0){
                primeFactors.add(i);
            }
        }
        if(primeFactors.isEmpty()){
            System.out.println(n + " is a prime number.");
        }
        else{
            System.out.print(n + " = ");
            for(int i: primeFactors){
                while(n%i==0){
                    System.out.print(i + " * ");
                    n /= i;
                }
            }
            System.out.print("\b\b\b");
        }
    }
}
