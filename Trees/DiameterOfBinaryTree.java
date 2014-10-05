package Trees;

public class DiameterOfBinaryTree {
	private class HeightWrapper {
    int height = 0;
}

private int getDiameter_helper(TreeNode root, HeightWrapper wrapper) {
    if (root == null) {
        return 0; // diameter and height are 0
    }

    /* wrappers for heights of the left and right subtrees */
    HeightWrapper lhWrapper = new HeightWrapper();
    HeightWrapper rhWrapper = new HeightWrapper();

    /* get heights of left and right subtrees and their diameters */
    int leftDiameter = getDiameter_helper(root.getLeft(), lhWrapper);
    int rightDiameter = getDiameter_helper(root.getRight(), rhWrapper);

    /* calculate root diameter */
    int rootDiameter = lhWrapper.height + rhWrapper.height + 1;

    /* calculate height of current node */
    wrapper.height = Math.max(lhWrapper.height, rhWrapper.height) + 1;

    /* calculate the diameter */
    return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
}

public int getDiameter(TreeNode root) {
    HeightWrapper wrapper = new HeightWrapper();
    return getDiameter_helper(root, wrapper);
}
}
