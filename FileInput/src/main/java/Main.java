import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //What is input?
        //input, in the most basic sense, is getting information from outside our program
        //this type of input is used widely and it is through files

        //what advantages do files have?
        //they can be saved, can save input from user, ability to go back and look at what was saved, track information that is valuable
        //files are a form of permanent storage - which is really useful and is widely used in almost all programs
        //files can also come in different formats: .txt, .csv, .jpeg, .gif, .pdf, ...

        //absolute paths - states where a file lives starting from the C directory
//        String filePath = "C:\\samplefolder\\file.txt";
//
//        //creating a File object
//        File file = new File( filePath );
//
//        //reading from a file
//        //File - is an object that contains properties about a file (such as path, the name of the directory its in, etc..)
//        //FileReader - is an object that creates an input stream of data from the file
//        //BufferedReader - is an object that stores the input stream from FileReader into a buffer that can be used later
//        try {
//            BufferedReader reader = new BufferedReader( new FileReader( file ) );
//
//            //getting the lines of the file
//            String line; //temporary string
//
//            //line = reader.readLine() - will either return the current file line or NULL if no lines are left in the file
//            //the condition to stop looping is if the line is NULL
//            while ( ( line = reader.readLine() ) != null ) {
//                System.out.println(line);
//            }
//
//            reader.close(); //closes bufferedReader and frees up resources so that our computer does not slow down
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        //write to a file
//        try {
//            //this writes to a file by starting at the beginning
//            //BufferedWriter writer = new BufferedWriter( new FileWriter( file ) );
//
//            //this write to a file by appending to the end of a file
//            BufferedWriter writer = new BufferedWriter( new FileWriter( file, true ) );
//
//            //the way we write to a file depends on how we are storing the information
//            //lets store our information as an array of strings as an example
//            String[] array = new String[5];
//
//            array[0] = "This is the first line of the array";
//            array[1] = "barbeque chicken is great";
//            array[2] = "barbeque sauce is awesome";
//            array[3] = "whats in your barbeque?";
//            array[4] = "like a good neighbor barbeque is there";
//
//            //loop the array and save to the file
//            for (int i = 0; i < array.length; i++) {
//                writer.write( array[i] + '\n' );
//
//                //in cases where things are not writing correctly
//                writer.flush();
//            }
//
//            writer.close(); //close bufferedWriter to free up resources
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //using our functions to read and write to a file
        String filePath = "C:\\samplefolder\\file.txt";

        String[] fileContents = readFromFile( filePath );
        writeToFile( filePath, fileContents, true );
    }

    private static String[] readFromFile( String filePath ) {
        //creating a File object
        File file = new File( filePath );

        //reading from a file
        //File - is an object that contains properties about a file (such as path, the name of the directory its in, etc..)
        //FileReader - is an object that creates an input stream of data from the file
        //BufferedReader - is an object that stores the input stream from FileReader into a buffer that can be used later
        try {
            BufferedReader reader = new BufferedReader( new FileReader( file ) );
            ArrayList<String> fileList = new ArrayList<>();

            //getting the lines of the file
            String line; //temporary string

            //line = reader.readLine() - will either return the current file line or NULL if no lines are left in the file
            //the condition to stop looping is if the line is NULL
            while ( ( line = reader.readLine() ) != null ) {
                fileList.add( line );
            }

            reader.close(); //closes bufferedReader and frees up resources so that our computer does not slow down

            String[] array = new String[ fileList.size() ];
            return fileList.toArray(array);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeToFile( String filePath, String[] array, boolean append ) {
        File file = new File( filePath );

        //write to a file
        try {
            //this writes to a file by starting at the beginning
            //BufferedWriter writer = new BufferedWriter( new FileWriter( file ) );

            //this write to a file by appending to the end of a file
            BufferedWriter writer = new BufferedWriter( new FileWriter( file, append ) );

            //loop the array and save to the file
            for (int i = 0; i < array.length; i++) {
                writer.write( array[i] + '\n' );

                //in cases where things are not writing correctly
                writer.flush();
            }

            writer.close(); //close bufferedWriter to free up resources
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
