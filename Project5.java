import java.util.*;
import java.io.*;

public class Project5{

 
  


  public static void main(String []args){
    // Creating a linkedlist list of string data type
    LinkedList<String> list = new LinkedList<String>();

    //Creatign a PriorityQueue of String data type
    PriorityQueue<String> queue = new PriorityQueue<String>();
     
    
      try{
          // The file path should be given to file input stream
          FileInputStream fstream = new FileInputStream("file.txt");
          BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
          String readline;
          System.out.println("The unsorted list from the file");

          //reading from a file until it is empty
          while ((readline = br.readLine()) != null) {
             
            System.out.println(readline);
            //store the string in linkedlist as well ass Priority Queue
            list.add(readline);
            queue.add(readline);
          }
          fstream.close();
         } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
         }   

         //sorting the linked list  and ignoring case sensitive
         list.sort(String::compareToIgnoreCase); 
         System.out.println("Linked List after the sorted in Ascending order");
          for (int i = 0; i < list.size(); i++) {
            
            System.out.println(list.get(i));
        }      

      //while removing from queue it will print out in Ascending order until the queue is empty
      System.out.println("PriorityQueue after the sorted in Ascending order");
      while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
}
}