import java.util.Scanner;
public class Main {

    /**
     * This where your program comes together. Follow the steps from the project
     * directions and try to piece together everything.
     */
    public static void main(String[] args) {
        String storyOptions = presentStoryOptionsAndReturnStoryName();
        if(storyOptions.equals("pizza")){
            runStory1();
        }
        if (storyOptions.equals("Dream in Life")){
            runStory2();
        }
        if (storyOptions.equals("Thanksgiving")){
            runStory3();
        }
    }

    /**
     * This method should present to the user all the story that they can choose from.
     * for example:
     *
     * We have the following stories:
     * (1) - story1
     * (2) - story2
     * ...
     *
     * please type in story number: [user types in here]
     *
     * This method should return the story name that the user choose
     */
    public static String presentStoryOptionsAndReturnStoryName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, choose a story if you dare... options: (1) - pizza, (2) - Dream Life, (3) - Thanksgiving");
        int number = input.nextInt();
        if (number == 1){
            return "pizza";
        }
        if (number == 2){
            return "Dream in Life";
        }
        if (number == 3){
            return "Thanksgiving";
        }
        return null;
    }

    /**
     * This method should print to the terminal a prompt to let the user know
     * what they should do.
     * Then the method should use the scanner class to get a string input.
     * Finally, it should return the string input
     */
    public static String getUserString(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();
        return user;
    }
    public static int getUserInt(String prompt){
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        return user;
    }

    /**
     * This method should run the logic for the first story.
     * It should store all the user inputs into variables.
     * At the end it should print the full story with the words filled in
     */
    public static void runStory1() {
        String adjective = getUserString("Type in a adjective");
        String nationality = getUserString("Type in nationality");
        String person = getUserString("Type in a person");
        String noun = getUserString("Type in a noun");
        String noun2 = getUserString("Type in another noun");
        String noun3 = getUserString("Type in another noun");
        String pluralNoun = getUserString("Type in a plural noun");
        String adjective2 = getUserString("Type in another adjective");
        String adjective3 = getUserString("Type in another adjective");
        String adjective4 = getUserString("Type in another adjective");
        String shapes = getUserString("Type in a shape");
        String food = getUserString("Type in a food");
        String food2 = getUserString("Type in another food");
        int number = getUserInt("type in a number");
        int number2 = getUserInt("type in another number");

        System.out.println("pizza was invented by a " + adjective + " " + nationality + " chef named " + person +
                ". \n To make a pizza you need a lum of " + noun + ",and make a thin, round " + adjective2 + " " + noun2 +
                " . \n Then cover it with " + adjective3 + " sauce " + adjective4 + " cheese, and fresh chopped " + pluralNoun +
                ". \n Next you have to bake it in a very hot " + noun3 + ".\n When it is done, cut it into " + number + " " + shapes +
                "Some kids like " + food + " pizza the best, but my favorite is the " +food2+ " pizza. \n If I could, I would eat " +
                "pizza " + number2 + " times a day.");
    }
    public static void runStory2(){
        String noun = getUserString("Type in a noun");
        String noun2 = getUserString("Type in another noun");
        String noun3 = getUserString("Type in another noun");
        String noun4 = getUserString("Type in another noun");
        String noun5 = getUserString("Type in another noun");
        String noun6 = getUserString("Type in another noun");
        String noun7 = getUserString("Type in another noun");
        String infinitiveVerb = getUserString("Type in a infinitive verb");
        String pronoun = getUserString("Type in a pronoun");
        String verb = getUserString("Type in a verb");
        String verb2 = getUserString("Type in another verb");
        String adjective = getUserString("Type in a adjective");
        String adjective2 = getUserString("Type in another adjective");
        String adjective3 = getUserString("Type in another adjective");

        System.out.println("Once there was a " + noun + " Whose dream in life was " + infinitiveVerb + ".\nEveryone told " +
                "" + pronoun + " that " + noun2 + " cant " + verb + ",\nbut " + noun3 + " was " + adjective + " " +
                ".\nFirst, he went to " + noun4 + ".\nThere, he " + verb2 + ", but just made everyone " + adjective2 +
                ".\nFrom there, he made the long trip to " + noun5 + ", where to his surprise, he discovered " + noun6 + ".\n" +
                "Feeling " + adjective3 + ",he went back home, bringing with him a " + noun7 + ".");
    }
    public static void runStory3(){
        String adjective = getUserString("Type in a adjective");
        String adjective2 = getUserString("Type in another adjective");
        String typeOfBird = getUserString("Type in a type of bird");
        String roomInHouse = getUserString("Type in a room in a house");
        String verb = getUserString("Type in a verb[pass tense]");
        String verb2 = getUserString("Type in a verb");
        String relativeName = getUserString("Type in a relative name");
        String noun = getUserString("Type in a noun");
        String aLiquid = getUserString("Type in a liquid");
        String verbEndingInIng = getUserString("Type in a verb ending in-ing");
        String verbEndingInIng2 = getUserString("Type in another verb ending in-ing");
        String partOfTheBody = getUserString("Type in part of the body");
        String pluralNoun = getUserString("Type in a pluralNoun");
        String noun2 = getUserString("Type in anotherNoun");

        System.out.println("It was a, " + adjective + " cold november day.\n I woke up to the " + adjective2 + " smell of" +
                " "+ typeOfBird + " roasting in the " + roomInHouse + " downstairs.\n I " + verb + " down the stairs to see" +
                " if I could help " + verb2 + " the dinner. My mom said, see if " + relativeName + " needs a fresh "
        + noun + ".\n So I carried a tray of glasses full of " + aLiquid + "into the " + verbEndingInIng + " room.\n When I" +
                " got there, I couldnt belive my " + partOfTheBody + "! There were " + pluralNoun + " " + verbEndingInIng2
                + " on the " + noun2 + "!");
    }
}
