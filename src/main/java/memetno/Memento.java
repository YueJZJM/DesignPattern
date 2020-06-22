package memetno;

//将要保存的对象
public class Memento {
    private String state;

    Memento(String s) {
        this.state = s;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "state='" + state + '\'' +
                '}';
    }
}
