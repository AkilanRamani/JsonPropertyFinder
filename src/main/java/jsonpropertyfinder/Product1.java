package jsonpropertyfinder;

import com.fasterxml.jackson.annotation.JsonValue;

public class Product1 {
	
	 private String proId;      
	    private String name;      
	    private String price;  
	      
	    //Getter and Setters  
	    public String getProId() {    
	        return proId;    
	    }    
	    public void setProId(String proId) {    
	        this.proId = proId;    
	    }    
	    public String getName() {    
	        return name;    
	    }    
	    public void setProName(String name) {    
	        this.name = name;    
	    }    
	    public String getPrice() {    
	        return price;    
	    }    
	    public void setPrice(String price) {    
	        this.price = price;    
	    }  
	      
	    @JsonValue  
	    public String toString() {      
	        // TODO Auto-generated method stub      
	        return "{ ProductId = "+ proId + ", ProductName = " + name + ", ProductPrice = " + price + "}";      
	    }    

}
