package factorymethod.new1;

public class MainForm {
    private SplitterFactory mFactory;

    public MainForm(SplitterFactory factory) {
        this.mFactory = factory;
    }

    public void buttonClick() {
        ISplitter splitter =
                mFactory.createSplitter();
    }
}
