package accmodi;

class Polytest {  
	  void sum(int a,int b){System.out.println(a+b);}  
	  void sum(int a,int b,int c){System.out.println(a+b+c);}  

	  public static void main(String args[]) {  
		  Polytest obj=new Polytest();  
	    obj.sum(10,10,10);  // 30
	    obj.sum(20,20);     //40 
	  }  
	} 
