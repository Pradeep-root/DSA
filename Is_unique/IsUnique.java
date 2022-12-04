
import java.util.*;

public class IsUnique {
    public static void main(String args[]) {
	System.out.println(isUnique("pradeep")+"");
    }


    public static boolean isUnique(String string){
 //    char[] chars = string.toCharArray();
	// Set<Character> setRecord = new HashSet<Character>();
	// for(char c: chars){
	//     if(setRecord.contains(c)){
	// 	return false;
	//     }else{
	// 	setRecord.add(c);
	//     }
	// }

	// return true;	

    	if(string.length() > 128) return false;

    	boolean[]  char_set = new boolean[128];

    	for(int i = 0; i < string.length(); i++){
    		int val = string.charAt(i);
    		print(val+"");
    		boolean re = char_set[val];
    		print(re+"");
    		if(re){
    			return false;
    		}

    		char_set[val] = true;

    	}
    	return true;

    }

    public static void print(String str){
    	System.out.println(str);
    }
    
}
