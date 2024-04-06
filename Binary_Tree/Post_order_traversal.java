public class Post_order_traversal {

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node createTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = createTree(nodes);
            newNode.right = createTree(nodes);
            return newNode;
        }

        public static void postOrder(Node root) {
            if (root == null) {
                // System.out.print(-1+", ");
                return;
            }

            postOrder(root.left);

            postOrder(root.right);
            System.out.print(root.data + ", ");

        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node node = bt.createTree(nodes);
        System.out.println(node.data);
        System.out.println(node.right.data);

        bt.postOrder(node);
    }

}
