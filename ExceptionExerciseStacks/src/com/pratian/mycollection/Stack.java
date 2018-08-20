package com.pratian.mycollection;

import com.pratian.myexception.StackEmptyException;
import com.pratian.myexception.StackFullException;

public class Stack {
	int[] arr = new int[10];
	int i=0;
	public void push(int data) throws StackFullException {
		if(i==10)
			throw new StackFullException("Stack is full");
		else
			arr[i++]=data;
	}
	
	public int pop() throws StackEmptyException{
		if(i==0)
			throw new StackEmptyException("Stack is empty");
		else
			return arr[--i];
	}
	
	public void display() throws StackEmptyException{
		if(i==0)
			throw new StackEmptyException("Stack is empty");
		else
			for(int j=i;j>=1;) {
				System.out.println(arr[--j]+" ");
			}
	}
}
