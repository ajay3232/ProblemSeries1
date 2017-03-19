import java.util.Scanner;

/**
 * Created by Ajay Mehta on 3/18/2017.
 */



/*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
        We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

        monkeyTrouble(true, true) → true
        monkeyTrouble(false, false) → true
        monkeyTrouble(true, false) → false*/



public class P2MonkeyTrouble {

    static Scanner sc;



    static P2MonkeyTrouble monkeyTrouble;   // class object made in global so that you could use it in other methods as well.

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if(aSmile && bSmile || !aSmile && !bSmile) {

            return true;
        }

        return false;

    }

    // shorter way
/*

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return(aSmile && bSmile || !aSmile && !bSmile);
    }

*/

// more shorter way

/*    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {  // when both are equal...if they both are smiling both are equal ..if they both are not smiling ..then also both are equal
        return (aSmile == bSmile);
    }*/




    public void Inputing() {



        System.out.print("Enter aSmile Value & bSmile Value ");


    }


    public void output1(boolean aSmile , boolean bSmile) {

        System.out.println(monkeyTrouble.monkeyTrouble(aSmile, bSmile));

    }

    public void output2(boolean aSmile , boolean bSmile) {

        System.out.println(monkeyTrouble.monkeyTrouble(aSmile, bSmile));

    }

    public void output3(boolean aSmile , boolean bSmile) {

        System.out.println(monkeyTrouble.monkeyTrouble(aSmile, bSmile));

    }


    // you can create your own class object in main method..n can call other methods of class

    public static void main(String []args){

        sc = new Scanner(System.in);

         monkeyTrouble = new P2MonkeyTrouble();

         monkeyTrouble.Inputing();

        monkeyTrouble.output1( sc.nextBoolean(), sc.nextBoolean());

        monkeyTrouble.Inputing();

        monkeyTrouble.output2(sc.nextBoolean(), sc.nextBoolean());

        monkeyTrouble.Inputing();

        monkeyTrouble.output1(sc.nextBoolean(), sc.nextBoolean());



    }


} // end of class

//****************************************************************************

// checked with

/*      monkeyTrouble(true, true) → true	true	OK
        monkeyTrouble(false, false) → true	true	OK
        monkeyTrouble(true, false) → false	false	OK
        monkeyTrouble(false, true) → false	false	OK
        */

