import java.util.Scanner;

/**
 * Created by Ajay Mehta on 3/18/2017.
 */



/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

        diff21(19) → 2
        diff21(10) → 11
        diff21(21) → 0
*/



public class P4Diff21 {

    static Scanner sc;

    static  P4Diff21 diff21;

    public int diff21(int n) {
        if(n <= 21) {
            return 21 - n;
        }

        return 2 * (n - 21);

    }


    public void Inputing(){

        System.out.print("Enter a number :  ");
    }


    public void output1(int number) {

        System.out.println(diff21.diff21(number));

    }

    public void output2(int number) {

        System.out.println(diff21.diff21(number));

    }

    public void output3(int number) {

        System.out.println(diff21.diff21(number));

    }




    // you can create your own class object in main method..n can call other methods of class

    public static void main(String []args){

        sc = new Scanner(System.in);

        diff21 = new P4Diff21();

        diff21.Inputing();

        diff21.output1(sc.nextInt());

        // calling output2

        diff21.Inputing();

        diff21.output1(sc.nextInt());

        //calling output3

        diff21.Inputing();

        diff21.output1(sc.nextInt());





    }




}
