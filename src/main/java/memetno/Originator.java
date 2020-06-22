package memetno;

//发起人角色类，发起人角色利用一个新创建的备忘录对象将自己的内部状态存储起来。
public class Originator {
    String state;

    Memento memento;

    public Originator() {

    }

    public Memento createMemento() {
        memento = new Memento(state);
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
