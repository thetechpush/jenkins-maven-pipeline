package com.cruds.demo.mvndemo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public String getGreeting()
    {
    	int x = 10;
        return "Hello from Maven";
    }
    
    public int add(int x, int y)
    {
    	int result = 0;
    	result = x + y;
    	return result;
    }
    
}
