package ADI_ETE;

import java.util.*;

class Node {
    int data;
    int depth;
    Node left, right;

    Node(int value, int d) {
        data = value;
        depth = d;
        left = right = null;
    }
}

class TopViewOfTree{
    Node root;

    TopViewOfTree() {
        root = null;
    }

    void insert(int value, int depth) {
        root = insertRec(root, value, depth);
    }

    Node insertRec(Node root, int value, int depth) {
        if (root == null)
            return new Node(value, depth);

        if (value < root.data)
            root.left = insertRec(root.left, value, depth + 1);
        else if (value > root.data)
            root.right = insertRec(root.right, value, depth + 1);

        return root;
    }

    void topView() {
        // Enter your code here
        class QueueNode {
            Node node;
            int hd;

            QueueNode(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        Queue<QueueNode> queue = new LinkedList<>();
        Map<Integer, Node> topViewMap = new TreeMap<>();

        if (root == null) {
            return;
        } else {
            queue.add(new QueueNode(root, 0));
        }

        while(!queue.isEmpty()) {
            QueueNode tmpNode = queue.poll();
            if (!topViewMap.containsKey(tmpNode.hd)) {
                topViewMap.put(tmpNode.hd, tmpNode.node);
            }

            if (tmpNode.node.left != null) {
                queue.add(new QueueNode(tmpNode.node.left, tmpNode.hd - 1));
            }
            if (tmpNode.node.right != null) {
                queue.add(new QueueNode(tmpNode.node.right, tmpNode.hd + 1));
            }
        }

        for (Map.Entry<Integer, Node> entry : topViewMap.entrySet()) {
            System.out.print(entry.getValue().data + " ");
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        TopViewOfTree tree = new TopViewOfTree();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            int depth = scanner.nextInt();
            tree.insert(value, depth);
        }

        tree.topView();

        scanner.close();
    }
}
