import java.util.*;

public class FindPermutation {


	public static void main(String args[]){
		System.out.println(findPermutation("Pradeep", "Pradeep")+"");
	}


	public static boolean findPermutation(String stringA, String stringB){

		if(stringA != stringB){
			return false;
		}

		char[] charsA = stringA.toCharArray();
		char[] charsB = stringB.toCharArray();

		Arrays.sort(charsA);
		Arrays.sort(charsB);

		for(int i = 0; i < stringA.length(); i++){
			if(charsA[i] != charsB[i]){
			return false;
		   }
		}

		return true;
	}

}