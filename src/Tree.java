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

    void initTree(){
        for(int i=0;i<nodesNumber;i++) {

        }
    }
}
