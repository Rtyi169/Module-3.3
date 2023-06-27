import java.util.ArrayList;

class Node {
    int id;
    int left;
    int right;

    public Node(int id, int left, int right) {
        this.id = id;
        this.left = left;
        this.right = right;
    }
}

public class LeafNodePrinter {
    private static void printLeafNodes(ArrayList<Node> nodes, int nodeId) {
        if (nodeId == -1) {
            return; // Base case: Empty node
        }

        Node currentNode = nodes.get(nodeId);

        if (currentNode.left == -1 && currentNode.right == -1) {
            System.out.println(currentNode.id); // Print leaf node id
        }

        printLeafNodes(nodes, currentNode.left); // Recursively print leaf nodes in the left subtree
        printLeafNodes(nodes, currentNode.right); // Recursively print leaf nodes in the right subtree
    }

    public static void main(String[] args) {
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(new Node(0, 1, 2)); // Root node
        nodes.add(new Node(1, 3, 4));
        nodes.add(new Node(2, 5, 6));
        nodes.add(new Node(3, -1, -1)); // Leaf node
        nodes.add(new Node(4, 7, -1));
        nodes.add(new Node(5, -1, 8));
        nodes.add(new Node(6, -1, -1)); // Leaf node
        nodes.add(new Node(7, 9, 10));
        nodes.add(new Node(8, -1, -1)); // Leaf node
        nodes.add(new Node(9, -1, -1)); // Leaf node
        nodes.add(new Node(10, -1, -1)); // Leaf node

        int rootId = 0;
        printLeafNodes(nodes, rootId);
    }
}