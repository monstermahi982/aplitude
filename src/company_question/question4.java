package company_question;

class BinarySearchTree{
    class Node{
        int data;
        Node left , right;
        Node(int data){
            this.data= data;
            left = right = null;
        }
    }
    Node root;

    BinarySearchTree(){
        root = null;
    }

    void insert(int value){
        root = insertNode(root , value);
    }

     Node insertNode(Node root, int value) {
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.data > value){
            root.left = insertNode(root.left,value);
        }else if(root.data < value){
            root.right = insertNode(root.right , value);
        }

        return root;
    }


    void inorder(){
        inorderNode(root);
    }

     void inorderNode(Node root) {
        if(root != null){
            inorderNode(root.left);
            System.out.println(root.data);
            inorderNode(root.right);
        }
    }

}

public class question4 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();
    }
}
