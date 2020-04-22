import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class StringType {

    private static String vscan;

    public static void main(String[] args) {

        figure();

    }
    // method returns the inputed staring by nextLine or next meathods of String class

    private static String scan(int line){

        Scanner scn = new Scanner(System.in);
        //System.out.print("Input value: ");
        if (line == 1)
            return vscan = scn.nextLine();
        else return vscan = scn.next();
    }

    private static void figure(){

        boolean error = false; // Flag which definition of the error. By error the error key is true

        // Define variables of first and last symbol of searching of a path
        String first, last;

        // Pattern for checking the inputed symbols
        String Alph = "QWERTYUIOPASDFGHJKLZXCVBNM", points;

        do{

            if (!error) System.out.println("Input sequence poins without spaces from top right corner by clock wise : ");
            else System.out.println("Input sequence poins without spaces from top right corner by clock wise again: ");

            // points is major string, cpoints (copy points) needed for searching of duplicates
            String cpoints = points = scan(0);

            // reset error key for next iteration of checking
            error = false;

            // convert the inputted string to Upper for not feeling to size of inputted symbols
            points = points.toUpperCase();

            // checking the size of inputted string because we are working with four corners
            if (points.length() != 4) {System.out.println("Inputed is not 4 points"); error = true;}

            // checking inputted string by Alphabet
            if (!error)
            for (int i = 0; i < points.length(); i++) {
                if(!Alph.contains(points.substring(i, i+1))) {
                    System.out.println("The inputted string contains symbol" + points.charAt(i) + " is not Alpha Type!");
                    error = true;
                }
            }
            // pass next checking if there is not the error in previous checking
            if (!error)
                // character duplication check
                for (int i = 0; i < points.length() && !error; i++) {
                    cpoints = cpoints.replace(points.charAt(i),'#');
                    int count = 0;
                    for (int j = 0; j < points.length() && !error; j++) {
                        if ('#' == cpoints.charAt(j)){
                            count++;
                            if(count > 1){
                                System.out.println("Inputted the repeated symbol " + points.charAt(j));
                                error = true;
                            }
                        }
                    }
                    cpoints = points;
                }


        } while(error); // carry out while not a error or the symbols check will be completed

        // reset error key for next iteration of checking
        error = false;

             do {
                 // check repeated incorrect inputs
                 if(!error)System.out.println("Input first point for movement : ");
                 else  System.out.println("Input first point for movement again : ");

                 first = scan(0).substring(0, 1).toUpperCase();
                 // set error if the while condition will be defined occurrence of the entered character in the inputted string
                 error = true;

             } while(first.contentEquals(points));

             error = false;

            do {
                // same for the last's variable
                if(!error)System.out.println("Input last point for movement : ");
                else  System.out.println("Input last point for movement again : ");
                last = scan(0).substring(0, 1).toUpperCase();
                error = true;

            } while(last.contentEquals(points));

            error = false;

            // if first and last symblols are same
            if (first.equals(last))
                System.out.println("Output: " + first + " found");

            else {

                int i = 999;

                System.out.println("Input again 1 for direction of movement to right and 0 vice versa: ");
                i = Integer.parseInt(scan(0));
                // call the mehod of searching path
                if (i==1)rotate(true, points, first.charAt(0), last.charAt(0));
                    else rotate(false, points, first.charAt(0), last.charAt(0));


            }

    }

    private static void rotate(boolean right, String points, char first, char last){
        String output = "Output: ";
        int i = points.indexOf(first,0);
        if (right) {

                do{
                    switch (i) {
                        case 0:
                            output += "right > ";
                            break;
                        case 1:
                            output += "down > ";
                            break;
                        case 2:
                            output += "left > ";
                            break;
                        default:
                            output += "top > ";
                    }
                    if (i==3) i = -1;
            }while(last != points.charAt(++i));

        }
        else {
            do{
                switch (i) {
                    case 0:
                        output += "down > ";
                        break;
                    case 1:
                        output += "left > ";
                        break;
                    case 2:
                        output += "top > ";
                        break;
                    default:
                        output += "right > ";
                }
                if (i==0) i = 4;
            }while(last != points.charAt(--i));
        }

        System.out.println(output + ": " + last + " found");
    }
}

/*
    private static String emailTofl(String email, boolean index ){

                if (index)
                    return email.substring(0, email.indexOf("_"));
                else return email.substring(email.indexOf("_")+1, email.indexOf("@"));
    }
*/



/*
    private static void string001(){
        String str;
        Scanner scn = new Scanner(System.in);
        System.out.print("input W1:");
        String w1 = scn.next();
        System.out.print("Input W2:");
        String w2 = scn.next();

        if (w1.compareTo(w2) == 0) System.out.println("W1 = W2");
        else System.out.println("W1 not equals W2");
    }

    private static void string002(){



        Scanner scn = new Scanner(System.in);
        System.out.println("what is the farthest planet in the solar system:");

        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");
        String answer = scn.next();


        if (!"abc".contains(answer)) System.out.println(answer + " is not a valid answer");
            else if ("b".contains(answer)) System.out.println(answer + " is correct");
                else System.out.println(answer + " is not correct");

    }

    private static void string003(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the menu item: ");
        String food = scn.next();
        String[] menu = {"chicken", "burger"};

        if (menu[0].contains(food) || menu[1].contains(food)) System.out.println("$10.0");
            else System.out.println("$2.0");
    }

    private static void string004(){

        ArrayList<String> list = new ArrayList<String>(10);
        String[][] shoppingList = {{"Smartphone", "Laptop", "Charger", "USB Cable", "Headphones",
                "Pants", "Hat","Socks", "Blanket", "Pillow"},
                {"300", "400", "15", "10", "30",
                        "50", "25", "5", "60", "40"}};

        Scanner scn = new Scanner(System.in);
        System.out.print("Input a gift card amount: ");
        float giftCard = Float.parseFloat(scn.nextLine());
        System.out.println("Input the buying good: ");
        String item = scn.nextLine();

        float balance = 0.0f;

        for (int i = 0; i < 10; i++) {

            if (shoppingList[0][i].contains(item))
            {
                balance = giftCard - Float.parseFloat(shoppingList[1][i]);

                if (balance >= 0)
                {
                    System.out.println("Thank you for your purchase!");
                    System.out.println(" Your current balance is: $" + balance);
                }
                else System.out.println("Sorry, not enough funds on your gift card!");
            }
        }

    }

    private static void string005(){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.print(str.charAt(6) + " " + str.charAt(6) + " " + str.charAt(6));
        System.out.print(str.charAt(6) + " ");
        System.out.print(str.charAt(7) + " ");
        System.out.print(str.charAt(7) + " ");
    }



*/