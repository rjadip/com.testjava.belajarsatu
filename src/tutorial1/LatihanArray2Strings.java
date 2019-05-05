package tutorial1;

public class LatihanArray2Strings {

	public static void main(String[] args)
	{
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		for(String fruit: fruits)
		{
			System.out.println(fruit);
			System.out.println(fruits);
		}
		
		//int value = 0;
		
		String text = null;
		
		System.out.println("text : " + text);
		
		String[] texts = new String[2];
		
		System.out.println("array texts #1 : " + texts[0]);
		System.out.println("array texts #1 : " + texts[1]);
		
		texts[0] = "one";
		texts[1] = "two";
		
		System.out.println("array texts #2 : " + texts[0]);
		System.out.println("array texts #2 : " + texts[1]);
	}
}