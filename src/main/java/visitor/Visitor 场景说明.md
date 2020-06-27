# Visitor 场景说明

## old

假设随着需求的变化，要对 element 接口增加方法，那么就只有都改造其子类

## new

此时可以采用 visitor 模式，如果需要新增方法，扩展 visitor 新的子类就行，visitor 利用两次多态的解析，但其
最大的缺点是需要 Element 子类固定