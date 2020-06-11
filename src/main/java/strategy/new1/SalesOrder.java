package strategy.new1;

public class SalesOrder {
    private TaxStrategy strategy;

    SalesOrder(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public void CalculateTax() {
        strategy.Calculate();
    }
}
