//Simplilearn Phase1Project - Varsha Velu
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.IIOException;
import javax.lang.model.element.Name;
import javax.xml.transform.Result;


public class Phase1Project {    

    static void listFiles() {
        File folder = new File(".");
        File[] listOfFiles = folder.listFiles();
        List<String> fileResults = new ArrayList<String>();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].getName() != null) {
                fileResults.add(listOfFiles[i].getName());
            }
        }
        Collections.sort(fileResults);
        for (String name : fileResults) {
            System.out.println(name);
        }
    }
    static void createFile(String name) {
        try{
            File file = new File(name);
            file.createNewFile();
            System.out.println("New File Created with name:");
            System.out.println(name);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    static void delete(String deleteName){
        File file = new File(deleteName);
        if(file.delete()){
            System.out.println("File Successfully Deleted");
        } else {
            System.out.println("File not Found");
        }
    }
    static void exists(String deleteName){
        File file = new File(deleteName);
        if(file.exists()){
            System.out.println("Successfull Operation: "+deleteName);
        } else {
            System.out.println("Unsuccessfull Operation");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("Application name: Lockedme.com");
        System.out.println("Developer Role: Full Stack Developer");
        System.out.println("***************************************");
        System.out.println("***************************************");

       
        
        System.out.println("Select Options");
        System.out.println("1.List all files in current directory");
        System.out.println("2.Business Level Operations");
        System.out.println("3.Exit");

        Scanner op = new Scanner(System.in);
        int option = op.nextInt();

        if(option == 1) {
            listFiles();
        }
        if(option == 2) {
            boolean con = true;
            while(con) {
                System.out.println("Select the operation");
                System.out.println("1.Create new file");
                System.out.println("2.Delete file");
                System.out.println("3.Check if file exists");
                System.out.println("4.Exit");
                
                Scanner op1 = new Scanner(System.in);
                int option1 = op1.nextInt();
                
                switch(option1) {                            
                    case 1:
                        System.out.println("Enter file name to create");
                        Scanner newfile = new Scanner(System.in);
                        String fileName = newfile.next();
                        System.out.println("Enter file name");
                        createFile(fileName);                
                        break;
                    case 2:
                        System.out.println("Enter file name to delete");
                        Scanner newfile1 = new Scanner(System.in);
                        String fileName1 = newfile1.next();  
                        delete(fileName1);
                        break;
                    case 3:      
                        System.out.println("Enter file name to search");
                        Scanner newfile2 = new Scanner(System.in);
                        String fileName2 = newfile2.next();          
                        exists(fileName2);
                        break;
                    case 4:                
                        con = false;
                        break;
                    default: 
                        System.out.println("You have not selected any option");
                        con = false;
                        break;                
                }
            }
        }      
    }
}

