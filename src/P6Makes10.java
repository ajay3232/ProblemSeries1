import java.util.Scanner;

/**
 * Created by Ajay Mehta on 3/18/2017.
 */


/*Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

        makes10(9, 10) → true
        makes10(9, 9) → false
        makes10(1, 9) → true
        */


public class P6Makes10 {

    static Scanner sc;

    static P6Makes10 makes10;


    public boolean makes10(int a, int b) {

        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        }

        return false;
    }

    // other way around (shorter)

/*
    public boolean makes10(int a, int b) {

        return(a == 10 || b == 10 || a+b == 10) ;

    }*/




    public void Inputing() {

        System.out.print("Enter value of a and value of b :  ");
    }


    public void output1(int a, int b) {

        System.out.println(makes10.makes10(a, b));

    }


    public void output2(int a, int b) {

        System.out.println(makes10.makes10(a, b));

    }


    public void output3(int a, int b) {

        System.out.println(makes10.makes10(a, b));

    }


    // you can create your own class object in main method..n can call other methods of class

    public static void main(String[] args) {

        sc = new Scanner(System.in);


        makes10 = new P6Makes10();

        makes10.Inputing();

        makes10.output1(sc.nextInt(), sc.nextInt());

        // calling output2

        makes10.Inputing();

        makes10.output2(sc.nextInt(), sc.nextInt());


        // calling output3


        makes10.Inputing();

        makes10.output3(sc.nextInt(), sc.nextInt());


    }


}
