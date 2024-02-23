package stack;

import java.util.Arrays;
import java.util.Scanner;

public class ImplUsingArray {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack st = new Stack(sc.nextInt());
		
		st.push(13);  
		st.push(18);
		st.push(98);
		st.display();
		
		st.pop();
		st.display();
		st.peek();
		st.isEmpty();
	}
}
class Stack {
	
	int size ;
	int top =-1;
	int []st ;
	
	public Stack(int maxSize) {
		this.size = maxSize;
		st = new int[size];
	}
	
	//add the elements to the stack
	public void push(int i) {
		
		top++;
		st[top] = i;

	}

	//show the elements in the stack
	public void display() {
		
		System.out.println(Arrays.toString(st));
//		for(int i:st) {
//			System.out.print(i +" ");
//		}
	}

	//delete the elements in the top
	public void pop() {
		
		int data = st[top];
		System.out.println(st[top]);
		st[top] =0;
		top--;
	}

	//retrive the elements in the top
	public void peek() {
	
		int data = st[top];
		System.out.println(data);
	}

	public void isEmpty() {
		
	}

}

