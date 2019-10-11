package practice;

import java.util.Arrays;

public class ChapterOne {
	
	
	public static boolean isUnique(String str) {
		for(int i =0; i<str.length();i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	
	public static boolean checkPermutation(String strOne, String strTwo) {
		if(strOne.length() != strTwo.length())
				return false;

		char tmpOne[] = strOne.toCharArray();	
		Arrays.sort(tmpOne);
		char tmpTwo[] = strTwo.toCharArray();
		Arrays.sort(tmpTwo);

		String a = new String(tmpOne);
		String b = new String(tmpTwo);
		
		if(a.equals(b))
			return true;
		
		return false;
	}

	
}
