package IIIrdWeakDSA;

public class BST {
    class treeNode {
        private int value;
        private treeNode left;
        private treeNode right;

        treeNode(int value) {
            this.value = value;
        }

    }

    treeNode root;

    public void insert(int value) {
        root = insert(root, value);
    }

    public treeNode insert(treeNode root, int value) {
        if (root == null) {
            root = new treeNode(value);
            return root;
        }
        if (value < root.value) {
            root.left = insert(root.left, value);

        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    void printbst() {
        printbst(root);
    }

    void printbst(treeNode root) {
        if (root == null) {
            return;

        }
        printbst(root.left);
        System.out.println(root.value);
        printbst(root.right);

    }

    void search(int value) {
        if (search(root, value) != null) {
            System.out.println("found");
        } else {
            System.out.println("Not found");
        }

    }

    treeNode search(treeNode root, int value) {
        if (root.value == value || root == null) {
            return root;
        }
        if (value < root.value) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }

    void finder(treeNode root, int k) {
        if (root == null) {
            return;
        }
        if (root.value == k) {
            closest_key = k;
            return;
        }

        if (Math.abs(root.value - k) < diff) {
            diff = Math.abs(root.value - k);
            closest_key = root.value;
        }
        if (k < root.value) {
            finder(root.left, k);

        } else
            finder(root.right, k);
    }

    int closest_key, diff;

    int findclosest(int k) {
        closest_key = -1;
        diff = 999999999;

        finder(root, k);
        return closest_key;

    }

    public static void main(String[] args) {

        BST bst = new BST();
        bst.insert(50);
        bst.insert(20);
        bst.insert(71);
        bst.insert(40);
        bst.insert(60);
        bst.insert(30);
        bst.printbst();
        bst.search(71);
        bst.findclosest(10);
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j * j);
        // }
        // System.out.println();
        // }
    }

}
