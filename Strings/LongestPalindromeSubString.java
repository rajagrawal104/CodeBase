package strings;

public class LongestPalindromeSubString {
	public static void main(String[] args){
		System.out.println(2&3&9);
		String s="forgeeksskeegfor";
		  foo(8);
		char[] array=s.toCharArray();
		longestPlaindrome(array);
	  
	}
	public static void foo(int i)
	{
	    if(i > 1)
	    {
	        foo(i/2);
	        foo(i/2);
	    }
	    System.out.println("#");
	}
	public static void longestPlaindrome(char[] array){
	int length=array.length;
	boolean[][] matrix=new boolean[length][length];
	int maxlength=1;
	for(int i=0;i<length;++i){
		matrix[i][i]=true;
	}
	int start = 0;
    for( int i = 0; i < length-1; ++i )
    {
        if( array[i] == array[i+1] )
        {
            matrix[i][i+1] = true;
            start = i;
            maxlength = 2;
        }
    }
    
    for( int k = 3; k <= length; ++k )
    {
        // Fix the starting index
        for( int i = 0; i < length - k + 1 ; ++i )
        {
            // Get the ending index of substring from starting index i and length k
            int j = i + k - 1;
 
            // checking for sub-string from ith index to jth index iff str[i+1]
            // to str[j-1] is a palindrome
            if( matrix[i+1][j-1] && array[i] == array[j] )
            {
                matrix[i][j] = true;
 
                if( k > maxlength )
                {
                    start = i;
                    maxlength = k;
                }
            }
        }
    }
    System.out.println("Longest palindrome substring is: ");
    printSubStr( array, start, start + maxlength - 1 );
	}
	public static void printSubStr(char[] array, int start, int end){
		 for( int i = start; i <= end; ++i )
		        System.out.print(array[i]);
	}

	
}