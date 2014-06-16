package ProjectEuler;

public class LargestPrimeFactor {
	 public static void main(String[] args){
	        double a= 600851475143.0;
		        int factor=2;
		        while(a>factor){
		            if(a%factor==0){
		                a=a/factor;
		                factor=2;
		            }else
		                factor++;
		        }
		        System.out.println(factor);
	    }

}
