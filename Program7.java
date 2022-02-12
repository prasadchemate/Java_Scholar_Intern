import java.io.*;
import java.util.Scanner;
 
class Program7 
{
    public static void main (String[] args) {
       
        String str= "Java is a good Language", nstr="";
        char ch;
       
      System.out.print("Original String: ");
      System.out.println("Java is a good Language");
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        nstr= ch+nstr;
      }
      System.out.println("Reversed word: "+ nstr);
    }
}