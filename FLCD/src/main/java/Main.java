public class Main {
    public static void main(String[] argv) {
        String[] codeLine = {"define","number","number1","=","10",";"};
        Tree tree = new Tree();
        for (int i = 0; i < codeLine.length; i++)
            tree.insert(codeLine[i]);
        tree.inorderTraversal();
        System.out.println();
    }
}