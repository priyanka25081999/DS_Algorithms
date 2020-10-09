// Isogram Strings
import java.io.*;

class Isogram
{  public static void main(String args[]) throws IOException
   {  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
      	System.out.print("Enter String : ");
    	String str = br.readLine();
    	
    	int freq[]=new int[26];
    	boolean isogram=true;

    	for(int i=0; i<str.length(); i++)
    	{
     	    if(freq[str.charAt(i)-'a']==0)
     	      freq[str.charAt(i)-'a']++;
     	    else  
     	    {
     	        isogram=false;
     	        break;
     	    }
    	} 
    	
    	if(isogram==false)
    	  System.out.println(str+" is not an isogram");
    	else
    	  System.out.println(str+" is an isogram");
   }
}
