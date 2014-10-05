package Trees;

public class HeightBalancedTreeCheck {
	public static void main(String[] args){
		TreeNode root=new TreeNode(10);
		root.setLeft(new TreeNode(5));
		root.setRight(new TreeNode(100));
		root.getLeft().setLeft(new TreeNode(50));
		root.getLeft().setRight(new TreeNode(150));
		root.getLeft().getLeft().setLeft(new TreeNode(90));
		if(isHeightBalancedTree(root))
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");
	}

	public static boolean isHeightBalancedTree(TreeNode root) {
		boolean balanced = true;
		HeightBalanced(root, balanced);
		return balanced;
	}

	public static int HeightBalanced(TreeNode root, boolean balanced) {

		if (root == null) {
			return 0;
		}

		int lmax = HeightBalanced(root.getLeft(), balanced) + 1;
		int rmax = HeightBalanced(root.getRight(), balanced) + 1;
		if (lmax != 0 && rmax != 0)
			balanced = (Math.max(lmax, rmax) <= 2 * Math.min(lmax, rmax));
		return Math.max(lmax, rmax);
	}

}
