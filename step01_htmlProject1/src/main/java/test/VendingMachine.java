package test;

import java.util.Stack;

/* wait()와 notify()를 이용하여 완성
 * Stack store=new Stack();
 * 
 * pop() : 꺼냄
 * push() : 넣기
 * 
 */

public class VendingMachine {
	Stack store=new Stack();
	public synchronized String getDrink() {
		while(store.isEmpty())
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return store.pop().toString();
	}	
	public synchronized void putDrink(String drink) {
		notify();
		store.push(drink);
	
	}
	
}
