import java.util.Scanner;

/**
 * Created by Ajay Mehta on 3/18/2017.
 */


/*
Given an int n, return true if it is within 10 of 100 or 200.
        Note: Math.abs(num) computes the absolute value of a number.

        nearHundred(93) → true
        nearHundred(90) → true
        nearHundred(89) → false
*/



public class P7NearHundred {


    // NOtes:   Absolute means positive value.. ex. absolute value of 6 is 6  ...absoulte value of -6 is also 6

    static Scanner sc;

    static  P7NearHundred nearHundred;



    public boolean nearHundred(int n) {

        return  Math.abs(100 - n) <= 10 || Math.abs(200 - n) <=10;
    }

// ex if you enter 93 it will give 7 wich is smaller than 10 true .. if you enter -110 then ans Math.abs(-10) that is 10 n then also its true


    public void Inputing(){

        System.out.print("Enter a number :  ");
    }


    public void output(int number) {

        System.out.println(nearHundred.nearHundred(number));

    }




    // you can create your own class object in main method..n can call other methods of class

    public static void main(String []args){

        sc = new Scanner(System.in);



        nearHundred = new P7NearHundred();

        nearHundred.Inputing();

        nearHundred.output(sc.nextInt());


      // calling second time
        nearHundred.Inputing();

        nearHundred.output(sc.nextInt());


        // calling third time
        nearHundred.Inputing();

        nearHundred.output(sc.nextInt());







    }

}
