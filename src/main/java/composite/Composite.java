package composite;

import java.util.ArrayList;
import java.util.List;

//树节点
public class Composite implements Component{

    String name;

    List<Component> elements = new ArrayList<Component>();

    Composite(String name) {
        this.name = name;
    }

    void add(Component component){
        elements.add(component);
    }

    void remove(Component component) {
        elements.remove(component);
    }

    public void process() {
        //process 当前的节点

        //process leaf 节点
        for (Component component : elements) {
            component.process();
        }

    }
}
