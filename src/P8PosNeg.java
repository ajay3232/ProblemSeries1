import java.util.Scanner;

/**
 * Created by Ajay Mehta on 3/19/2017.
 */



/*Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

        posNeg(1, -1, false) → true
        posNeg(-1, 1, false) → true
        posNeg(-4, -5, true) → true*/


public class P8PosNeg {

    static Scanner sc;

    static P8PosNeg posNeg;


    public boolean posNeg(int a, int b, boolean negative) {

        if (a > 0 && b < 0 && !negative || a < 0 && b > 0 && !negative || a < 0 && b < 0 && negative) {
            return true;
        }
        return false;

    }


   /* // in a shorter way


    public boolean posNeg(int a, int b, boolean negative) {

        return (a > 0 && b <0 && !negative ||  a<0 && b>0 && !negative || a<0 && b<0 && negative);


    }*/

    // other way around

/*    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }*/


    public void Inputing() {

        System.out.print("Enter value of a , value of b and value of negative :  ");
    }


    public void output(int a, int b, boolean negative) {

        System.out.println(posNeg.posNeg(a, b, negative));

    }


    // you can create your own class object in main method..n can call other methods of class

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        posNeg = new P8PosNeg();

        posNeg.Inputing();

        posNeg.output(sc.nextInt(), sc.nextInt(), sc.nextBoolean());

        //calling 2nd time
        posNeg.Inputing();
        posNeg.output(sc.nextInt(), sc.nextInt(), sc.nextBoolean());


        //calling 3rd time
        posNeg.Inputing();
        posNeg.output(sc.nextInt(), sc.nextInt(), sc.nextBoolean());

    }

}  // end of class
    //********************************************************************************88

// checked with ....

/*
        posNeg(1,-1,false) → true true OK
        posNeg(-1,1,false) → true true OK
        posNeg(-4,-5,true) → true true OK
        posNeg(-4,-5,false)→false false OK
        posNeg(-4,5,false) → true true OK
        posNeg(-4,5,true) → false false OK
        posNeg(1,1,false) → false false OK
        posNeg(-1,-1,false) → false false OK
        posNeg(1,-1,true) → false false OK
        posNeg(-1,1,true) → false false OK
        posNeg(1,1,true) → false false OK
        posNeg(-1,-1,true) → true true OK
        posNeg(5,-5,false) → true true OK
        posNeg(-6,6,false) → true true OK
        posNeg(-5,-6,false) → false false OK
        posNeg(-2,-1,false) → false false OK
        posNeg(1,2,false) → false false OK
        posNeg(-5,6,true) → false false OK
        posNeg(-5,-5,true) → true true OK

        */
