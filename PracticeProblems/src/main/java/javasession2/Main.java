package javasession2;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //result 6.5/10
        //problem 1
        System.out.println("Getting user input makes your programs dynamic and fun."); //[correct]

        //Problem 2
        System.out.println("java.util.Scanner"); //[partial]

        //Problem 3
        System.out.println("Java libary"); //[correct]

        //Problem 4
        System.out.println("nextDouble()"); //[correct]

        //Problem 5
        System.out.println("What part is declaring Scanner?" + "Scanner input\nWhat part is initializing the Scanner?" +
                "new Scanner(System.in)"); //[partial]

        //Problem 6
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.nextLine(); //clears buffer
        System.out.println("Hello " + name + "I see you are " + age + "years old"); //[partial]

        //Problem 7
        int[] randomarray = new int[10]; //[correct]

        //Problem 8
        String[] names = new String[4];
        names[0]= "Kerry";
        names[1]= "Christian";
        names[2]= "Nichole";
        names[3]= "Sahara";
        System.out.println("Hello my name is " + names[0] + "and this is " + names[2] + "it is nice to meet you" + names[3] + "and" + names[1]); //[wrong]

        //Problem 9
        System.out.print("Please type in an integer (string): ");
        int number = scanner.nextInt();
        System.out.println("What happens is an error"); //[partial]

        //Problem 10
        String characterName = scanner.nextLine();
        System.out.println("Enter the name of a character: " + characterName + "\n Hey " + characterName +
                " welcome to the country of something, in this" +
                "country we have nothing going on, no food no water, just rocks and dirt. " +
                "We sell dirt cookie and mud water $15.00 each. We also have" +
                "mud slide and a place for you too catch a nice disease. " +
                "All in all welcome to SOMETHING!" ); //[partial]

        //extra credit
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.split(" ");

        System.out.println("First name: "+nameParts[0]);
        System.out.println("Middle name: "+nameParts[1]);
        System.out.println("Last name: "+nameParts[2]);
    }


}
