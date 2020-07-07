package tes2;

public class MyPalindrome { 

	static boolean isPalindrome(String string) 
	{ 

		int i = 0, j = string.length() - 1; 

		while (i < j) { 

			if (string.charAt(i) != string.charAt(j)) 
				return false; 

			i++; 
			j--; 
		} 

			return true; 
	} 

	public static void main(String[] args) 
	{ 
		String str = "dad"; 

		if (isPalindrome(str)) 
			System.out.print("Yes"); 
		else
			System.out.print("No"); 
	} 
} 
