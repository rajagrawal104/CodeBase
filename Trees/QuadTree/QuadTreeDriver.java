package Trees;

public class QuadTreeDriver {

	public static void main(String[] args) {
		QuadTree q=new QuadTree();
		QuadTreeNode root = new QuadTreeNode(1);
		q.InsertInQuadTree(root, 2);
		q.InsertInQuadTree(root, 3);
		q.InsertInQuadTree(root, 4);
		q.InsertInQuadTree(root, 5);
		q.InsertInQuadTree(root, 6);
		q.InsertInQuadTree(root, 7);
		q.InsertInQuadTree(root, 8);
		q.InsertInQuadTree(root, 9);

		q.InsertInQuadTree(root, 10);
		q.InsertInQuadTree(root, 11);
		q.InsertInQuadTree(root, 12);
		
		
		q.printQuadTreeInLevelOrder(root);
		System.out.println("Printing Quad Tree in PreOrder");
		q.printQuadTreeInPreorder(root);
		// TODO Auto-generated method stub

	}

}
