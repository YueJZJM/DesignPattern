# adapter 场景说明

## 有一个老的接口 `IAdaptee`，旧的类 `OldClass` 继承了老接口，现在定义了一个新的接口 `ITarget`，
为了让我们在使用时，不去关注旧的接口，用新定义的接口就行了，那么就需要定义一个 `Adapter` 适配类，实现
新的接口 `ITarget`，并在实现的方法中去调用成员变量 `IAdaptee` 接口中的方法，以符合新接口的定义

```java
//拿到了一个旧的类，但用新的类的接口去实现
IAdaptee adaptee = new OldClass();
ITarget target = new Adapter(adaptee);
target.process();

```