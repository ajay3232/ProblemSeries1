import java.util.Scanner;

/**
 * Created by Avi Hacker on 3/19/2017.
 */



/*Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

        notString("candy") → "not candy"
        notString("x") → "not x"
        notString("not bad") → "not bad"*/



public class P9NotString {

    static Scanner sc;

    static P9NotString notString;



    public String notString(String str) {

        if(str.length() >= 3 && str.substring(0,3).equals("not")) {  // start with 0 position n go up to 3 positions as a end of index ex. not - 0 1 2 (so end at 3)

            return str;
        }

        return new String("not "+str);
      //  return "not " + str;              // use any of both ..

    }



    public void Inputing() {

        System.out.print("Enter value of string :  ");
    }


    public void output(String str) {

        System.out.println(notString.notString(str));

    }



    // you can create your own class object in main method..n can call other methods of class

    public static void main(String[] args) {

        sc = new Scanner(System.in);


        notString = new P9NotString();

        notString.Inputing();

        notString.output(sc.nextLine());

        // calling again
        notString.Inputing();

        notString.output(sc.nextLine());

        // calling third time
        notString.Inputing();

        notString.output(sc.nextLine());


    }


}   // end of class

//****************************************************************************

// checked with
/*
                            Expected	    Run
    notString("candy") → "not candy"	    "not candy"	OK
        notString("x") → "not x"	        "not x"	OK
        notString("not bad") →"not bad" 	"not bad"	OK
        notString("bad") → "not bad"	    "not bad"	OK
        notString("not") → "not"	        "not"	OK
        notString("is not") →"not is not"	"not is not" OK
        notString("no") → "not no"	        "not no"	OK
*/

