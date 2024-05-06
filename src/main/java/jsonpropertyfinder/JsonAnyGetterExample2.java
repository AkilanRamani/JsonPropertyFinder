package jsonpropertyfinder;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnyGetterExample2 {
	public static void main(String args[]){  
        
        // create instance of ObjectMapper class  
        ObjectMapper mapper = new ObjectMapper();   
          
        // create Scanner class object  
        Scanner sc= new Scanner(System.in);  
          
        try{  
              
            Faculty1 faculty = new Faculty1();  
              
            String facId, facname, facEmail;  
              
            System.out.println("Enter Faculty Id:");  
            facId = sc.nextLine();  
            faculty.add("Id", facId);  
              
            System.out.println("Enter Faculty Name");  
            facname = sc.nextLine();  
            faculty.add("Name", facname);  
              
            System.out.println("Enter Faculty Email");  
            facEmail = sc.nextLine();  
            faculty.add("Email", facEmail);  
              
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
