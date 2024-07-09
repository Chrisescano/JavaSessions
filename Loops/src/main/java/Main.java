public class Main {

    /*
    What are loops? - a way to iterate
    loops are a way of repeating lines of code without having to type it all yourself
     */

    public static void main(String[] args) {

        //traditionally this is wasteful - not in computing terms but in your time and effort
//        System.out.println("10");
//        System.out.println("9");
//        System.out.println("8");
//        System.out.println("7");
//        System.out.println("6");
//        System.out.println("5");
//        System.out.println("4");
//        System.out.println("3");
//        System.out.println("2");
//        System.out.println("1");

        //we could use loops to shorten this process
//        for (int i = 10; i  > 0; i--) {
//            System.out.println(i);
//        }

        //sometimes we dont know how many times to loop
        //but loops allow us to build in checks to know when to stop

        //while loops
//        while (/*conditional statement*/) {
//            //code
//        }
        //why does a while loop use a conditional statement? it needs to know when to stop looping
        //if we do not stop we run into a infinite loop - these are bad and make your computer crash

//        int i = 10; //what is going to be my counter?
//        while (i > 0) { //conditional statement
//            System.out.println(i);
//            i--; //when and where will the counter be updated?
//        }

        //for loops
        /*
        for (<counter>; <conditional statement>; <updating the counter>) {
            //code
        }
         */

//        for (int b = 10; b > 0; b--) {
//            System.out.println(b);
//        }

        //do while loop - almost the same as a while loop but it does its conditional checking at the end
        //this allows you to run code at least once before you loop
        /*
        do {
            //code
        } while (<conditional statement>);
         */

//        int c = 10;
//        do {
//            System.out.println(c);
//            c--;
//        } while (c > 0);

        //enhanced for loops - the same as a for loop but its a bit cleaner in syntax
        //drawback - you lose the counter
//        int[] enhancedarray = {1,2,3,5,8,13,21,34};
//        for ( int number : enhancedarray ) {
//            System.out.println(number);
//        }

        /*--------------------------------------------------------------------------------------------*/

        //loops work really well for arrays
//        int[] array = {1,2,3,5,8,13,21,34};
//        for (int d = 0; d < array.length; d++) {
//            System.out.println(array[d]);
//        }

        //what happens if you dont want to loop all the way? or what happens if you want to skip a certain iteration?
        //java offers 2 keywords: break, continue

        //break - stops the loop completely
//        for (int i = 0; i < 10; i++) {
//            if (i >= 6) break;
//            System.out.println(i);
//        }

        //continue - to skip an iteration
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) continue;
//            System.out.println(i);
//        }

        //we can combine loops and conditionals
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                int r = i / 2;
                System.out.println(r);
            } else  {
                int r = i * 3 + 1;
                System.out.println(r);
            } //end of the if then else statement
        } //end of the loop

    }

}
