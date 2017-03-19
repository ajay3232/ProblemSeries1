import java.util.Scanner;

/**
 * Created by Ajay Mehta on 3/18/2017.
 */



/*
We have a loud talking parrot.
 The "hour" parameter is the current hour time in the range 0..23.
 We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

        parrotTrouble(true, 6) → true
        parrotTrouble(true, 7) → false
        parrotTrouble(false, 6) → false
*/



public class P5ParrotTrouble {

    static Scanner sc;

    static  P5ParrotTrouble parrotTrouble;



    public boolean parrotTrouble(boolean talking, int hour) {

        if(talking && hour <7 || talking && hour > 20) {
            return true;
        }
        return false;
    }

/*

    public boolean parrotTrouble(boolean talking, int hour) {

        if(talking && (hour <7 ||  hour > 20)) {  // other way if you want to make hour as a single condition ..you have to put brackets both side
            return true;
        }
        return false;
    }

*/

// other way around ...

/*

    public boolean parrotTrouble(boolean talking, int hour) {

        return (talking && (hour <7 ||  hour > 20)) ;

    }
*/



    public void Inputing(){

        System.out.print("Enter value of talking and enter the hour :  ");
    }


    public void output1(boolean talking , int  hour) {   // range  0 to 23  (24 hours watch) current time is current hour

        System.out.println(parrotTrouble.parrotTrouble(talking, hour));

    }


    public void output2(boolean talking , int  hour) {   // range  0 to 23  (24 hours watch) current time is current hour

        System.out.println(parrotTrouble.parrotTrouble(talking, hour));

    }


    public void output3(boolean talking , int  hour) {   // range  0 to 23  (24 hours watch) current time is current hour

        System.out.println(parrotTrouble.parrotTrouble(talking, hour));

    }


    // you can create your own class object in main method..n can call other methods of class

    public static void main(String []args){

        sc = new Scanner(System.in);

        parrotTrouble = new P5ParrotTrouble();


        parrotTrouble.Inputing();

        parrotTrouble.output1(sc.nextBoolean(), sc.nextInt());

        // calling output 2

        parrotTrouble.Inputing();

        parrotTrouble.output2(sc.nextBoolean(), sc.nextInt());

        // calling output 3

        parrotTrouble.Inputing();

        parrotTrouble.output3(sc.nextBoolean(), sc.nextInt());


    }

}   // end of class

//****************************************************************************

// checked with
                      //      Expected	    Run
/*      parrotTrouble(true, 6) → true	    true	OK
        parrotTrouble(true, 7) → false	    false	OK
        parrotTrouble(false, 6) → false 	false	OK
        parrotTrouble(true, 21) → true	    true	OK
        parrotTrouble(false, 21) → false	false	OK
        parrotTrouble(false, 20) → false	false	OK
        parrotTrouble(true, 23) → true	    true	OK
        parrotTrouble(false, 23) → false	false	OK
        parrotTrouble(true, 20) → false	    false	OK
        parrotTrouble(false, 12) → false	false	OK


        */

