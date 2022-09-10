package isomorphicStrings;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("foo", "bar"));
		System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
		System.out.println(isIsomorphic("aab", "xxy"));
		System.out.println(isIsomorphic("paper", "title"));
		System.out.println(isIsomorphic("paer", "tile"));

	}
	 public static boolean isIsomorphic(String s, String t) {
		 
	        if(s.length() != t.length()) return false;
	        int n = s.length();
	        String str = s + t;
	        String[] strArr = new String[n];
	        for(int i = 0; i < n ; i++){
	        	strArr[i] = String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i+n));        	        
	        } 
	        
	        for (int i = 0; i < n; i++) {
	        	for(int j = i+1; j < n; j++) {
	        		
	        			String stri = strArr[i];
	        			String strj = strArr[j];
	        			char[] ch = new char[2];
	        			char[] chj = new char[2];
	        		    ch = strArr[i].toCharArray();
	        		    chj = strArr[j].toCharArray();
	        			if(ch[0] != chj[0] && ch[1] == chj[1] ||
	        					ch[0] == chj[0] && ch[1] != chj[1]) {
	        				return false;
	        			}        		
	        	}
	        }
	      
	        return true;
		 	
	    }
	 
}

// explanation of this problem --> https://leetcode.com/problems/isomorphic-strings/ 