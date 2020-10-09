// Pangram Strings
import java.io.*;

class Pangram
{  public static void main(String args[]) throws IOException
   {  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
      	System.out.print("Enter String : ");
    	String str = br.readLine();
    	
    	boolean pangram[] = new boolean[26];
    	int index=0;

    	for(int i=0; i<str.length(); i++)
    	{
     	    if(str.charAt(i)>='A' && str.charAt(i)<='Z')
     	         index=str.charAt(i)-'A';
     	    else if(str.charAt(i)>='a' && str.charAt(i)<='z')
     	         index=str.charAt(i)-'a';
     	    else 
     	         continue;
     	  
     	    pangram[index]=true;
    	} 
    	
    	int cnt=1;
    	for(int i=0; i<26; i++)
    	{
    	    if(pangram[i]==false)
    	    {
    	        cnt=0;
    	        System.out.println(str+" is not a pangram");
    	        break;
    	    }   
    	}
    	
    	if(cnt==1)
    	  System.out.println(str+" is a pangram");
   }
}
