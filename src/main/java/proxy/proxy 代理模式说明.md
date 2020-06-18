# proxy 代理模式说明

但在 `ClientApp` 中要用到 `RealSubject` 时，但又不能直接访问 `RealSubject`，就需要建立
`SubjectProxy` 代理类中中间的访问

增加一层间接层，也是软件系统中对许多复杂问题的常见解决方法