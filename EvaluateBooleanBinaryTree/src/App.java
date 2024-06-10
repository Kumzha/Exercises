public class App {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}
        TreeNode(int val) { this.val = val; }

        TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        }
    }

    public boolean evaluateTree(TreeNode root) {
        if(root.val == 1) return true;

        if(root.val == 2&&(evaluateTree(root.left) == true || evaluateTree(root.right) == true)){
            return true;
        }
        if(root.val == 3&&(evaluateTree(root.left) == true && evaluateTree(root.right) == true)){
            return true;
        }


        return false;
    }

    public static void main(String[] args) {
        
    }
}
