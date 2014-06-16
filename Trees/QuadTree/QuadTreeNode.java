package Trees;

public class QuadTreeNode {
	int data;
	QuadTreeNode firstLeft;
	QuadTreeNode secondLeft;
	QuadTreeNode firstRight;
	QuadTreeNode secondRight;
	public QuadTreeNode(int data) {
		this.data=data;
		this.firstLeft=null;
		this.secondLeft=null;
		this.firstRight=null;
		this.secondRight=null;
		// TODO Auto-generated constructor stub
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public QuadTreeNode getFirstLeft() {
		return firstLeft;
	}
	public void setFirstLeft(QuadTreeNode firstLeft) {
		this.firstLeft = firstLeft;
	}
	public QuadTreeNode getSecondLeft() {
		return secondLeft;
	}
	public void setSecondLeft(QuadTreeNode secondLeft) {
		this.secondLeft = secondLeft;
	}
	public QuadTreeNode getFirstRight() {
		return firstRight;
	}
	public void setFirstRight(QuadTreeNode firstRight) {
		this.firstRight = firstRight;
	}
	public QuadTreeNode getSecondRight() {
		return secondRight;
	}
	public void setSecondRight(QuadTreeNode secondRight) {
		this.secondRight = secondRight;
	}
	
}
