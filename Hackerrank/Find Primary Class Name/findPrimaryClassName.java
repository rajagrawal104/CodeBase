import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findPrimaryClassName {
	public static void main(String[] args)throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String re1 = "^.*class (\\w+)";
        String re2 = "^.*static void main\\(String\\[\\] args\\).*";
        String re3 = "^.*public class (\\w+)";
        String re4 = "^.*static public void main\\(String\\[\\] args\\).*";
        
        boolean flag=false;
	    Pattern p1 = Pattern.compile(re1);
	    Pattern p2=Pattern.compile(re2);
        Pattern p3=Pattern.compile(re3);
        Pattern p4=Pattern.compile(re4);
	    String className=null;
        String publicName=null;
         String line =null;
	    while ((line=br.readLine()) != null) {	   
	    if(line!=null){
	    Matcher matcher1=p1.matcher(line);
	    Matcher matcher2=p2.matcher(line);
        Matcher matcher3=p3.matcher(line);
        Matcher matcher4=p4.matcher(line);
            if(matcher3.find()){
                publicName=matcher3.group(1);
            }
	    if(matcher1.find()){
	        className=matcher1.group(1);
        }
        if(matcher2.find()){
            if(publicName==null){
            flag=true;
	    	System.out.println(className);
            break;
	    }else{   
                flag=true;
                System.out.println(publicName);
                break;
            }
        }
         if(matcher4.find()){
            flag=true;
	    	System.out.println(className);
            break;
	    }
	    
        }
	}
        if(!flag){
        if(publicName==null){
            System.out.println(className);
        }else{
            System.out.println(publicName);
    	    }
        }
	    }
    }

