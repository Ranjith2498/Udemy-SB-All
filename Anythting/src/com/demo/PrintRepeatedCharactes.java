package com.demo;

import java.util.*;
import java.util.Map.Entry;

public class PrintRepeatedCharactes {

	public static void main(String[] args) {

		
		String s ="abacbcdefgf";
		
        Map<Character, Integer> map = new HashMap<>();
        int i,j,k;
        
        for(i=0;i<s.length();i++)
        {
        	int count=0;
        	 for(j=0;j<s.length();j++)
             {
        		 if(s.charAt(i)==s.charAt(j))
        		 {
        			 count++;
        			 
        		 }
             }
//        	 if(count>1)
//        	 {
        		 map.put(s.charAt(i),count);
//        	 }
        }
        
        for(Map.Entry<Character,Integer> m : map.entrySet())
        {
        	System.out.println(m.getKey()+" "+m.getValue() );
        }
        
        
        
       
		
	}

}
