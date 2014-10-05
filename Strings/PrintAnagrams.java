/*
 * Problem Statement
 * 
 * Given an array of strings, please complete the function printAnagrams 
 * which prints each anagram pair in every line with one space separating the two words
 * Any word that exactly reproduces the letters in another order is an anagram. Anagrams are case-insensitive.
 * If there is no anagram print -1.
		Input #00:
		Resistance, Ancestries, Gainly, Laying, test, troop
		
		Output #00:
		Resistance Ancestries
		Gainly Laying
		Explanation
		Re-arranging "Resistance" gives "Ancestries", similarly re-arranging "Gainly" results in "Laying".
		As stated in the problem, anagrams are case-insensitive
 */
package strings;

import java.util.Arrays;
import java.util.Vector;

public class PrintAnagrams {
	public static void main(String[] args){
		Vector<String> vectorList=new Vector<String>();
		vectorList.add("Resistance");
		vectorList.add("Ancestries");
		vectorList.add("Gainly");
		vectorList.add("Laying");
		vectorList.add("poort");
		vectorList.add("troop");
		printAnagrams(vectorList);
	}

static void printAnagrams(Vector<String>V) {
		
		boolean flag = false;
		for (int i = 0 ; i < V.size() ; i++){
				String temp1 = V.get(i);
				for (int j = i + 1 ; j < V.size(); j++){
					String temp2 = V.get(j);
					if (Helper (temp1 , temp2)){
						System.out.println(temp1 + " "+ temp2);
						flag = true;
					}					
				}
		}
		if (!flag){
			System.out.println(-1);
		}
	}

public static boolean Helper(String temp1, String temp2){
	
	char[] array1=temp1.toLowerCase().toCharArray();
	char[] array2=temp2.toLowerCase().toCharArray();
	Arrays.sort(array1);
	Arrays.sort(array2);
	StringBuilder s1 = new StringBuilder();
	StringBuilder s2 = new StringBuilder();
	for(char c:array1){
		s1.append(c);
	}
	for(char c:array2){
		s2.append(c);
	}
	if(s1.toString().equals(s2.toString()))
		return true;
	else
		return false;
}


public static boolean helper (String tem1, String tem2){
	
	tem1 = tem1.toLowerCase();
	tem2 = tem2.toLowerCase();
	char [] chars  = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	StringBuilder s1 = new StringBuilder();
	StringBuilder s2 = new StringBuilder();
	for (char c : chars){
		for (int i = 0 ; i < tem1.length() ; i++){
			
			if (c == tem1.charAt(i))
				s1.append(""+c);
		}
	}
	
	for (char c : chars){
		for (int i = 0 ; i < tem2.length() ; i++){
			
			if (c == tem2.charAt(i))
				s2.append(""+c);
		}
	}
	tem1 = s1.toString();
	tem2 = s2.toString();
	if (tem1.equalsIgnoreCase(tem2)){
	return true;
	}else
		return false;
}

}
