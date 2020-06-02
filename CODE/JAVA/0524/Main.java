import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;


public class Main {
  static String findWord(String[] arr) 
    { 
  
        // Create HashMap to store word and it's frequency 
        HashMap<String, Integer> hs = new HashMap<String, Integer>(); 
  
        // Iterate through array of words 
        for (int i = 0; i < arr.length; i++) { 
            // If word already exist in HashMap then increase it's count by 1 
            if (hs.containsKey(arr[i])) { 
                hs.put(arr[i], hs.get(arr[i]) + 1); 
            } 
            // Otherwise add word to HashMap 
            else { 
                hs.put(arr[i], 1); 
            } 
        } 
  
        // Create set to iterate over HashMap 
        Set<Map.Entry<String, Integer> > set = hs.entrySet(); 
        String key = ""; 
        int value = 0; 
  
        for (Map.Entry<String, Integer> me : set) { 
            // Check for word having highest frequency 
            if (me.getValue() > value) { 
                value = me.getValue(); 
                key = me.getKey(); 
            } 
        } 
  
        // Return word having highest frequency 
        return key; 
    } 
  public static List<String> ngrams(int n, String str) {
    List<String> ngrams = new ArrayList<String>();
    for (int i = 0; i < str.length() - n + 1; i++)
        // Add the substring or size n
        ngrams.add(str.substring(i, i + n));
        // In each iteration, the window moves one step forward
        // Hence, each n-gram is added to the list

    return ngrams;
  }
   public static void main(String[] args) throws IOException{
      File file = new File("ngramCheck.txt");
      int i;
      if(file.exists())
      {
        BufferedReader inFile = new BufferedReader(new FileReader(file)); String sLine = null;
        String num = null;
        int temp_num;
        String k ="Paragraph #";
        String blankk1 = "\n    unigram : ";
        String blankk2 = "\n    bigram : ";
        String blankk3 = "\n    trigram : ";
        String blankk4 = "\n";
        int countm = 1;
        OutputStream output = new FileOutputStream("Output.txt");
        while (true) {
          num=inFile.readLine();
          if(num == null){
            break;
          }
          temp_num = Integer.parseInt(num);
          if(temp_num == 0){
            break;
          }
          StringBuilder sb = new StringBuilder("");
          for(i=0;i<temp_num;i++){
            sLine=inFile.readLine();
            String[] temp=sLine.split("[,. ]");

            for(String name : temp){
              sb.append(name);
            }

        }
        if(num == "0"){
            break;
        }
        String tok = Integer.toString(countm);
        List<String> ngrams = ngrams(1, sb.toString());
        String[] arry = ngrams.toArray(new String[ngrams.size()]);
        String sol1 = findWord(arry);
        List<String> ngrams2 = ngrams(2, sb.toString());
        String[] arry2 = ngrams2.toArray(new String[ngrams2.size()]);
        String sol2 = findWord(arry2);  
        List<String> ngrams3 = ngrams(3, sb.toString());
        String[] arry3 = ngrams3.toArray(new String[ngrams3.size()]);
        String sol3 = findWord(arry3);  
        countm+=1;
        String anss1 = sol1;
        byte[] blanky1 = blankk1.getBytes();
        byte[] blanky2 = blankk2.getBytes();
        byte[] blanky3 = blankk3.getBytes();
        byte[] blanky4 = blankk4.getBytes();
	      byte[] by=k.getBytes();
        byte[] by1=tok.getBytes();
        byte[] ans1=anss1.getBytes();
        byte[] ans2=sol2.getBytes();
        byte[] ans3=sol3.getBytes();
	      output.write(by);
        output.write(by1);
        output.write(blanky1);
        output.write(ans1);
        output.write(blanky2);
        output.write(ans2);
        output.write(blanky3);
        output.write(ans3);
        output.write(blanky4);
          
          
			
	    
      } 
    }
  }
}
