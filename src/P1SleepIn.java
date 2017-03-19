import java.util.Scanner;

/**
 * Created by Ajay Mehta on 3/18/2017.
 */

/*

 Q) The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

   Input)     sleepIn(false, false) → true
              sleepIn(true, false) → false
              sleepIn(false, true) → true


*/

class Question {

    // you can do like this ...

    public boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation) {
            return true;

        }

        return false;


    }


    // or in a shorter way

/*    public boolean sleepIn(boolean weekday, boolean vacation) {

        return (!weekday || vacation);


    }*/

}


public class P1SleepIn {

    static boolean weekday;    // static variables can be used in satic method..

    static boolean vacation;


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Weekday Value: ");

        weekday = sc.nextBoolean();

        System.out.println("");

        System.out.print("Enter Vacation Value: ");

        vacation = sc.nextBoolean();

        output();    // we can class only static methods from a static method..

    }

    public static void output() {

        Question question = new Question();


        System.out.println(question.sleepIn(weekday, vacation));


    }


}  // end of class

//****************************************************************************

// checked with

/*      sleepIn(false, false) → true	true	OK
        sleepIn(true, false) → false	false	OK
        sleepIn(false, true) → true	true	OK
        sleepIn(true, true) → true	true	OK

        */

