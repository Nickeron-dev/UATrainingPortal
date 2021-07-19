package classes;

import java.util.stream.IntStream;

public class CreatingBinaryTree {

        private TreeNode root;

        private class TreeNode {
                private TreeNode left;
                private TreeNode right;
                private int data;
                public TreeNode(int data) {
                        this.data = data;
                }
        }

        public void createBinaryTree() {
                TreeNode first = new TreeNode(1);
                TreeNode second = new TreeNode(2);
                TreeNode third = new TreeNode(3);
                TreeNode fourth = new TreeNode(4);
                TreeNode fifth = new TreeNode(5);

                root = first;   // root ---> first
                first.left = second;
                first.right = third; // second <--- first --- third

                second.left = fourth;
                second.right = fifth;
        }

        public static void main(String... args) { // this declaration gives an opportunity not to give any arguments
                IntStream.of(1, 2, 3, 4).forEach(System.out::println);
                System.out.println("Inclusive: ");
                IntStream.range(1, 10).forEach(System.out::println);
                System.out.println("Inclusive: ");
                IntStream.rangeClosed(1, 10).forEach(System.out::println);
                //System.out.println("With iterate(): ");
                //int variable = 0;
                //IntStream.iterate(0, i -> 10).forEach(System.out::println);

                //IntStream.generate(() -> ThreadLocalRandom.current().nextInt()).limit(5).forEach(System.out::println);
        }

}
