import java.util.Random;

public class Tree {
    Node root;
    int depth;
    int nodesNumber;

    Tree(int nodesNumber){
        this.nodesNumber = nodesNumber;
    }

    void insertNode(Node root, Node newNode){
        if(root == null) {
            root = newNode;
            return;
        }

        if(newNode.val <= root.val) {
            insertNode(root.left, newNode);
        } else {
            insertNode(root.right, newNode);
        }
    }

    /**
     * Intialise the tree with random values of nodes.
     */
    void initTree(){
        for(int i=0;i<nodesNumber;i++) {
            Random random = new Random();
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
}
