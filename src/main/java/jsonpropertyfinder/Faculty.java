package jsonpropertyfinder;

import java.util.HashMap;
import java.util.Map;

public class Faculty {
	 private Map<String, String> facultyData;   
     
	    public Faculty(){   
	        facultyData = new HashMap<>();   
	    }   
	    public Map<String, String> getFacultyData(){   
	        return facultyData;   
	    }   
	    public void add(String key, String value){   
	        facultyData.put(key, value);   
	    }   
}
