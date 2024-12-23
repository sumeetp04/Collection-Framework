package te_18_12_24_HashMap;

import java.util.HashMap;

public class HashMapp

{
  
    
    public static void main(String[] args) 
    {
      HashMap <String,Integer> hm = new HashMap <>();
      hm.put("FB",11);
      hm.put("Ea",12);
      System.out.println(hm.get("FB"));
      System.out.println(hm);
    }

}
