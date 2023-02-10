package test;

public class Consumer extends Thread {
	private VendingMachine vm;
	
	public Consumer(VendingMachine vm) {
		this.vm=vm;
	}
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+vm.getDrink()+" 꺼내먹음");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	


}
