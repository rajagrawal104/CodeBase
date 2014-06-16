package ProjectEuler;

import java.util.HashSet;
import java.util.Iterator;
public class MultipleOf3And5 {
		 public static void main(String[] args){
		        HashSet<Integer> set=new HashSet<Integer>();
		    for(int i=3;i<1000;i++){
		        if(i%3==0){
		            set.add(i);
		        }
		        if(i%5==0){
		            set.add(i);
		        }
		    }
		        Iterator it=set.iterator();
		        int sum=0;
		        while(it.hasNext()){
		        	int a=(int) it.next();
		            sum+=a;
		        }
		        System.out.println(sum);
		 }

}
