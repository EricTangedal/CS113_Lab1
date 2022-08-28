package src;

public class Main {
    public static void main(String[] args){
        for(int i=1; i<101; i++){
            //If i is a multiple of 3 and a multiple of 5, print "FizzBuzz"
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            //If i is a multiple of 3, print "Fizz"
            else if(i%3==0){
                System.out.println("Fizz");
            }
            //If i is a multiple of 5, print "Buzz"
            else if(i%5==0){
                System.out.println("Buzz");
            }
            //else, print i
            else {
                System.out.println(i);
            }
        }
    }
}
/*
Eric Tangedal
CS113-1971
Lab1
Version 1.0
8/28/2022
 */