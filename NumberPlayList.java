package com.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberPlayList {
	public static void main(String[] args) {
	
		//Creating sample Collection
		List<Integer> myNumberList = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++) myNumberList.add(i);
		
		//Method 1: traversing using Iterator
		Iterator<Integer> it = myNumberList.iterator();
		while(it.hasNext()) {
			Integer integer = it.next();
			System.out.println("Mth1: Iterator Value::" + integer);
		}
		
		//Method 2: Traversing with Explicit Consumer interface implementation
		class MyConsumer implements Consumer<Integer> {
			public void accept(Integer t) {
				System.out.println("Mth2: Consumer impl Value:: " + t);
			}
		}
		MyConsumer actionConsumer = new MyConsumer();
		myNumberList.forEach(actionConsumer);
		
		//Method 3: Traversing with Anonymous Consumer interface implementation
		myNumberList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("Mth3: forEach anonymous class Value:: " + t);
		}
		});
		
		//Method 4: Explicit Lambda Function
		Consumer<Integer>myListActionConsumer = n -> {
				System.out.println("Mth4: forEach anonymous class Value:: " + n);
		};
				myNumberList.forEach(myListActionConsumer);
					
		//Method 5: Implicit Lambda Function
		myNumberList.forEach(n-> {
				System.out.println("Mth5: forEach Lambda implement Value: " + n);
		});
		
		//Method 6: Implicit Lambda Function to print double value
		Function<Integer, Double> toDoubleFunction = Integer::doubleValue; //n -> n.doubleValue();
				myNumberList.forEach(n-> {
						System.out.println("Mth6: forEach Lambda implement Value: " + toDoubleFunction.apply(n));
		});
		}
	

		}
 	

