package factorymethod.old;

import factorymethod.old.imp.TxtSplitter;

public class MainForm {
    public void buttonClick() {
        ISplitter splitter =
                new TxtSplitter(); //依赖了具体实现类
        splitter.split();
    }
}
