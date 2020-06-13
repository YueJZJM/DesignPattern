# bridge 场景说明

定义了一个 `Messager` 消息类，在里面有登录、发送消息、播放声音等功能，当我们要实现在 pc 和手机上发送消息、
播放声音等事情时，就要分别实现两个类 `MobileMessagerBase` 和 `MobileMessagerBase`，
继承 `Messager` 实现基础的功能，比如发送消息，播放声音等，当 pc 和手机分别有精简版和完整版时，此时每
一端都需要再新增两个类，比如 `MobileMessagerLite` 和 `MobileMessagerPerfect`，
都要继承 `MobileMessagerBase`，并实现业务的操作，比如登录，并且在登录（业务）过程中，会涉及到平台的功能联网，
就需要调用父类 `MobileMessagerBase` 的联网方法。

但我们会发现会增加很多的类，并且有很多重复的代码，此时会想到用组合代替继承的方式，`MobileMessagerLite`
不继承 `MobileMessagerBase`，直接增加一个 `Messager` 的成员变量，在 `MobileMessagerLite` 的方法中，
直接调用 `Messager` 的方法就行了，同时也对 `PCMessagerLite` 做类似的更改，更改后会发现 `PCMessagerLite` 和
`MobileMessagerLite` 是完全一样的，所以此时可以合并为一个类 `MessagerLite`

完整版也是类似的操作，合并为 `MessagerPerfect` 一个类，此时会发现一个新的问题，也就是 `MessagerLite`
中的 `Messager` 对象实际应该是 `PCMessagerBase`，但它是一个抽象类，不能实例化，此时应该把 `Messager`
拆分，拆分为 `Messager` 和 `MessagerImp` 两个类，`Messager` 有登录、发送消息等操作，表示业务逻辑，
`MessagerImp` 有发送消息、连接网络，表示平台操作，之后再让平台的实现类，实现 `MessageImp`，完整版还是精简版消息
实现 `Messager`

最后使用，表示 PC 端实现精简版的登录

```java
MessageImp messageImp = new PCMessagerImp();
Messager messager = new MessagerLite(messageImp);
messager.login("a","c");
```
