package com.java.main;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyArrayDequeClass {
	
	public static void main(String str []) {
		
		// Creating ArrayDeque with initial capacity sufficient to hold 16 elements
		Deque<String> queue = new ArrayDeque<>();
		
		// Adding elements with different methods add, addFirst, addLast, push
		queue.add("first");
		queue.add("second");
		queue.add("third");
		queue.add("fourth");
		
		// Printing que to console
		System.out.println(queue);
		
		// Using method push adding element to the first place
		queue.push("fifth");
		
		// Printing que to console
		System.out.println(queue);
		
		// Using method addFirst adding element to the first place
		queue.addFirst("sixth");
		
		// Printing que to console
		System.out.println(queue);
		
		// Using method addLast adding element to the first place
		queue.addLast("seventh");
				
		// Printing que to console
		System.out.println(queue);
		
		// Checking if there is element "sixth" with method contains
		System.out.println(queue.contains("sixth")); // true = yes
		
		// Checking if there is element "sixth" with method contains
		System.out.println(queue.contains("hundredth")); // false = no
		
		// Getting the first element of the que
		System.out.println("First element is:" + queue.getFirst());
		
		// Getting the last element of the que
		System.out.println("Last element is:" + queue.getLast());
		
		// Method peek to show the first element
		System.out.println(queue.peek());
		
		// Printing que to console
		System.out.println(queue);
		
		// Method poll to show and remove the first element of the que
		System.out.println(queue.poll());
		
		// Printing que to console
		System.out.println(queue);
		
		// Method remove to show and delete head of the queue
		System.out.println("Removed element is: " + queue.remove());
	
		// Printing que to console
		System.out.println(queue);
				
		// Method pop to show head of the queue and delete it
		System.out.println("Popped element is: " + queue.pop());
		
		// Method element to show the first element without removing it
		System.out.println("First element is:" + queue.element());
		
		// Printing que to console
		System.out.println(queue);
		
	}
}
