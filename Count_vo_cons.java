//counting vowels and consonants
import java.util.Scanner;
class Count_vo_cons
{
  public static void main(String[] args)
  {
    int n,i,vcount=0,ccount=0;
    String s;
    Scanner in = new Scanner(System.in);
    System.out.println("enter the string:");
    s=in.nextLine();
    n=s.length();
    for(i=0;i<n;i++)
    {
      if((s.charAt(i)=='A')||(s.charAt(i)=='E')||(s.charAt(i)=='I')||(s.charAt(i)=='O')||(s.charAt(i)=='U')||(s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
      {
        vcount++;
      }
      else
      {
        ccount++;
      }
    }
    System.out.println("vowels count:"+vcount);
    System.out.println("consonants count:"+ccount);
  }
}
