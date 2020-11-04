package fortuneminds;

import java.util.Scanner;

public class StrPrem {

	private static Scanner sc;
	private static TreeNode.Leafnodes lf;
	private static TreeNode node;

	public static void main(String[] args) throws FortuneException {
		sc = new Scanner(System.in);
		System.out.println("Enter The String::");
		String s1 = sc.nextLine();
		Duplicates dp = new Duplicates();
		dp.getDupli(s1);
		try {
	if (lf != null && node != null)
			lf.getLeafNodes(node);
		}catch (Exception e){
			e.printStackTrace();
			System.out.print("Exception Occured at TreeNode class" + e);
			
		}
		
		System.out.println("Enter the integer::");
		int i = sc.nextInt();
		System.out.println("Enter the integer::");
		int j = sc.nextInt();
		System.out.println("Enter the integer::");
		int k = sc.nextInt();
		
		LargetUsingTernary lut = new LargetUsingTernary();
		lut.getLargest(i, j, k);
		
		

	}

}
