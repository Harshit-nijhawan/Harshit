import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class fileBasics {
    public static void main(String[] args) {
        // code to create a new file
        // File myFile = new File("Harshit.txt");
        // try{
        //     myFile.createNewFile();
        // }
        // catch (Exception e){
        //     System.out.println("Unable to create this file");
        //     e.printStackTrace();
        // }

        // code to write a new file
        // try{
        //     FileWriter fileWriter = new FileWriter("Harshit.txt");
        //     fileWriter.write("This is the first file i made yet\n Okay byee!");
        //     fileWriter.close();
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        // }
        
        // Reading a File
        // File myfile = new File("Harshit.txt");
        // try{
        //     Scanner sc = new Scanner(myfile);
        //     while(sc.hasNextLine()){
        //         String line = sc.nextLine();
        //         System.out.println(line);
        //     }
        //     sc.close();
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        // }

        // Delete a file
        File myFile = new File("Harshit.txt");
        if(myFile.delete()){
            System.out.println("I have deleted : "+ myFile.getName());
        }
        else{
            System.out.println("Some problems occured while deleting a file");
        }



    }
}
