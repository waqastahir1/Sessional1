/**
 * 
 */
package labSessional;

import java.util.Scanner;

/**
 * @author Waqas Tahir
 *
 */
public class Main {

	/**
	 * finds a chracter at first position in a string
	 * @param s: String to check for a chracter ch
	 * @param ch: character to look for in string s
	 * @return integer value of index at which chracter is found, if chracter not found then returns a flag value
	 */
	static int compare(String s, char ch){
		int index = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==ch){
				index=i+1;
				return index;
			}
			else{
				index=-1;
			}
		}
		
		return index;
		}
	/**
	 * main method in which we get string and a char value from user
	 *  a scanner for to get values from user
	 *  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a string");
		String sentence=sc.nextLine();
		System.out.println("please enter a chracter to find index in string");
		char ch=sc.next().charAt(0);
		int index=compare(sentence,ch);
		if(index!=-1){
				System.out.println("Character "+ch+" is found at "+index+" index");
		}
		else
		{
			System.out.println("Character not Found");
		}
	}
}
	


