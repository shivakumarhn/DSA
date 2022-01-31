package Miscellanious;

import java.io.*;
import java.util.ArrayList;

public class MatrixProblemVM {

    public static void main(String[] args) throws IOException {

        /*File file = new File("/Users/shivakumarhn/IdeaProjects/DSAGFG/src/main/java/vmWare/matrix.txt");

        BufferedReader fs = new BufferedReader(new FileReader(file));

        String s;
        ArrayList<String> list = new ArrayList<>();

        while ((s = fs.readLine()) != null) {

            System.out.println(s);
            list.add(s);
            System.out.println(list);
            // fs.readLine();
        }*/


        String text
                = "Computer Science Portal GeeksforGeks";

        // Try block to check for exceptions
        try {

            // Step 1: Create an object of BufferedWriter
            BufferedWriter f_writer
                    = new BufferedWriter(new FileWriter(
                    "/Users/shivakumarhn/IdeaProjects/DSAGFG/src/main/java/vmWare/output.txt"));

            // Step 2: Write text(content) to file
            f_writer.write(text);

            // Step 3: Printing the content inside the file
            // on the terminal/CMD
            System.out.print(text);

            // Step 4: Display message showcasing
            // successful execution of the program
            System.out.print(
                    "File is created successfully with the content.");

            // Step 5: Close the BufferedWriter object
            f_writer.close();
        }

        // Catch block to handle if exceptions occurs
        catch (IOException e) {

            // Print the exception on console
            // using getMessage() method
            System.out.print(e.getMessage());
        }
        try {
            ArrayList<String> list = new ArrayList<>();

            BufferedWriter bw
                    = new BufferedWriter(new FileWriter("/Users/shivakumarhn/IdeaProjects/DSAGFG/src/main/java/vmWare/shiva.txt"));

            bw.write(text);
            for (String w : list)
                bw.write(w);
        } catch (IOException e) {

            // Print the exception on console
            // using getMessage() method
            System.out.print(e.getMessage());
        }

    }
}
