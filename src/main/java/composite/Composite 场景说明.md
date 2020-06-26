# Composite 场景说明

Composite 类表示的是一个树的节点，而 Leaf 表示的是树的叶子节点，Composite 可以再添加其它的节点，而 Leaf 则
不行

此模式主要功能在于 Component 的 process 方法，因为 Composite 和 Leaf 都实现了 Component 接口，
这样在遍历的时候，利用多态实现了 Composite 和 Leaf 的遍历，而不用去判断，把一对多的关系转化为了一对一