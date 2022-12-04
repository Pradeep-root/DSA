import java.util.*;
class Permutation {

    public static void main(String args[]){
	System.out.println(""+permutation("PD", "PdfdD"));
	
    }

    public static String sort(String s1){
	char[] chars = s1.toCharArray();
	Arrays.sort(chars);
	return new String(chars);
    }

    public static boolean permutation(String s1, String s2){
	if(s1.length() != s2.length()) return false;

	return sort(s1).equals(sort(s2));
    }
}
