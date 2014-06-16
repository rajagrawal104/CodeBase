package Trees;

public class QuadTree {
	QuadTreeNode temp;
	
public void InsertInQuadTree(QuadTreeNode root, int data){
		Queue q=new Queue();
		if(null==root){
			root=new QuadTreeNode(data);
			return;
		}
		q.enqueue(root);
		while(!q.isEmpty()){
			temp=(QuadTreeNode) q.dequeue();
			if(temp.getFirstLeft() != null){
				q.enqueue(temp.getFirstLeft());
			}else{
				temp.setFirstLeft(new QuadTreeNode(data));
				return;
			}
			if(temp.getSecondLeft()!=null){
				q.enqueue(temp.getSecondLeft());
			}else{
				temp.setSecondLeft(new QuadTreeNode(data));
				return;
			}
			if(temp.getFirstRight()!=null){
				q.enqueue(temp.getFirstRight());
			}else{
				temp.setFirstRight(new QuadTreeNode(data));
				return;
			}
			if(temp.getSecondRight()!=null){
				q.enqueue(temp.getSecondRight());
			}else{
				temp.setSecondRight(new QuadTreeNode(data));
				return;
			}	
		}	
	}
public void printQuadTreeInLevelOrder(QuadTreeNode root){
	QuadTreeNode temp;
	Queue q=new Queue();
	if(root==null){
		return;
	}
	q.enqueue(root);
	while(!q.isEmpty()){
		temp=(QuadTreeNode)q.dequeue();
		System.out.println(temp.getData());
		if(temp.getFirstLeft()!=null){
			q.enqueue(temp.getFirstLeft());
		}
		if(temp.getSecondLeft()!=null){
			q.enqueue(temp.getSecondLeft());
		}
		if(temp.getFirstRight()!=null){
			q.enqueue(temp.getFirstRight());
		}
		if(temp.getSecondRight()!=null){
			q.enqueue(temp.getSecondRight());
		}
	}
}
public void printQuadTreeInPreorder(QuadTreeNode root){
	if(root!=null){
		System.out.println(root.getData());
		printQuadTreeInPreorder(root.getFirstLeft());
		printQuadTreeInPreorder(root.getSecondLeft());
		printQuadTreeInPreorder(root.getFirstRight());
		printQuadTreeInPreorder(root.getSecondRight());
	}
}
}
