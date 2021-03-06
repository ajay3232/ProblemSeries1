import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ajay Mehta on 3/19/2017.
 */



/*
 Q) Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

input )    missingChar("kitten", 1) → "ktten"
           missingChar("kitten", 0) → "itten"
           missingChar("kitten", 4) → "kittn"
*/


public class P10MissingChar {

    static Scanner sc;

    static P10MissingChar missingChar;


// here the concept is...we have to remove a character from string ...so what we can do is create a frist substring till that character then skip that character ..n then create another substring from chracter that is next to character we removed

    // for first substring we going to character we remvoe..see substring method takes 1 character extra ..means it prints 1 less character ..so we going till n ..its not gonna print n (it will print character before n ..so we got first sub string
    // then for second we going from n+1 /...so we sucessfully skipped n character ...


    public String missingChar(String str, int n) {

        String front = str.substring(0, n);

        String back = str.substring(n+1 , str.length());

        return front + back ;

    }



    public void Inputing() {

        System.out.print("Enter value of string and index n :  ");
    }



    public void output(String str , int n) {

        System.out.println(missingChar.missingChar(str , n));

    }




    //  see...when getting multiple string inputs from scanner ...nextLine() method was just taking input first time n prossed it ..n then going to next line ...n skipping taking 2nd n 3rd input from output2 n output3  methods...
    //  so now i replace it with next() method..n its working completely fine n taking multiple String input one by one..
// nextLine() method works fine ..if you getting String input from scanner just once..
    // 1 thing readline() method take stuff from whole line...if you write like this ...    hello 2  5 dogi ...it will take all of  them as string but..next method will only take hello from the line..

    public static void main(String[] args) {

        sc = new Scanner(System.in);


        missingChar = new P10MissingChar();

        missingChar.Inputing();

        // it was throughing a inputMismatch exception ( when using scanner it may come )..so  pu the try n catch ..where i was getting input from scanner  see below i put the code to get in put n passing it to output method.
        try {   //i guess it was giving exception due to readLine() method of scanner.. that i replace lately

            missingChar.output(sc.next(), sc.nextInt());  // why i choose sc.next() method insteal of nextLine() ..see above method for description

        }catch (InputMismatchException e) {}

        // calling again
        missingChar.Inputing();

        try {

            missingChar.output(sc.next(), sc.nextInt());

        } catch (Exception e) {}

        // calling third time
        missingChar.Inputing();

        try {

            missingChar.output(sc.next(), sc.nextInt());

        } catch (InputMismatchException e) {}

    }


}   // end of class

//****************************************************************************

// checked with
/*
                         Expected	        Run
missingChar("kitten", 1) →  "ktten"	    "ktten"	OK
missingChar("kitten", 0) → "itten"	    "itten"	OK
missingChar("kitten", 4) → "kittn"	    "kittn"	OK
missingChar("Hi", 0)     → "i"	            "i"	OK
missingChar("Hi", 1)     → "H"	            "H"	OK
missingChar("code", 0 )  → "ode"	     "ode"	OK
missingChar("code", 1)   → "cde"	     "cde"	OK
missingChar("code", 2)   → "coe"	      "coe"	OK
missingChar("code", 3)   → "cod"	       "cod"	OK
missingChar("chocolate", 8) →"chocolat"	"chocolat"	OK

*/


