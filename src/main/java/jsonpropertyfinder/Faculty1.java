package jsonpropertyfinder;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class Faculty1 {
	
	private Map<String, String> facultyData;   
    
    public Faculty1(){   
        facultyData = new HashMap<>();   
    }   
    @JsonAnyGetter  
    public Map<String, String> getFacultyData(){   
        return facultyData;   
    }   
    public void add(String key, String value){   
        facultyData.put(key, value);  
        
       
        // all the key and value pair will be assigned and set into the Map which is an instance of the class Type.
  //this method will not Return the header that is map type reference and will Return only the Fields (Key and value pairs that Refers as JSON ELEMENT Fields).
    }   
    

}
