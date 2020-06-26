package composite;

public class Leaf implements Component {

    String name;
    Leaf(String s) {
        this.name = s;
    }

    public void process() {
        //process current node
    }
}
