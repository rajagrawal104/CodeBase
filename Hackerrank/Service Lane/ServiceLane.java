import java.io.*;
class ServiceLane{
    public static void main(String[] args) throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String nt=br.readLine();
        String[] ntSplit=nt.split(" ");
        Integer n=Integer.parseInt(ntSplit[0]);
        Integer t=Integer.parseInt(ntSplit[1]);
        String array=br.readLine();
        String[] widthArray=array.split(" ");
        for(int k=0;k<t;k++){
            String ij=br.readLine();
            String[] ijArray=ij.split(" ");
            Integer i=Integer.parseInt(ijArray[0]);
            Integer j=Integer.parseInt(ijArray[1]);
            int min=3;
            while(i<=j){
                if(Integer.parseInt(widthArray[i])<min){
                    min=Integer.parseInt(widthArray[i]);
                }
                i++;
            }
            if(min==1){
                System.out.println("1");
            }else if(min==2){
                System.out.println("2");
            }else{
                System.out.println("3");
            }
        }
    }
}