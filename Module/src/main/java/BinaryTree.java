import java.util.Objects;

public record BinaryTree<T>(T elt, BinaryTree<T> left, BinaryTree<T> right){

    // Equals method for BinaryTree
//    public boolean equals(Object obj){
//        if(obj instanceof BinaryTree){
//            BinaryTree other = (BinaryTree)obj;
//            return Objects.equals(this, other);
//        } else {
//            return false;
//        }
//    }

    // Count the nodes in a tree
    public static int countNodes(BinaryTree tree){
        if(tree == null){
            return 0;
        }

        return 1 + countNodes(tree.left()) + countNodes(tree.right());
    }

    // Mirror swap the left and right branches of a tree
    public static <T> BinaryTree<T> mirror(BinaryTree<T> tree){
        if(tree == null){
            return null;
        }
        return new BinaryTree<>(tree.elt, mirror(tree.right), mirror(tree.left));
    }

    // Preorder of BT to LinkedList (BT Top, then Left, then Right)
    public static <T> LinkedList preorder(BinaryTree<T> tree){
        LinkedList<T> list = new LinkedList<>();
        if(tree == null){
            return list;
        }
        return new LinkedList<T>(new Pair(tree.elt, new Pair(tree.left, new Pair(tree.right, null))));
    }

    //

}
