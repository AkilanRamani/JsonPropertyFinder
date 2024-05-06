package jsonpropertyfinder;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGetterExample2 {

    public static void main(String args[]){  
        // create instance of ObjectMapper class  
        ObjectMapper mapper = new ObjectMapper();   
          
        // create Scanner class object  
        Scanner sc= new Scanner(System.in);  
        try{  
            String facId, facName, facEmail;  
            System.out.println("Enter Faculty Id:");  
            facId = sc.nextLine();  
            System.out.println("Enter Faculty Name");  
            facName = sc.nextLine();  
            System.out.println("Enter Faculty Email");  
            facEmail = sc.nextLine();  
            FacultyNew faculty = new FacultyNew(facId, facName, facEmail);  
            // convert Java type into Json string  
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(faculty);   
            System.out.println(jsonString);   
        }   
        catch (IOException e) {   
            e.printStackTrace();   
        }  
        // close Scanner class object  
        sc.close();  
}
}
