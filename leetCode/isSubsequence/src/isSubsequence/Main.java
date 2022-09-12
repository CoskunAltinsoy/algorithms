package isSubsequence;

public class Main {

	public static void main(String[] args) {
		String s ="b", t = "abc";
		System.out.println(isSubsequence(s, t));

	}
	
	public static boolean isSubsequence(String s, String t) {
		
		if(s.length() == 0) return false;
		for(int i = 0; i < s.length(); i++){
	         if(!t.contains(String.valueOf(s.charAt(i))))return false;   
	      }
	     
	      int count = 0;
	      int i =0;
	     while(i<t.length() && count<s.length()){
	          if(s.charAt(count) == t.charAt(i)) {
	              count++;
	          }
	          i++;
	          
	      }
	      if(count != s.length()) return false;
	      return true;
    }
	
	//https://leetcode.com/problems/is-subsequence/ --> description of problem

}
