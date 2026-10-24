import java.util.Objects;

public record BinaryTree<T>(T elt, BinaryTree<T> left, BinaryTree<T> right){

    // Count the nodes in a tree
    public static <T> int countNodes(BinaryTree<T> tree){
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
        preorderHelper(tree, list);
        return list;
    }

    // Preorder helper method to populate the linked list
    public static <T> void preorderHelper(BinaryTree<T> tree, LinkedList<T> list){
        if(tree == null){
            return;
        }
        preorderHelper(tree.right, list);
        preorderHelper(tree.left, list);
        list.push(tree.elt);
    }

    //  Accepts a binary tree & val, checks if the tree has the val, then returns linkedlist of path to val if so
    public static <T> LinkedList<String> findPath(BinaryTree<T> tree, T val){
        if(tree == null){
            return null;
        }
//        if(searchPath(tree, val)){

        if(Objects.equals(tree.elt, val)){
            LinkedList<String> path = new LinkedList<>();
            path.push("here");
            return path;
        }

        LinkedList<String> leftPath = findPath(tree.left, val);
        if(leftPath != null){
            leftPath.push("left");
            return leftPath;
        }

        LinkedList<String> rightPath = findPath(tree.right, val);
        if(rightPath != null){
            rightPath.push("right");
            return rightPath;
        }

        return null;

//        } else {
//            return null;
//        }
    }

    // findPath helper to search through the tree
//    public static <T> boolean searchPath(BinaryTree<T> tree, T val){
//        if(tree == null){
//            return false;
//        }
//        if(tree.elt == null){
//            return false;
//        } else if(Objects.equals(tree.elt, val)){
//            return true;
//        }
//        return searchPath(tree.left, val) || searchPath(tree.right, val);
//    }

}
