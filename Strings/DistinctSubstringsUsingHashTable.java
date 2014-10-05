package strings;
import java.util.*;
public class DistinctSubstringsUsingHashTable {

	public static void main(String args[]) {
		  // create a hash set

		   Scanner in=new Scanner(System.in);
		    System.out.print("Enter The string");
		    String s=in.nextLine();
		    in.close();
		    int L=s.length();
		    long startTime = System.currentTimeMillis();
		    Set<String> hs = new HashSet<String>();
		  // add elements to the hash set
		    for(int i=0;i<L;++i)
		    {
		        for(int j=0;j<(L-i);++j)
		        {
		            hs.add(s.substring(j,i+j+1));
		        }
		    }
		  Iterator it=hs.iterator();
		  while(it.hasNext()){
			  System.out.println(it.next());
		  }
		  System.out.println(hs.size());
		  long endTime = System.currentTimeMillis();
		  System.out.println("It took " + (endTime - startTime) + " milliseconds");
		  }
		  }
