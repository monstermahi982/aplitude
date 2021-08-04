package binary_search_tree;

class Node{
    int key;
    Node left, right;
    Node(int item){
        key = item;
        left = right = null;
    }
}

class binarySearchTree{
    static Node head;

    Node insert(Node node , int data){
        if(node == null)
            return (new Node(data));
        else {
            if(data <= node.key){
                node.left = insert(node.left , data);
            }else if(data >= node.key){
                node.right = insert(node.right , data);
            }
        }
        return node;
    }

    int minValue(Node node){
        Node current = node;
        while (current.left != null){
            current = current.left;
        }
        return (current.key);
    }
}



public class find_node {
    public static void main(String[] args) {
        binarySearchTree tree = new binarySearchTree();
        Node root = null;
        tree.insert(root, 2);
        tree.insert(root, 1);
        tree.insert(root, 3);
        tree.insert(root, 6);
        tree.insert(root, 5);
        System.out.println("minimum node is " + tree.minValue(root));
    }
}
