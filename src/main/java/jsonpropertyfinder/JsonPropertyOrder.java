package jsonpropertyfinder;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyOrder {
	
	   public static void main(String args[]){  
	          
	        // create instance of the ObjectSerialization class  
	        ObjectMapper obj = new ObjectMapper();  
	          
	        Scanner sc1 = new Scanner(System.in);  
	          
	        try {  
	              
	            Product prod = new Product();  
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
	            
	            /*public void setJson(String json) {    
	        this.json = json;    
	    }   */
	              
	            prod.setJson("{\"attr\":false}");  
	            //this.json = "attr" : "false";
	              
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