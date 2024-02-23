package iterators;

import java.util.Stack;

public class SpecialSymbols {

	public static void main(String[] args) {

		String s = "{()[]}";

		System.out.println(checkValid(s));

	}

	private static boolean checkValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for(char c:s.toCharArray()) {
			
			if(c == '{' ||c == '('|| c == '[') {
				stack.push(c);
			}else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			}else {
				return false;
			}
		}
         return stack.isEmpty();  
	}
}
