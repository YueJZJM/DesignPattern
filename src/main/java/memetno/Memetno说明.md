# Memetno 说明

在程序运行过程中，我们想保存程序的一些状态，就算对象状态更改后，也能恢复其某个时刻的状态。

如下代码所示，`Caretaker` 中存放了一个临时的对象，当要恢复时，只需要将这个临时的对象取值再重新对对象赋值即可
```
public static void main(String[] args) {
    Originator originator = new Originator();
    Caretaker caretaker = new Caretaker();
    //改变发起人对象的状态
    originator.setState("On");
    //创建备忘录对象，并将发起人对象的状态存储起来
    caretaker.saveMemento(originator.createMemento());
    //修改发起人对象的状态
    originator.setState("Off");
    //恢复发起人对象的状态
    originator.restoreMemento(caretaker.retrieveMenento());

    //发起人对象的状态
    System.out.println("发起人对象的当前状态为：" + originator.getState());

}
```