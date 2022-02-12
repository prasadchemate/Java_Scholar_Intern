import java.util.ArrayList;  
  
public class Program9 
{  
   public static void main(String[] args) 
   {   
      ArrayList<String> arr = new ArrayList<String>(5);
      arr.add("Prasad");  
      arr.add("Jivan");  
      arr.add("Somesh");  
      arr.add("Manoj");  
      System.out.println("The list of the size is: " + arr.size());  
      for (String name : arr) 
	  {  
         System.out.println("Name is: " + name);  
      }     
      arr.remove(1);  
      System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size()); 
      for (String name : arr) 
	  {  
         System.out.println("Name is: " + name);  
      }  
   }  
}  