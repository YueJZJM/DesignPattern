package composite;

public class Main {
    public static void main(String args[]) {
        Composite root = new Composite("root");

        Composite treeNode1 = new Composite("treeNode1");
        Composite treeNode2 = new Composite("treeNode2");
        Composite treeNode3 = new Composite("treeNode3");
        Composite treeNode4 = new Composite("treeNode4");

        Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");
        root.add(treeNode1);

        treeNode1.add(treeNode2);
        treeNode2.add(leaf1);

        root.add(treeNode3);
        treeNode3.add(treeNode4);
        treeNode4.add(leaf2);

        root.process();

        leaf2.process();

        treeNode3.process();
    }
}
