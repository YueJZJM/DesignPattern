package strategy.new1;

public class USTax implements TaxStrategy {
    public void Calculate() {
        System.out.println("用美国的税率计算");
    }
}
