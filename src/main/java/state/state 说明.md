# state 场景说明

## old

比如有一个网络操作的场景，当打开、关闭、连接的场景下，会执行不同的事情，并且执行完成后，是不同的效果，如下代码
所示：
```java
public void operation1() {
    if (state == Network_Open){

        //**********
        state = Network_Close;
    }
    else if (state == Network_Close){

        //..........
        state = Network_Connect;
    }
    else if (state == Network_Connect){

        //$$$$$$$$$$
        state = Network_Open;
    }
}
```

这样带来的问题是如果新增了一个状态 `Network_Wait`，那么就需要增加一个 if 分支，并且会影响所有的逻辑


## new

把所有的行为抽象为一个基类 `NetworkState`，每一种状态，都可以定义为一个具体的类，并继承 `NetworkState`，
然后在操作结束后，返回下一个对象，在使用的时候，直接利用它的返回值就能得到状态，如果新增一个状态，只需要新增
一个类就行了，不会影响其它的行为

```java
public class OpenState extends NetworkState {

    ...

    public NetworkState operation1() {
        //........
        return CloseState.getInstance();
    }

    public NetworkState operation2() {
        //........
        return ConnectState.getInstance();
    }
}

```