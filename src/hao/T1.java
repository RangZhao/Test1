package hao;

import java.util.Stack;

public class T1 {
}
class Solution1 {


    public String notReCuPreOrder (TreeNode root) {
        // write code here
        if (root==null)return "";
        StringBuffer buffer = new StringBuffer();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode pop = stack.pop();
            if (pop!=null){
                buffer.append(pop.val);
                buffer.append(",");
                stack.push(pop.right);
                stack.push(pop.left);
            }
        }
        if (buffer.length()>0)
        buffer.deleteCharAt(buffer.length()-1);
        return buffer.toString();
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        System.out.println(new Solution1().notReCuPreOrder(node));
    }
}
class TreeNode {
    int val=0;
    TreeNode left =null;
    TreeNode right=null;

    public TreeNode(int val) {
        this.val = val;
    }
}
