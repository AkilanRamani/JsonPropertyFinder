package jsonpropertyfinder;

import com.fasterxml.jackson.annotation.JsonGetter;

public class FacultyNew {
	
    private String id;  
    private String name;  
    private String email;  
    public FacultyNew(String id, String name, String email){  
        this.id = id;  
        this.name = name;  
        this.email = email;  
    }  
    public String getFacultyId(){  
        return id;  
    }   
    @JsonGetter("name12")  
    public String getFacultyName(){  
        return name;  
    }  
    public String getFacultyEmail(){  
        return email;  
    }  

}
