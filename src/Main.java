import java.util.Random;

public class Main {

    public static final int MAX_TREE = 100;
    public static final int MAX_NODE = 10000;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Random random = new Random();
        Tree tree = new Tree(random.nextInt(MAX_TREE));
        //tree.initTree();

        // Test Search
        Node root = new Node(6);
        tree.setRoot(root);
        tree.insertNode(null, root);
        tree.insertNode(tree.getRoot(), new Node(7));
        tree.insertNode(tree.getRoot(), new Node(8));
        tree.insertNode(tree.getRoot(), new Node(3));
        tree.insertNode(tree.getRoot(), new Node(5));
        tree.printTree();
        tree.deleteNode(tree.getRoot(), new Node(5));
        tree.printTree();
        System.out.println(tree.treeSearch(root, new Node(9)));
        System.out.println(tree.lowestCommonAncestor(tree.getRoot(), new Node(3), new Node(8)).val);

    }
}
