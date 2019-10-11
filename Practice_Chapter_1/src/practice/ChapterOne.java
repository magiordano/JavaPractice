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
	
	
	
	
	public static String URLify(String str){
		str = str.replaceAll("\\s+","%20");
		System.out.println(str);
		return str;
		
	}
	
	
	public static boolean palindromePermutation(String str) {
		boolean check = false;
		str = str.toLowerCase();
		char arr[] = str.toCharArray();
		Arrays.sort(arr);	
		for(int i = 0; i<arr.length; i++) {
			int count = 0;
	
			for(int j = 1; j<arr.length;j++) {
				if(arr[i] != arr[j]) {
					count++;
				}
	
				}
			//System.out.println("COUNT:"+count);
			if (count % 2 == 0 || (count == 1)){
				System.out.println("TRUE" +count);
				check = true;
				
			}
		}
				
		
		return check;
	}

	
}
