# observer 场景说明

当要读取文件，并在界面展示进度时，最开始的做法是直接在读取文件 `FileSplitter` 类中，直接对进度条设置当前的值，
但现在也想在控制台打印，就需要动原有的逻辑

利用观察者模式，在 `FileSplitter` 中直接通知观察者，它不关心有几个观察者，也不关心接到通知后会做什么，它只负责通知，
而当有新的观察者想订阅通知时，只需要实现 `IProgressBar` 接口，并添加为观察者