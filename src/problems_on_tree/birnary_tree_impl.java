package problems_on_tree;


class node{
    node left, right;
    int data;
    public node(int key){
        data= key;
        right = left = null;
    }
}

class binaryTree{
    node root;
    binaryTree(int data){
        root = new node(data);
    }
    binaryTree(){
        root = null;
    }
}

//     1
//    / \
//   2   3
//  / \ / \
// 4  5 6  7

public class birnary_tree_impl {
    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        tree.root = new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(5);
        tree.root.right.left = new node(6);
        tree.root.right.right = new node(7);
        System.out.println("preorder :- ");
        preoder(tree.root);
        System.out.println();
        System.out.println("inorder :- ");
        inorder(tree.root);
        System.out.println();
        System.out.println("postorder :- ");
        postorder(tree.root);
    }

    static void inorder(node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void preoder(node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preoder(root.left);
        preoder(root.right);
    }
    static void postorder(node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}
