package Thread;

public class ThreadExample_1 {

	public static void main(String[] args) {
		T t = new T();
		t.run();
		/*Thread thread = new Thread(t);
		Thread thread1 = new Thread(t);
		thread.start();
		thread1.start();*/

	}

}


class T implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Hi");
		
	}
	
}