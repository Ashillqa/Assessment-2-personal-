package com.qa.testdrivendevelopment;

import java.util.ArrayList;
import java.util.List;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}


	/**
	 * Given a string and a char, returns the position in the String where the char first appears.
	 * Ensure the positions are numbered correctly, please refer to the examples for guidance. <br>
	 * Do not ignore case <br>
	 * Ignore whitespace <br>
	 * If the char does not occur, return the number -1. <br>
	 * <br>
	 * For Example: <br>
	 * returnPosition("This is a Sentence",'s') → 4 <br>
	 * returnPosition("This is a Sentence",'S') → 8 <br>
	 * returnPosition("Fridge for sale",'z') → -1
	 */
	public int returnPosition(String input, char letter) {
		String x = input.replaceAll("\\s+","");
		int position =0;
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)==letter) {
				position =(i+1);
				break;
			}else {
				position = -1;
			}
		}
		return position;
	}

	/**
	 * Given two Strings of equal length, 'merge' them into one String.
	 * Do this by 'zipping' the Strings together. <br>
	 * Start with the first char of the first String. <br>
	 * Then add the first char from the second String. <br>
	 * Then add the second char from the first String. <br>
	 * And so on. <br>
	 * Maintain case. <br>
	 * You will not encounter whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * zipped("String","Fridge") → "SFtrriidngge" <br>
	 * zipped("Dog","Cat") → "DCoagt"<br>
	 * zipped("True","Tree") → "TTrrueee" <br>
	 * zipped("return","letter") → "rleettutrenr" <br>
	 */
	public String zipped(String input1, String input2) {
		
		String [] s1 = input1.split("");
		String [] s2 = input2.split("");
		String res = "";
		
		for (int i =0;i<s1.length;i++) {
			res+=((s1[i]+s2[i]));
		}
		
		
		return res;
		
	}

	
	/**
	 * Given an Array of Strings, remove any duplicate Strings that occur, then return the Array. <br>
	 * Do not ignore case. <br>
	 * <br>
	 * For Example: <br>
	 * removeDuplicates({"Dog"}) → {"Dog"} <br>
	 * removeDuplicates({"Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","DoG","Cat"}) → {"Dog","DoG","Cat"} 
	 */
	public String[] removeDuplicates(String[] stringArray) {
		
		
		List<String> y = new ArrayList<>();
		
		for(int i=0;i<stringArray.length;i++) {
			if(!(y.contains(stringArray[i])))
			y.add(stringArray[i]);
		}
		
		String nonDuplicate = "";
		for(int i=0;i<y.size();i++) {
			nonDuplicate+=y.get(i)+" ";
		}
		
		String [] result = nonDuplicate.split(" ");
		
		return result;
		
	}



	/**
	 * Given a large string that represents a csv (comma separated values), the structure of each record will be as follows:
	 * owner,nameOfFile,encrypted?,fileSize <br>
	 * <br>
	 * Example:
	 * "Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445" <br>
	 * <br>
	 * Where a comma separates out the fields, and the \n represents a new line. <br>
	 * For each record, if it is not encrypted, return the names of the owners of the files in a String Array. <br>
	 * Do not include duplicate names. <br>
	 * <br>
	 * For Example: <br>
	 * csvScan("Jeff,private.key,False,1445") → {"Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,True,1318\nJeff,private.key,False,1445") → {"Jeff"} <br>
	 * csvScan("Bert,private.key,False,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445") → {"Bert","Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445") → {"Bert","Jeff"}
	 */
	public String[] csvScan(String csvInput) {
		
	String [] s1 = csvInput.replace("\n", ",").split(",");
	String names = "";
		
	for(int i=2;i<s1.length;i+=4) {
		if(s1[i].equals("False")) {
			if(!(names.contains(s1[i-2]))) {
				names+=s1[i-2]+" ";
				}
		}
		}
		
		String[] result = names.split(" ");
		return result;
	}

		
	

	
	/**
	 * Write a function to randomly generate a list with 5 even numbers between 100 and 200 inclusive. <br>
	 *  <br>
	 * For Example:     <br>
	 * listGen() → {100,102,122,198,200}  <br>
	 * listGen() → {108,104,106,188,200}  <br>
	 * listGen() → {154,102,132,178,164}
	 */
	public int[] listGen() {
		return new int[] {0,0,0,0,0};
	}


	/**
	 * A prime number is one which is only divisible by one and itself.  <br>
	 * Write a function which returns the boolean True if a number is prime, and the boolean False if not. <br>
	 *  <br>
	 * For Example: <br>
	 * isPrime(3) → True <br>
	 * isPrime(8) → False
	 */
	public boolean isPrime(int num) {
		
		boolean outcome = false;
		for(int i=2; i<= num;i++) {
			if(num==i && num%i==0) {
				outcome = true;
				break;
			} if (num%i==0) {
				outcome = false;
				break;
			}
		}
		
		return outcome;
	}

	/**
	 * Wrtie a function which returns the number of vowels in a given string.  <br>
	 * You should ignore case. <br>
	 *  <br>
	 * For Example: <br>
	 * getVowel("Hello") → 2  <br>
	 * getVowel("hEelLoooO") → 6
	 */
	public int getVowel(String input) {
		String x = input.toLowerCase();
		String[] s1 = x.split("");
		int counter =0;
		for(int i =0;i<s1.length;i++) {
			if(s1[i].equals("a")) {
				counter+=1;
			}
			if(s1[i].equals("e")) {
				counter+=1;
			}
			if(s1[i].equals("i")) {
				counter+=1;
			}
			if(s1[i].equals("o")) {
				counter+=1;
			}
			if(s1[i].equals("u")) {
				counter+=1;
			}
		}
		return counter;
	}

	/**
	 * Given two string inputs, if one can be made from the other return the boolean True, if not return the boolean False.  <br>
	 *  <br>
	 * For Example:  <br>
	 * wordFinder("dog", "god") → True  <br>
	 * wordFinder("tiredest", "tree") → True  <br>
	 * wordFinder("dog", "cat") → False  <br>
	 * wordFinder("tripping", "gin") → True
	 */
	public boolean wordFinder(String initialWord, String madeString) {
		String [] s1 = initialWord.split("");
		String [] s2 = madeString.split("");
		boolean outcome = false;
		int counter = 0;
		
		for (int i=0;i<s1.length;i++) {
			for (int j=0;j<s2.length;j++) {
				if(s1[i].equals(s2[j])) {
					counter+=1;
				}	
			}
		}
		if(counter>=madeString.length()) {
			outcome = true;
		}
		
		
		return outcome;
		
	}
	

	/**
	 * There is a well known mnemonic which goes "I before E, except after C", which is used to determine which order "ei" or "ie" should be in a word.  <br>
	 *  <br>
	 * Write a function which returns the boolean True if a string follows the mnemonic, and returns the boolean False if not.  <br>
	 *  <br>
	 * For Example:  <br>
	 * iBeforeE("ceiling") → True  <br>
	 * iBeforeE("believe") → True  <br>
	 * iBeforeE("glacier") → False  <br>
	 * iBeforeE("height") → False
	 */
	public boolean iBeforeE(String input) {
		String s = input.toLowerCase();
		boolean outcome = false;
		for (int i=0;i<s.length();i++) {
			if (s.contains("cei")) {
				outcome = true;
			}else if (s.contains("cie")|| s.contains("ei")) {
				outcome = false;
			} else {
				outcome = true;
			}
		}
		return outcome;
	}

	/**
	 * 	A factorial is the product of itself and all previous numbers  <br>
	 * eg 3 factorial is 1 x 2 x 3 = 6  <br>
	 *  <br>
	 * Write a function which can compute the factorial of a given number between 1 and 10 inclusive.   <br>
	 *   <br>
	 * For Example:  <br>
	 * factorial(1) → 1  <br>
	 * factorial(4) → 24  <br>
	 * factorial(8) → 40320
	 */
	public int factorial(int number) {
		int n =1;
		
		for (int i = number;i>0;i--) {
			n*=i;
		}
		return n;
	}

}
