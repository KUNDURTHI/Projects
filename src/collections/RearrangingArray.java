package collections;

public class RearrangingArray {

public static void reaggarnge(int[] array, int index){
	int temp = array[index];
	for(int i= index; i<array.length-1; i++){
		array[i] = array[i+1];
	}
	array[array.length-1] = temp;
	System.out.println("Printing the rearranged array::" + array[array.length-1]);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RearrangingArray rar = new RearrangingArray();
		int[] array = new int[]{0,2,3,4,15,77,99,88};
		rar.reaggarnge(array, 4);
		
		
		
	}

}
