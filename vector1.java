import java.util.*;  
class Vector1 
{  
       public static void main(String args[]) 
      {  
                   Vector<String> vec = new Vector<String>(4);  
                    vec.add(" Tiger");  
                    vec.add(" Lion");  
                    vec.add(" Dog");  
                    vec.add(" Elephant");    
                    System.out.println("\n Size is: "+vec.size());  
                    System.out.println("\n Default capacity is: "+vec.capacity());  
                    System.out.println("\n Vector element is: "+vec);  
                    vec.addElement(" Rat");  
                    vec.addElement(" Cat");  
                    vec.addElement(" Deer");   
                    System.out.println("\n Size after addition: "+vec.size());  
                    System.out.println("\n Capacity after addition is: "+vec.capacity());  
                    System.out.println("\n Elements are: "+vec);           
                    if(vec.contains(" Tiger"))  
                   {  
                                 System.out.println("\n Tiger is present at the index " +vec.indexOf("Tiger"));  
                   }  
                   else  
                  {  
                                 System.out.println("\n Tiger is not present in the list.");  
                  }  
                  System.out.println("\n The first animal of the vector is = "+vec.firstElement());    
                  System.out.println("\n The last animal of the vector is = "+vec.lastElement());   
        }  
}
