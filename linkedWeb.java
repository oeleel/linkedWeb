import java.util.*;

public class LinkedWeb implements Webable {
   private ArrayList<WebNode> board;
   
   public LinkedWeb() {
      board = new ArrayList();                                                                                                                                                                                                                                                                                                                                                                            
   }
   
   public boolean add(String name, ArrayList<String> adjacent, Country c, int i) {
      board.add(i, new WebNode(name, adjacent, c));
      return true;
   }
    
   public boolean add(String name, ArrayList<String> adjacent, Country c) {
      board.add(new WebNode(name, adjacent, c));
      return true;
   }

   public void remove(int i) {
      board.remove(i);
   }
    
   public int size() {
      return board.size();
   }
    
   public boolean isEmpty() {
      if(board.size() == 0)
      {
         return true;
      }
      return false;
   }
   
   public String showUnlinked() {
      String ans = "";
       
      for(int i = 0; i< board.size(); i++)
      {
         ans += board.get(i).getName() + ", BORDERS:[";
         for(int j = 0; j<board.get(i).listNumNeighbors(); j++)  
         {
            ans += board.get(i).nameAtIndex(j) + " ";  
         }
         ans += "]";
         ans += "\n";
         ans += board.get(i).getCountry().toString();
         ans += "\n";
      }
       
      return ans;
   }
    
}

