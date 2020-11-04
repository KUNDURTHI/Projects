package fortuneminds;

public class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data){
		this.value = data;
		
	}
	
	TreeNode(int data, TreeNode left, TreeNode right){
		this.value = data;
		this.left = left;
		this.right = right;
	
	}
	
 abstract class Leafnodes implements FortuneStrings{

	 public void getLeafNodes(TreeNode node) throws FortuneException {
		if(node != null && node.left != null && node.right != null) {
		System.out.println("The Right node of the Tree::" + node.right);
		System.out.println("The Right node of the Tree::" + node.left);
		}
		
	}

	}
}