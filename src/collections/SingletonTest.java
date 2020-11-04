package collections;

public class SingletonTest {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i <= 10; i++) {
			SingleTon singleTon = SingleTon.getInstance();
			System.out.println(singleTon);
		}
		// This is reflection concept and implementation to break the singleton
		// implementation to avoid the break the Singleton implementation we used the to
		// throw the exception class so that if anyone uses reflection to create a new
		// instance the Exception will be thrown.
		//Singleton class will create one object per JVM.

//		SingleTon.class.getDeclaredConstructors(); *** breaking the singleton implementation ***

	}

}

class SingleTon {
	private static SingleTon singleTon = null;

	private SingleTon() throws Exception {
		if(singleTon !=null)
		throw new Exception("Cann't create instance");

	}

	public static SingleTon getInstance() throws Exception {

		// Here we are used double null check to avoid the braking of singleton while
		// using the singleton class in the thread implementation and we implemented the
		// Synchronization.

		if (singleTon == null) {
			synchronized (SingleTon.class) {
				if (singleTon == null) {
					singleTon = new SingleTon();
				}
			}
		}
		return singleTon;
	}

}
