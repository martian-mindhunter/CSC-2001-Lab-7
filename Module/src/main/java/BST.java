//import java.util.Objects;
//
//public class BST implements BinaryTree{
//
//
//    // Equals method for BinaryTree
//    public boolean equals(Object obj){
//        if(obj instanceof BinaryTree){
//            BinaryTree other = (BinaryTree)obj;
//            return Objects.equals(this, other);
//        } else {
//            return false;
//        }
//    }
//
//    // Count the nodes in a tree
//    public static int countNodes(BinaryTree tree){
//        int count = 0;
//        if(tree == null){
//            return 0;
//        }
//        while(tree.right() != null){
//            count++;
//        }
//        while(tree.left() != null){
//            count++;
//        }
//        return count;
//    }
//
//}
