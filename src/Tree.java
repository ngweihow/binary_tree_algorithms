import java.util.Random;

public class Tree {
    private Node root = null;
    private int depth;
    private int nodesNumber;

    public static final int COUNT = 10;

    Tree(int nodesNumber){
        this.nodesNumber = nodesNumber;
    }

    Node insertNode(Node root, Node newNode){
        if(root == null) {
            root = newNode;
            return root;
        }

        if(newNode.val <= root.val) {
            root.left = insertNode(root.left, newNode);
        } else {
            root.right = insertNode(root.right, newNode);
        }

        return root;
    }

    /**
     * Intialise the tree with random values of nodes.
     */
    void initTree(){
        // Add a root first
        Random random = new Random();
        Node newRoot = new Node(random.nextInt(Main.MAX_NODE));
        root = newRoot;
        insertNode(this.root, newRoot);

        // Generate the subsequent Nodes
        for(int i=0;i<nodesNumber;i++) {
            Node newNode = new Node(random.nextInt(Main.MAX_NODE));
            insertNode(this.root, newNode);
            System.out.println(newNode.val);
        }
    }

    /**
     * Search for an existing node in the tree.
     * @param root
     * @param query
     * @return
     */
    boolean treeSearch(Node root, Node query) {
        if(root == null || query == null) return false;
        if(root.val == query.val) return true;

        if(query.val < root.val) {
            return treeSearch(root.left, query);
        } else {
            return treeSearch(root.right, query);
        }
    }

    /**
     * Print the Binary Tree.
     */
    public void printTree() {
        if(root != null) {
            print2DUtil(root, 0);
        }
    }

    /**
     * Method to print out binary tree horizontally.
     * Adapted from https://www.geeksforgeeks.org/print-binary-tree-2-dimensions/.
     * @param root Root of the tree, set recursively along with traversal.
     * @param space Space between the branches.
     */
    private static void print2DUtil(Node root, int space) {
        // Base case
        if (root == null) return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.val + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }

    public Node deleteNode(Node root, Node toBeRemoved) {
        if (root == null || toBeRemoved == null) return null;

        if(root.val == toBeRemoved.val){
            // If node to be deleted has no child
            if(root.left == null && root.right == null) {
                root = null;
                return null;
            }

            // If node to be deleted has one child
            
        }


    }


    // Getters and setters

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return this.root;
    }
}
