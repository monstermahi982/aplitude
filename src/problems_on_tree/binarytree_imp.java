package problems_on_tree;




public class binarytree_imp {
    static node root = null;
    void insert(int data){
        node newnode = new node(data);
        if(root == null){
            root = newnode;
        }

    }

    public static void main(String[] args) {
        System.out.println("hello monster");
    }
}
