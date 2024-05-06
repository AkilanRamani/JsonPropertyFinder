package jsonpropertyfinder;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class Product {
	
	
	 private String proId;      
	    private String name;      
	    private String price;  
	    private String json;  
	      
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
	    @JsonRawValue
	    public String getJson() {    
	        return json;    
	    }    
	    public void setJson(String json) {    
	        this.json = json;    
	    }   
	    @Override      
	    public String toString() {      
	        // TODO Auto-generated method stub      
	        return "\"Product [ProductId "+ proId + ", ProductName = " + name + ", ProductPrice = " + price + "]";      
	    }    

}
