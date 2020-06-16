# builder 模式说明

## old

假设要修一所房子，用 step1、step2、step3、step4 四个函数来表示步骤，并且他们之前有先后等顺序，那么可以用
模板方法实现，比如要修石头房时，定义 `StoneHouse` 类继承 `House` 就能实现

## new1

也可以用 builder 模式实现，它比模板方法好处在于能在创建对象时，就把复杂的步骤定义好了

`StoneHouseBuilder` 就是 `StoneHouse` 的构建器，这里把构建的一步又单独抽出来在 `HouseDirector` 中做，
当然也可以直接在 `StoneHouseBuilder` 中做，主要取决于类的复杂度
