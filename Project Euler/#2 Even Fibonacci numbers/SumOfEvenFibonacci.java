package ProjectEuler;

public class SumOfEvenFibonacci {
	    public static void main(String[] args){
	        int i=1,j=1,sum=0;
			    while(i<4000000)
			    {
			    i=i+j;
			    j=i-j;
			    if(i%2==0)
			    sum+=i;
			    }
			System.out.println(sum);
	    }
	    
}
