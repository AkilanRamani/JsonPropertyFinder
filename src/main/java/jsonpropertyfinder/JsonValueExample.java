package jsonpropertyfinder;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValueExample {

	public static void main(String[] args) {
		ObjectMapper obj = new ObjectMapper();  
        
        Scanner sc1 = new Scanner(System.in);  
          
        try {  
              
            Product1 prod = new Product1();  
            String prodId, prodName, price;  
              
            System.out.println("Enter Product Id:");  
            prodId = sc1.nextLine();  
            prod.setProId(prodId);  
              
            System.out.println("Enter Product Name");  
            prodName = sc1.nextLine();  
            prod.setProName(prodName);  
            
            System.out.println("Enter Product Price:");  
            price = sc1.nextLine();  
            prod.setPrice(price);  
              
            String jsonString = obj  
                .writerWithDefaultPrettyPrinter()  
                .writeValueAsString(prod);  
            System.out.println(jsonString);  
              
        } catch (JsonParseException e) {  
            e.printStackTrace();  
        } catch (JsonMappingException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
          
        // close scanner class object  
        sc1.close();  

	}

}
