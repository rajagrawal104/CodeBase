package Trees.BinarySearchTreeToDLL;

class DLLNode {
	int data;
	public int getdata() {
		return data;
	}

	public void setdata(int data) {
		this.data = data;
	}

	public DLLNode getPrevious() {
		return previous;
	}

	public void setPrevious(DLLNode previous) {
		this.previous = previous;
	}

	public DLLNode getNext() {
		return next;
	}

	public void setNext(DLLNode next) {
		this.next = next;
	}

	DLLNode previous;
	DLLNode next;
	
	public DLLNode(int v) {
		this.data = v;
		this.previous = null;
		this.next = null;
	}
}

class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;
}

public class BinarySearchTreeToDoublyLinkedList {
	
	public static void main(String[] args) {
		TreeNode treeNode23 = new TreeNode();
		treeNode23.data = 23;
		TreeNode treeNode16 = new TreeNode();
		treeNode16.data = 16;
		TreeNode treeNode29 = new TreeNode();
		treeNode29.data = 29;
		TreeNode treeNode8 = new TreeNode();
		treeNode8.data = 8;
		TreeNode treeNode19 = new TreeNode();
		treeNode19.data = 19;
		TreeNode treeNode25 = new TreeNode();
		treeNode25.data = 25;
		TreeNode treeNode1 = new TreeNode();
		treeNode1.data = 1;
		TreeNode treeNode12 = new TreeNode();
		treeNode12.data = 12;
		
		treeNode23.left = treeNode16;
		treeNode23.right = treeNode29;
		treeNode16.left = treeNode8;
		treeNode16.right = treeNode19;
		treeNode29.left = treeNode25;
		treeNode29.right = null;
		treeNode8.left = treeNode1;
		treeNode8.right = treeNode12;
		treeNode19.left = null;
		treeNode19.right = null;
		treeNode25.left = null;
		treeNode25.right = null;
		treeNode1.left = null;
		treeNode1.right = null;
		treeNode12.left = null;
		treeNode12.right = null;
		
		DLLNode list = ConvertBinarySearchTreeToDll(treeNode23);
		DLLNode current = list;
		
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
		
		current = list;
		
		while(current.next != null){
			current = current.next;
		}
		
		while(current != null) {
			System.out.println(current.data);
			current = current.previous;
		}
		
	}

	private static DLLNode ConvertBinarySearchTreeToDll(TreeNode root) {
		DLLNode head = null;
		DLLNode temp = null;
		DLLNode current = null;
		
		if(root == null) {
			return null;
		} else {
			head = ConvertBinarySearchTreeToDll(root.left);
			temp = head;
			
			if(temp == null) {
				head = new DLLNode(root.data);
				temp = head;
			} else {
				while(temp.next != null) {
					temp = temp.getNext();
				}
				temp.setNext( new DLLNode(root.data));
				temp.getNext().setPrevious(temp);
				temp = temp.getNext();
			}
			
			current = ConvertBinarySearchTreeToDll(root.right);
			
			if(current != null) {
				temp.setNext(current);
				current.setPrevious(temp);
			}
		}
		return head;
	}

}
