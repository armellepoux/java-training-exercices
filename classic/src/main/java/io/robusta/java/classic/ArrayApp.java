package io.robusta.java.classic;

import java.util.Arrays;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {

    int[] buildArray(int a, int b, int c){
    	int[] ArrayApp = {a, b, c};
        return ArrayApp;
    }


    boolean equality(int[] array1, int[] array2){
    	return Arrays.equals(array1, array2);
    }

    
    String asString (int [] numbers){
        String string="";
        for(int i : numbers) {
            string+=Integer.toString(i)+":";
        }
        //System.out.println(string);
        return string;
    }

    
    String asStringJoin (int [] numbers){
        String string="";
      	int j=0;
        for(int i : numbers) {
			j++;
			if (j < numbers.length){
            string+=Integer.toString(i)+":";
        	}else{
        	string+=Integer.toString(i);
        	}
    }
        System.out.println(string);
        return string;
 }

    
    String asString (String [] strings){
    	String joined = String.join(" ", strings);
        return joined;
    }

    String asString (Card [] cards){
    	
        String string="";
        for(int i : cards) {
            string+=Integer.toString(i)+cards;
        
    }
        System.out.println(string);
    	
        return null;
    }

}
