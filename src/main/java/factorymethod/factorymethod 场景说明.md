# factory method 场景说明

假设一个文件分隔的场景，现在需要支持二进制文件、图片文件、文本文件、音频文件的分隔，那么我们可以抽象出
一个 `ISplitter` 接口来，分别创建类实现此接口，比如在在点击切割文本文件的时候，可以利用下面的代码

```java
public class MainForm {
    public void buttonClick() {
        ISplitter splitter =
                new TxtSplitter(); //依赖了具体实现类
        splitter.split();
    }
}
```

虽然 `ISplitter` 是接口，但 `new TxtSplitter()` 是具体的实现类，
所以仍然依赖了具体的实现类，违背了依赖倒置原则，所以现在需要把 `new TxtSplitter()` 变为抽象的接口

现在就可以利用工厂模式，`SplitterFactory` 为工厂的接口,`ISplitter createSplitter` 方法
是创建并返回具体的对象，分别定义一个工厂类实现此接口，所以现在的代码就变为

```
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
```

`mFactory` 具体的类型就需要外部传进来，`MainForm` 中的都是依赖抽象的接口，就没有具体的依赖
其实这个时候就实现了**延迟了具体对象创建**

注意，也只是延迟，并不能阻止它不创建，设计模式很多时候都是把变化局限在某个地方，而不应该在程序中跳来跳去

PS：个人想法，其实这个时候也可以传一个 `ISplitter`，`MainFrom` 中也能实现此效果
