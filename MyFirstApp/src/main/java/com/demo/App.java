package com.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        App app = new App();
        
        System.out.println("My name is " + app.getName("Pankaj", "Shandilya"));
    }
    
    public String getName(String fName, String lName){
    	
    	return "" + fName + " " + lName;
    }
}
