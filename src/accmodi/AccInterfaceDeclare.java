package accmodi;

public class AccInterfaceDeclare implements AccInterfaceTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
	int c=0;
		for( int i=0; i<=c;i++){
			
				c=i;
				c= a+b;	
		}
			System.out.println(c);
	c++;
	}

	@Override
	public void substract(int a, int b) {
		// TODO Auto-generated method stub
		int c= a-b;
		System.out.println(c);
	}

	@Override
	public void multiply(int a, int b) {
		// TODO Auto-generated method stub
		int c= a*b;
		System.out.println(c);
		
	}

	@Override
	public void divide(int a, int b) {
		// TODO Auto-generated method stub
		int c= a/b;
		System.out.println(c);
				
	}

}
