import java.util.Random;

public class Main {

    public static final int MAX_TREE = 100;
    public static final int MAX_NODE = 10000;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Random random = new Random();
        Tree tree = new Tree(random.nextInt(MAX_TREE));
        tree.initTree();


    }
}
