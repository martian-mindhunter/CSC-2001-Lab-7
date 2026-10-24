import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    BinaryTree<Integer> treeA = new BinaryTree<>(4,
            new BinaryTree<>(1,
                    new BinaryTree<>(2, null, null),
                    new BinaryTree<>(3, null, null)),
            new BinaryTree<>(9,
                    new BinaryTree<>(7, null, null),
                    new BinaryTree<>(8, null, null))
    );

    BinaryTree<Integer> treeB = new BinaryTree<>(4,
            new BinaryTree<>(1,
                    new BinaryTree<>(2, null, null),
                    new BinaryTree<>(3, null, null)),
            new BinaryTree<>(9,
                    new BinaryTree<>(7, null, null),
                    new BinaryTree<>(8, null, null))
    );

    @Test
    void testEquals(){
        assertEquals(treeA, treeB);
    }

    @Test
    void testCountNodes(){
        assertEquals(7, BinaryTree.countNodes(treeA));
        assertEquals(1, BinaryTree.countNodes(new BinaryTree<>(null, null, null)));
        assertEquals(0, BinaryTree.countNodes(null));
    }

    @Test
    void testMirror(){
        BinaryTree<Integer> mirrorTree = new BinaryTree<>(4,
                new BinaryTree<>(9,
                        new BinaryTree<>(8, null, null),
                        new BinaryTree<>(7, null, null)),
                new BinaryTree<>(1,
                        new BinaryTree<>(3, null, null),
                        new BinaryTree<>(2, null, null)));
        assertEquals(mirrorTree, BinaryTree.mirror(treeA));
        BinaryTree nullTree = new BinaryTree<>(null, null, null);
        assertEquals(nullTree, BinaryTree.mirror(nullTree));
        assertEquals(null, BinaryTree.mirror(null));
    }

    @Test
    void testPreorder(){
        LinkedList<Integer> list = BinaryTree.preorder(treeA);
        System.out.println(list.stackPair);
        assertEquals(list, new LinkedList<Integer>(new Pair(4,
                new Pair(9, new Pair(8,new Pair(7,
                        new Pair(1,new Pair(3,new Pair(2, null)))))))));

    }

}
