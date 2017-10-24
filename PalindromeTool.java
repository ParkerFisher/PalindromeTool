
public class PalindromeTool {
public static void main(String[] args)
{
	String s = "aaa";
	System.out.println("Hello World!" );
	int count = 0;
	count += s.length(); //accounts for the single character palindromes    
	char[] reverse = new char[s.length()]; 
	
	
	
	for (int i = 0;i < s.length(); i++)
	{ 
		reverse[i] = s.charAt(s.length()-i-1); //gives the char array the characters of the inputted string in reverse 
	}
	for(int x = 0; x < s.length();x++)
	{   
		count = palinTest(s,reverse,count,x);
	}

   System.out.println(count);
}








static int palinTest(String s, char[] reverse, int count,int x) {

String reverseTest = String.valueOf(reverse);
for (int y = x+1;y < s.length();y++){
if (reverseTest.substring(x,y).equals(s.substring(s.length()-1-y,s.length()-1-x))) 
{    count++;
}
}
return count;


}
}
