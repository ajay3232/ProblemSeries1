import java.util.Scanner;

/**
 * Created by Ajay Mehta on 3/18/2017.
 */


/*

Given two int values, return their sum. Unless the two values are the same, then return double their sum.

        sumDouble(1, 2) → 3
        sumDouble(3, 2) → 5
        sumDouble(2, 2) → 8

*/

public class P3SumDouble {

    static Scanner sc;

   static  P3SumDouble sumDouble;

    public int sumDouble(int a, int b) {
        if(a == b) {
            return (a+b) * 2;
        }

        return (a+b);
    }

    // another way


/*
    public int sumDouble(int a, int b) {
        int sum = a+b;
        if(a == b) {
            sum = sum* 2;
        }
        return sum;
    }
*/



    public void Inputing(){

        System.out.print("Enter value of a and value of b :  ");
    }


    public void output1(int a , int  b) {

        System.out.println(sumDouble.sumDouble(a, b));

    }

    public void output2(int a , int  b) {

        System.out.println(sumDouble.sumDouble(a, b));

    }

    public void output3(int a , int  b) {

        System.out.println(sumDouble.sumDouble(a, b));

    }


    // you can create your own class object in main method..n can call other methods of class

    public static void main(String []args){

        sc = new Scanner(System.in);

        sumDouble = new P3SumDouble();

        sumDouble.Inputing();

        sumDouble.output1( sc.nextInt(), sc.nextInt());

        sumDouble.Inputing();

        sumDouble.output2(sc.nextInt(), sc.nextInt());

        sumDouble.Inputing();

        sumDouble.output1(sc.nextInt(), sc.nextInt());



    }

}  // end of class

//****************************************************************************

// checked with
//           Expected	           Run
/*      sumDouble(1, 2) → 3	3	OK
        sumDouble(3, 2) → 5	5	OK
        sumDouble(2, 2) → 8	8	OK
        sumDouble(-1, 0) → -1	-1	OK
        sumDouble(3, 3) → 12	12	OK
        sumDouble(0, 0) → 0	0	OK
        sumDouble(0, 1) → 1	1	OK
        sumDouble(3, 4) → 7	7	OK*/
