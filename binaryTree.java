package IIIrdWeakDSA;

import java.util.Stack;

public class binaryTree {

    class treeNode {
        int data;
        treeNode left;
        treeNode right;

        treeNode(int data) {
            this.data = data;
        }
    }

    treeNode root;

    public void createBinaryTree() {
        treeNode first = new treeNode(10);
        treeNode second = new treeNode(20);
        treeNode third = new treeNode(30);
        treeNode fourth = new treeNode(40);
        treeNode fifth = new treeNode(50);

        root = first; // second <--- first ---> third
        first.left = second; // fourth <--- second ---> fifth
        first.right = third;
        second.left = fourth;
        second.right = fifth;

    }

    void postorder(treeNode root) {

        if (root == null) {
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data + " ");

    }

    void PreorderTravese(treeNode root) {// Recursive preOrder traverse is following protocol :root, left, right;
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");// it will print 10 20 40 50 30

        PreorderTravese(root.left);// preOrder always follow firstleft recursive call;
        PreorderTravese(root.right);
    }

    void PreorderTravese() {// Iterative preorder traverse //

        if (root == null) {
            return;
        }

        Stack<treeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            treeNode temp = stack.pop();

            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    void inorder(treeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        tree.createBinaryTree();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
    }

}
