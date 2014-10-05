package hackerrank.AmazonTest.ReverseWords;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String res;
		String _a;
		_a=sc.nextLine();
		res=reverseWords(_a);
		System.out.println(res);
		sc.close();
	}
	
	static String reverseWords(String a){
		if(a==null ||a.length()==0) return "";
		StringBuilder builder=new StringBuilder();
		String array[]=a.split(" ");
		for(int i=array.length-1;i>=0;i--){
			if(!array[i].equals(""))
				builder.append(array[i]).append(" ");
		}
		return builder.toString();
	}

}
