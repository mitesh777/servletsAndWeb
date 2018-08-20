package com.pratian.client;

import com.pratian.mycollection.Stack;
import com.pratian.myexception.StackEmptyException;
import com.pratian.myexception.StackFullException;

public class StackDemo {
	public static void main(String[] args) {
		Stack stack=new Stack();
		try {
			stack.display();
			//stack.pop();
			stack.push(12);
			stack.push(13);
			stack.push(14);
			stack.push(1);
			stack.push(15);
			stack.push(12);
			stack.push(10);
			stack.push(15);
			stack.push(19);
			stack.push(18);
			stack.display();
			//stack.push(12);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			//catch (StackFullException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		 catch(StackEmptyException e) {
//			 e.printStackTrace();
//		 }
		
	}
}
