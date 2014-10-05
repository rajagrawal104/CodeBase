package Strings;

import java.util.Scanner;

public class PrintDuplicatesInLexographicalOrder {
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	sc.close();
	findRepeatCharacters(str);
}

public static void findRepeatCharacters(String a) {

        char repeated[] = new char[256];
        for(int i=0;i<a.length();i++) {
            int index = (int)a.charAt(i);
            if(repeated[index] < 2) {
                repeated[index]++;
            }
        }
        for(int i=0;i<256;i++) {
            if(repeated[i]>1) {
                System.out.println((char)i);
            }
        }
}
}